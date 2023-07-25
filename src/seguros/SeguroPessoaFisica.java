package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setcliente("Robeson Vaamonde");
		cc3.setsaldo(9000);
		System.out.println("Cliente: " + cc3.getcliente());
		cc3.exebirSaldo();

	}

}
