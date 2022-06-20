package serializacaoTransiet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Seraliza {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Ricardo", "Beatriz", "Sandra"};
		
		//armazenar uma conta:
		Conta conta1 = new Conta("Juvencio", 10000.00);
		Conta contaSamuel = new Conta("Samuel", 1.00);
		
		
		//armazenar: biblioteca java IO
		
		//escritado objeto:
		FileOutputStream objetoASerEscrito = new FileOutputStream("C:\\ws-eclipse\\cursoJava2\\files\\objeto.ser");//endereço do arquivo; .ser indica obj serializavel
		
		//gravar objetos:
		ObjectOutputStream objetoASerGravado = new ObjectOutputStream (objetoASerEscrito);
		
		//chamar o metodo que grava um objeto serializavel no endereço.
		objetoASerGravado.writeObject(conta1);
		objetoASerGravado.writeObject(contaSamuel);
		
		
		objetoASerGravado.close();
		
		//Leitura de objeto							\\arquivou que eu quero ler:
		FileInputStream fis = new FileInputStream("C:\\ws-eclipse\\cursoJava2\\files\\objeto.ser");
		
		//ler um objeto serializado:
		ObjectInputStream objetoASerLido = new ObjectInputStream (fis);
		
		Conta c1  = (Conta) objetoASerLido.readObject();
		Conta c2  = (Conta) objetoASerLido.readObject();
		
		
		objetoASerLido.close();
		
		
		c1.exibirSaldo();
		c2.exibirSaldo();
		
	}

}
/*
 * serialização de objetos:
 * salva o objeto e todas as variaveis de instancia
 * objetos serializaveis: implementam a interface serializable, por exemplo: classe string
 * 
 * variávesi de classe não são serializadas, apenas de objetos
 * */
