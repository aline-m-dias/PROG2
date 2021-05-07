package principal;

import componentes.Incremental;

public class Main {

	public static void main (String [] args) {
		
		for (int i =0; i<10; i++) {
			Incremental in= Incremental.getIntancia();
			System.out.println(in);
		}
	}
}
