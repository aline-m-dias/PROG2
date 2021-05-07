package principal;

import componentes.Cachorro;
import componentes.Gato;

public class Main {

	public static void main(String[] args) {
		
		Cachorro pinche= new Cachorro ("Bob", "pinche");
		System.out.println( pinche.late());
		
		Gato gato = new Gato("garfild");
		System.out.println(gato.mia());
		
		
		System.out.println( pinche.caminha());
		System.out.println( gato.caminha());
		
	}
}
