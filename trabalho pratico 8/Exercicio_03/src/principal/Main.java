package principal;

import componentes.FormasGeometricasFactory;
import componentes.iFormaGeometrica;

public class Main {

	public static void main(String[]args) {
		
		FormasGeometricasFactory forma = new FormasGeometricasFactory();
		
		iFormaGeometrica f= forma.getForma("Circulo");
		
		f.desenha();
		
		iFormaGeometrica f1= forma.getForma("Quadrado");
		
		f1.desenha();
		
		iFormaGeometrica f2= forma.getForma("Triangulo");
		
		f2.desenha();
		
		
		
	}
}
