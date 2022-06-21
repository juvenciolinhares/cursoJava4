package guiEventosEListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;//extens�o da janela

public class Eventos extends JFrame implements ActionListener {
	
	//declarar o botao
	JButton botao;//atributo da classe
	
	//metodo construtor, sobrescrevendo JFrame
	public Eventos () {
		super("Eventos");
		
		//criar o botao que responde a�oes e implementar a��es pra esse botao
		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);//entende os eventos que o botao vai lan�ar,executa o m�todo actionPerformed de cada uma das classes
		getContentPane().add(botao);
		
		//configurar encerramento, tamanho e visibilidade
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		botao.setText("FOI CLICADO");//altera o texto do bota de clique aqui para foi clicado
	}

	public static void main(String[] args) {
		
		new Eventos();
	
	}

}
/*
 * explica��o:
 * quando clico no botao, gera um evento e lan�a esse evento para cada um dos ActionListener
 * executando os m�todos actionPerformed desses listeners
 */
