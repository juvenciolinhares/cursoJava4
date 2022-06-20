package serializacaoTransiet;

public class Conta implements java.io.Serializable {
	
	//nao armazenar uma variavel de objeto=> modificador transient
	private String cliente;
	
	//como se fosse um private, mas utilizando objetos no lugar de classes(evita a visualização de dados sensiveis).
	transient private double saldo;//o saldo aparece zerado na execução do programa
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {

	}

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public void exibirSaldo() {
		System.out.println(getCliente() + ", seu saldo é de: " + getSaldo());
	}

	// primeiro metodo com parametros:

	void saca(double valor) {

		saldo -= valor;
	}

	void deposita(double valor) {
		saldo += valor;
	}

	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}

	

}
