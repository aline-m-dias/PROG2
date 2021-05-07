package principal;

import java.util.ArrayList;
import java.util.List;

import componentes.Pais;

public class Main {

	public static void main(String[] args) {
		
		Pais Brasil= new Pais ("BRA", "Brasil", 209000000, 8514876);
		Pais Chile= new Pais("CHL", "Chile", 19000000,756950);
		Pais Bolivia=new Pais("BOL", "Bolivia",11000000,1099000);
		Pais  Argentina=new Pais("ARG", "Argentina",45000000,2780000);
		Pais Mexico=new Pais("MEX", "Mexico", 126000000,1973000);
		
		Brasil.addPaisFronteira(Chile);
		Brasil.addPaisFronteira(Bolivia);
		Brasil.addPaisFronteira(Argentina);
		
		Chile.addPaisFronteira(Bolivia);
		Chile.addPaisFronteira(Argentina);
		Chile.addPaisFronteira(Brasil);
		
		Brasil.limitrofes(Mexico);
		Brasil.limitrofes(Argentina);
		Brasil.limitrofes(Chile);
		
		System.out.println("Densidade Populacional Brasil:"+ Brasil.densidadePopulacional());
		
		List<Pais> vizinhosComuns=new ArrayList();
		vizinhosComuns= Brasil.vizinhos(Chile);
		
		System.out.println ("Vizinhos Comuns entre Brasil e Chile:");
		for (Pais x: vizinhosComuns) {
			System.out.println(x.getNome());
		}
	}
}
