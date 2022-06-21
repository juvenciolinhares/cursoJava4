package guiGridLayoutEComposicao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {
	
	public Layouts2() {
		super("Layouts");
		Container c = getContentPane();//tem por padrao o borderlayout
		/*
		c.setLayout(new BorderLayout(5,5));//como parametro de BorbderLayout defini 5 pixels largura e comprimento
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W"));
		*/
		
		/*
		//construir um gridLayout(recebe os paramentros quantidade de linhas e colunas)
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		//trabalhar com dois layouts ao mesmo tempo, nesse caso BorderLayout + GridLayout:
		
		//definir o borderLayout
		c.setLayout(new BorderLayout());
		
		//criar o Layout que vai receber os botoes(container separado);
		Container c2 = new JPanel();
		
		//definir o GridLayout com 4 linhas e 1 coluna
		c2.setLayout(new GridLayout(4,1));
		
		//adicionar os botoes:
		c2.add(new JButton("ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		//adicionar no container principal(BorderLayout)
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		//colocar a leste o container de botes c2(GridLayout):
		c.add(BorderLayout.EAST, c2);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
			
	}

	public static void main(String[] args) {
		new Layouts2();
		

	}

}
/*
 * objetivo:
 * compor uma interface grafica com mais de um layout
 * 
 * gridLayout:Define um Layout em grades como em linhas x colunas
 */
