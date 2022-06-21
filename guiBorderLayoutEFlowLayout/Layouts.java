package guiBorderLayoutEFlowLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//transformar a classe em uma janela(extends JFrame)
public class Layouts extends JFrame {
	
	//construtor:
	public Layouts() {
		//inicializar a janela:
		super("Layouts");
		
//		//recupera o container e atribuir a uma variável:
		Container c = getContentPane();
//		//definir meu proprio layout e atribuir esse layout ao meu container:
//		BorderLayout border = new BorderLayout();
//		c.setLayout(border);
//				
//		
//		//definir a posição dos elementos dentro do container(Border):
//		c.add(BorderLayout.NORTH, new JButton("1"));
//		c.add(BorderLayout.SOUTH, new JButton("2"));
//		c.add(BorderLayout.CENTER, new JButton("3"));
//		c.add(BorderLayout.EAST, new JButton("4"));
//		c.add(BorderLayout.WEST, new JButton("5"));
//		
		
		//criar um FlowLayout e adicionar os componentes:
		c.setLayout(new FlowLayout());//o flowlayout distribui as posições automaticamente de acordo com a ordem de chegada de cada um
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
				
		//definir a operação de fechamento default
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//definir tamanho:
		setSize(300, 300);
		//deixar a janela visivel 
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		//chemar a classe:
		new Layouts();
		

	}

}
/*
 * o layout define a disposição dos elementos na janela
 * layout padrão do JFrame: BorderLayout
 */
