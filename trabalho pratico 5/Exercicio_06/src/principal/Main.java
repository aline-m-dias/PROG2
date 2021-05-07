package principal;

import componentes.MIseravel;
import componentes.Pobre;
import componentes.Rica;

public class Main {

	public static void main(String[] args) {
		
		Rica p1 = new Rica("Aline", 18, 1000000);
		Pobre p2 = new Pobre("João", 45);
		MIseravel p3 = new MIseravel("maria", 30);
		
		p1.fazCompras();
		p2.trabalha();
		p3.mendiga();
		
	}
}
