package ioDirectoryEFilesystem;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		//Listar raiz/es
		
		
		Iterable <Path> dirs = FileSystems.getDefault().getRootDirectories();//criou uma vari�vel para pegar os diret�rios raizes
		
		for(Path diretorios : dirs) {
			//percorreu os diretorios que a variavel pegou e imprimiu.
			System.out.println(diretorios);
		}
		
		//Listar conte�dos
		
		Path diretorio = Paths.get("C:\\ws-eclipse\\");
		
		//vejo o conte�do desse diret�rio recuperando uma string de diret�rio:
		
		//como ele vai buscar algo no meu diret�rio, podem haver exce��es, por isso o try catch
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)){
			
			//vou percorrer todo o meu diretorio e imprimir os arquivos que existem nele
			for(Path path : stream) {
				System.out.println(path.getFileName());
			}
		
		}catch(IOException | DirectoryIteratorException e) {
			e.printStackTrace();
			
		}
		
		//Listar parti��es(unidades de armazenamento)
		
		FileSystem fs = FileSystems.getDefault();//variavel fs pega os arquivos padr�o do sistema
		
		
		for (FileStore store : fs.getFileStores()) {
			
			System.out.println("Unidade: " + store.toString());//imprime as unidades C:, F:...
			System.out.println("Total de espaco disponivel: " + store.getTotalSpace());//tamanho da capacidade em bytes
			System.out.println("Total disponivel de espaco: " + store.getUsableSpace());//espaco disponivel
			System.out.println("Quantidade utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));//quantidade utilizada
			
		}

	}

}
