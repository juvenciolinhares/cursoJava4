package guiIntroducaoJFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	//cria o metodo construtor da janela:
	public Janela() {
		
		//inicializar uma janela:
		super("MinhaJanela");//chamar o metodo construtor 
		
		//recuperar o container da janela+ adicionar um controle:
		JButton botao = new JButton("clique");//primeiro clico um bota
		getContentPane().add(botao);
		
		//definir a opração padrao para quando o usuário fechar a janela:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando fechar a janela o programa tambem finaliza
		
		//definir atributos da janela:
		//tamanho:
		setSize(300, 300);//pixels
		
		//visibilidade
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		//classe JFrame: representa uma janela
		new Janela();
	}

}
/*Pacote javax.swing: interfaces graficas
 * container: colocar componentes(controles): botoes, imagens, campos de texto
 * toda interface gráfica começa por uma janela
 * GUI: graphical user interface
 * 
 * uma janela pode conter dimensoes, titulos, menus, abrir, fechar, etc
 */
