package contas;


//brunogamacatao@gmail.com
//981164197

public class Conta {
	// Atributos

	private String cliente;

	public String getcliente() {
		return cliente;
	}

	public void setcliente(String cliente) {
		this.cliente = cliente;

	}

	private double saldo;

	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;

	}
	// Construtor

	public Conta() {
		System.out.println("Agencia 0261 ");

	}

	// Metodos
	protected void exebirSaldo() {
		System.out.println("Saldo R$ " + saldo);
	}

	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Debito R$ " + valor);

	}

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Credito R$ " + valor);

	}

	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia R$ " + valor);
	}

	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;

	}

}
