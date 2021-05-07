package Componentes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Empregado  implements Comparable <Empregado>{

	private String ID;
	private String nome;
	private Double salario;
	private String dataContratado;
	
	public Empregado() {
		
	}
	
	public Empregado(String iD, String nome, Double salario, String dataContratado) {
		
		ID = iD;
		this.nome = nome;
		this.salario = salario;
		this.dataContratado = dataContratado;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDataContratado() {
		return dataContratado;
	}

	public void setDataContratado(String dataContratado) {
		this.dataContratado = dataContratado;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((dataContratado == null) ? 0 : dataContratado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (dataContratado == null) {
			if (other.dataContratado != null)
				return false;
		} else if (!dataContratado.equals(other.dataContratado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public int compareTo(Empregado e) {
		if (this.getSalario() < e.getSalario()) {
			return -1;
		}
		if (this.getSalario() > e.getSalario()) {
			return 1;
		}
		
		return 0;
	}
	
	@Override
	public String toString() {
		return "Empregado [ID=" + ID + ", nome=" + nome + ", salario=" + salario + ", dataContratado=" + dataContratado
				+ "]";
	}
	
	
	
	
	
	
	
}
