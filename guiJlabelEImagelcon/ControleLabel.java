package guiJlabelEImagelcon;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel() {
		super("Label");
		
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu Tooltip");//texto que aparece quando passo o mouse em cima do controle
		
		//criar controle de label
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 2);
		
		//criar label mais elaborada://fonte diferenter
		JLabel label = new JLabel("Label Simples");
		
		
		//definir a fonte:
		label.setFont(fonte);
		
		//definir cores:
		label.setForeground(Color.blue);
		
		//utilizar a foto dentro de uma label:
		ImageIcon icon =
			new ImageIcon(getClass().getResource("fotos\\lampada.jpg"));
		JLabel imagem = new JLabel(icon);
		
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());//definir um flowlayout
		c.add(simples);//adicionar label ao container
		c.add(label);
		c.add(imagem);
		
		//definir encerramento, tamanho, visibilidade
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		

	}

}
/*
 * JLabel: indica textos dentro da janela
 */
