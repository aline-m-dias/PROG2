package componentes;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	private String nomeDepartamento ;
	private List<Universidade> universidade = new ArrayList<>();

	public Departamento (String nomeDepartamento) {
		this.nomeDepartamento=nomeDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public List<Universidade> getUniversidade() {
		return universidade;
	}

	public void setUniversidade(List<Universidade> universidade) {
		this.universidade = universidade;
	}
	
	
	public String imprime() {
		return this.nomeDepartamento;
	}
	
	
}
