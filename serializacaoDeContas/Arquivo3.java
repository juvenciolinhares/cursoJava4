package serializacaoDeContas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo3 {
	
		public void armazenarContas(ArrayList<Conta> contas) throws IOException {
			
			
			//escrita do objeto:    										//endereço do arquivo; .ser indica obj serializavel
			try(FileOutputStream objetoASerEscrito = new FileOutputStream("C:\\ws-eclipse\\cursoJava2\\files\\contas.ser")){
				
					//gravar objetos:
				try(ObjectOutputStream objetoASerGravado = new ObjectOutputStream (objetoASerEscrito)){
					
					objetoASerGravado.writeObject(contas);
				}
			}
			
		}
		
		public ArrayList<Conta> recuperarContas() throws Exception {
			
			//Leitura de objeto							\\arquivou que eu quero ler:
			try(FileInputStream fis = new FileInputStream("C:\\ws-eclipse\\cursoJava2\\files\\contas.ser")){
				
					//ler um objeto serializado:
				try(ObjectInputStream objetoASerLido = new ObjectInputStream (fis)){
					return (ArrayList<Conta>)objetoASerLido.readObject();
					
				}
			}
		
		}

		public static void main(String[] args) throws Exception {
			
			ArrayList<Conta> contas = new ArrayList<>();
			contas.add(new Conta("Ricardo", 12000.23));
			contas.add(new Conta("Lawrence", 11050.32));
			contas.add(new Conta("Sandra", 18000.21));
			contas.add(new Conta("Beatriz", 23200.09));
		
			Arquivo3 operacao = new Arquivo3();
			operacao.armazenarContas(contas);
			
			ArrayList<Conta> contas2 = operacao.recuperarContas();
			
			//imprimir as contas: 
			for(Conta conta : contas2) {
				conta.exibirSaldo();
				
			}

		}
		/*
		 * a leitura de objetos serializados é incompreensivel a seres humanos
		 * 
		 * a serialização de objetos simplica o processo de armazenamento e recuperação de dados
		 */

}
