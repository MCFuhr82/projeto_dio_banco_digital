package projeto_dio_banco_digital;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {

		Clientes marcelo = new Clientes("Marcelo");
		Clientes rodrigo = new Clientes("Rodrigo");

		Contas ccMarcelo = new ContaCorrente(marcelo);
		Contas cpMarcelo = new ContaPoupanca(marcelo);

		Contas ccRodrigo = new ContaCorrente(rodrigo);
		Contas cpRodrigo = new ContaPoupanca(rodrigo);

		ccMarcelo.depositar(100.00);
		ccMarcelo.imprimirExtrato();
		System.out.println();

		cpMarcelo.depositar(50.00);
		cpMarcelo.imprimirExtrato();
		System.out.println();

		ccMarcelo.transferir(60.00, cpRodrigo);

		cpRodrigo.imprimirExtrato();
		System.out.println();
		ccMarcelo.imprimirExtrato();
		System.out.println();

		ccRodrigo.depositar(230.00);
		cpRodrigo.sacar(20.00);
		cpRodrigo.imprimirExtrato();
		System.out.println();

		List<Contas> contas = new ArrayList<>();
		contas.add(ccMarcelo);
		contas.add(cpMarcelo);
		contas.add(ccRodrigo);
		contas.add(cpRodrigo);

		for (Contas conta: contas) {
			System.out.println(conta.cliente.getNome()
					+ ": conta numero " + conta.numeroConta
					+ " com saldo de R$ " + (String.format("%.2f", conta.getSaldo())));
		}
	}

}
