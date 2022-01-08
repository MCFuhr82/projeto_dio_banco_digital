package projeto_dio_banco_digital;

public class Contas implements ContaInterface {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Clientes cliente;
	
	public Contas(Clientes cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
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
		this.saldo -= valor;
	}

	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Double valor, Contas contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		imprimirAgenciaContaSaldo();
	}

	protected void imprimirAgenciaContaSaldo() {
		System.out.println(String.format("Correntista: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo da conta = %.2f", getSaldo()));
	}
	
	

}
