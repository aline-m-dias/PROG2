package principal;

import componentes.Departamento;
import componentes.Pessoa;
import componentes.Universidade;

public class Main {

	public  static  void main(String [] args) {
		
		Departamento d1 = new Departamento("DEELT");
		Departamento d2 = new Departamento("DECOM");
		Departamento d3 = new Departamento("DECEA");
		Departamento d4 = new Departamento("DECSI");
		
		Universidade ufop=  new Universidade ("Ufop", "Jo?o Monlevade");
		Universidade ufv=  new Universidade ("Ufv", "Vicosa");
		
		ufop.filiaDepartamento(d1);
		ufop.filiaDepartamento(d2);
		ufop.filiaDepartamento(d3);
		ufop.filiaDepartamento(d4);
		ufv.filiaDepartamento(d4);
		for (int i= 4; i<50;i++) {
			ufop.filiaDepartamento(new Departamento ("xxxxxx"));
		}
		
		ufop.filiaDepartamento(new Departamento("yyyyyy"));
		
		
		
		Pessoa p1 = new Pessoa ("Joao", "20/01/1980", ufop, "professor de prog 2", d4);
		
		p1.imprime();
		
		System.out.println ("Departamentos da ufop:");
		
		for (Departamento d : ufop.getListaDepartamentos()) {
			System.out.println(d.getNomeDepartamento());
		}
		
		System.out.println ("lista de universidades que possui o departamento DECSI:");
		
		for (Universidade u : d4.getUniversidade()) {
			System.out.println(u.getNome());
		}
	}
	
}

	
