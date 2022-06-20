package ioCheckDeleteCreateCopyMove;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		/*
		 * C�GIDO COMENTANDO POR QUE NO FINAL EXCLUIU O ARQUIVO TEXTO.TXT
		 * 
		 * Path path = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\texto.txt");
		 * 
		 * atributos: System.out.println(Files.exists(path)); existencia
		 * System.out.println(Files.isDirectory(path)); diretorio
		 * System.out.println(Files.isRegularFile(path)); arquivo regular
		 * System.out.println(Files.isReadable(path)); pode ser lido
		 * System.out.println(Files.isExecutable(path));pode ser executado
		 * System.out.println(Files.size(path)); tamanho(precisa lan�ar a exce��o IO)
		 * System.out.println(Files.getLastModifiedTime(path)); ultima vez que foi
		 * modificado System.out.println(Files.getOwner(path)); dono do arquivo
		 * System.out.println(Files.probeContentType(path));tipo de arquivo (texto,
		 * imagem, etc.)
		 * 
		 * Exclus�o de arquivos:
		 * 
		 * tenta excluir, se der erro lan�a exce��es(NOSuchFileException;
		 * DirectoryNotEmptyException; IOException; SecurityException)
		 * Files.delete(path);
		 * 
		 * excluir se o arquivo existir Files.deleteIfExists(path);
		 */

		Path path = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\fontes.txt");

		// CREATE ARCHIVE:

		// deletar arquivo criado:
		Files.deleteIfExists(path);

		// criar
		Files.createFile(path);// cria arquivo em branco

		// escrever no arquivo:
		Files.write(path, "Meu Texto".getBytes());

		// C�PIA(uma c�pia � um outro destino)

		Path copia = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\copia.txt");

		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING); // informar a fonte, o caminho , posso informar
																		// op��es de c�pias

		// MOVER (mover tamb�m � para um outro caminho):
		Path mover = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\move\\fonte.txt");

		// vou criar o novo diret�rio(move)
		Files.createDirectories(mover.getParent());

		// mover
		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);

	}

}
/*
 * replace_existing: sobrescrever caso ja exista
 */
