package projeto_dio_banco_digital;

public class Main {

	public static void main(String[] args) {

		Clientes marcelo = new Clientes("Marcelo");
		
		Contas cc = new ContaCorrente(marcelo);
		Contas cp = new ContaPoupanca(marcelo);
		
		cc.depositar(100.00);
		cc.imprimirExtrato();
		System.out.println();
		
		cp.depositar(50.00);
		cp.imprimirExtrato();
		System.out.println();
		
		cc.transferir(60.00, cp);
		
		cp.imprimirExtrato();
		System.out.println();
		cc.imprimirExtrato();
		System.out.println();
		
		cp.sacar(100.00);
		cp.imprimirExtrato();
	}

}
