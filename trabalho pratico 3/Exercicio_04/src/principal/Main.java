package principal;

import componentes.Empregado;

public class Main {

	public static void main(String[]args) {
		
		Empregado e1= new Empregado("jo?o", 2000);
		
		for (int i=0; i<100; i++) {
			new Empregado("jose", 2000);
		}
		
		System.out.println("Total de empregados:" + Empregado.getControladorEmpregados());
	}
}
