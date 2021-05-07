package componentes;

public class Calculadora {
	
	
	public double somar (double num1, double num2) {
		return num1+num2;
	}
	public double subtrair(double num1, double num2) {
		return num1 -num2;
	}
	public double dividir(double num1, double num2) {
		return num1/num2;
	}
	public double multiplicar(double num1, double num2) {
		return num1*num2;
	}
	
	public double somaReal (double real1, double real2) {
		return  (real1 +real2 );
	}
	public double somaImaginario(double imaginario1, double imaginario2) {
		return imaginario1 + imaginario2;
	}
	public double subtrairReal (double real1, double real2) {
		return  (real1 -real2 );
	}
	public double subtrairImaginario(double imaginario1, double imaginario2) {
		return imaginario1 - imaginario2;
	}
	public double multiplicarReal (double real1, double real2) {
		return  (real1 *real2 );
	}
	public double multiplicarImaginario(double imaginario1, double imaginario2) {
		return imaginario1 * imaginario2;
	}
	public double dividirReal (double real1, double real2) {
		return  (real1 /real2 );
	}
	public double dividirImaginario(double imaginario1, double imaginario2) {
		return imaginario1 / imaginario2;
	}
	
}