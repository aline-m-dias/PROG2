package componentes;

public class FormasGeometricasFactory  {

	public static iFormaGeometrica getForma(String forma){
		if(forma==null)
			return null;
		if(forma.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		} 
		if(forma.equalsIgnoreCase("Triangulo")) {
			return new Triangulo();
		} 
		if(forma.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}
		return null;
	}

	
}
