public class Main {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();

		cc1.abrirConta("Isaac", 20, "Rua Pedestre e-27 Fortaleza", "109310012", "8987996", true, 118297);
		System.out.println();
		cc1.depositar(500);



		ContaPoupanca cp1 = new ContaPoupanca();
		System.out.println();
		cp1.abrirConta("Raiany", 18, "José Marinho 172", "970491133210", "9410492", false, 900297);

		System.out.println();
		cp1.depositar(500);
		System.out.println();
		cp1.transferir(cc1, 100);
		System.out.println();
		cc1.consultarSaldo();
	}

	}