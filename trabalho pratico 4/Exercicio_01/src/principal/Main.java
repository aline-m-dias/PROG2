package principal;

import componentes.Pessoa;
import componentes.Universidade;

public class Main {

	public static void main(String[] args) {
		
		Universidade Princeton = new  Universidade("Princeton ", "Nova Jersey - Estado Unidos da America");
		Universidade Cambridge= new Universidade("Cambridge", "Inglaterra");
		Pessoa AlbertEinstein = new Pessoa (" Albert Einstein ", "14/3/1879",Princeton, "professor de f�sica" );
		Pessoa IsaacNewton = new Pessoa ("Isaac Newton","4/1/1643",Cambridge, "professor de matematica" );
	
		AlbertEinstein.imprime();
		IsaacNewton.imprime();
	
	
	}
}
