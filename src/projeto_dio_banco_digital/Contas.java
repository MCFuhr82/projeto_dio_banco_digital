package projeto_dio_banco_digital;

public class Contas implements ContaInterface {

	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroContaCorrente() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(Double valor, Contas conta) {
		// TODO Auto-generated method stub
		
	}

}
