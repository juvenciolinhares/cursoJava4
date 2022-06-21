package guiEventosEListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;//extensão da janela

public class Eventos extends JFrame implements ActionListener {
	
	//declarar o botao
	JButton botao;//atributo da classe
	
	//metodo construtor, sobrescrevendo JFrame
	public Eventos () {
		super("Eventos");
		
		//criar o botao que responde açoes e implementar ações pra esse botao
		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);//entende os eventos que o botao vai lançar,executa o método actionPerformed de cada uma das classes
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
 * explicação:
 * quando clico no botao, gera um evento e lança esse evento para cada um dos ActionListener
 * executando os métodos actionPerformed desses listeners
 */
