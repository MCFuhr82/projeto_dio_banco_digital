package projeto_dio_banco_digital;

public interface ContaInterface {

    void sacar(Double valor);
	
	void depositar(Double valor);
	
	void transferir(Double valor, Contas conta);
}
