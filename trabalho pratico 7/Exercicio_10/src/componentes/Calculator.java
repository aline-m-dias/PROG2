package componentes;

import minhasExcessoes.InvalidOperationException;

public class Calculator {

	private double a,b;
	
	public Calculator() {
		
	}
	
	public Calculator(double a,double b) {
		this.a=a;
		this.b=b;
	}
	
	public double div (double a, double b) throws InvalidOperationException{
		double r;
		if(b==0) {
			InvalidOperationException e = new InvalidOperationException("não e possivel dividir por zero.");
			throw e;
		}else{
			r =a/b;
		}
		return r;
	}
	
	public double log10(double a) {
		
		return Math.log10(a);
	}
}
