package componentes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universidade {

	private String nome;
	private String endereco;
	
	
     private List <Departamento> listaDepartamentos = new ArrayList<>();
     
     public Universidade(String nome) {
    	 this.nome=nome;
     }
	
	/* relaciona o departamento a universidade por meio da composi??o*/
	 public Universidade(String nome, String endereco, String nomeDepartamento) {
		this.nome=nome;
		this.endereco=endereco;
		this.listaDepartamentos.add(new Departamento (nomeDepartamento));
	}
	
	public Universidade(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;	
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	
	public void filiaDepartamento(Departamento d1) {
		if (listaDepartamentos.size()<50) {
			listaDepartamentos.add(d1);
			d1.getUniversidade().add(new Universidade (this.nome));
		}else {
			System.out.println ("A universidade j? possui 50 departamentos");
		}
		
	}
	
}
