package projeto_dio_banco_digital;

public class ContaPoupanca extends Contas {

	public ContaPoupanca(Clientes cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Saldo da Conta Poupança");
		imprimirAgenciaContaSaldo();
	}
}
