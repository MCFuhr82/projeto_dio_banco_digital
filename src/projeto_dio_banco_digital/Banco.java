package projeto_dio_banco_digital;

import java.util.List;

public class Banco {
	
	private String name;
	private List<Contas> contas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contas> getContas() {
		return contas;
	}

	public void setContas(List<Contas> contas) {
		this.contas = contas;
	}
	
}
