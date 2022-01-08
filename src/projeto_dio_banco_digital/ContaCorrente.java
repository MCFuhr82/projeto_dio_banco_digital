package projeto_dio_banco_digital;

public class ContaCorrente extends Contas {
	
	public ContaCorrente(Clientes cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Saldo da Conta Corrente");
		imprimirAgenciaContaSaldo();
	}
}
