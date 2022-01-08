package projeto_dio_banco_digital;

public class Contas implements ContaInterface {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Contas() {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}
	
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
