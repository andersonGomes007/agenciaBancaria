package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setcliente("Leandro Ramos");
		cc1.setsaldo(10000);
		System.out.println("Cliente: " + cc1.getcliente());
		cc1.exebirSaldo();
		cc1.sacar(1000);
		cc1.exebirSaldo();
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");

		Conta cc2 = new Conta();
		cc2.setcliente("Sirlene Sanches");
		cc2.setsaldo(8500);
		System.out.println("Cliente: " + cc2.getcliente());
		cc2.exebirSaldo();
		cc2.depositar(5000);
		cc2.exebirSaldo();
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Transferencia R$");
		System.out.println("Cliente: " + cc1.getcliente());
		System.out.println("Favorecido " + cc2.getcliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getcliente());
		cc1.exebirSaldo();
		System.out.println("Cliente: " + cc2.getcliente());
		cc2.exebirSaldo();
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Relatorio Gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getsaldo(), cc2.getsaldo());
		System.out.println("Saldo Total nas contas: " + relatorio);

	}

}
