package componentes;

public class Reta {

	private Ponto a, b;
	
	public Reta (Ponto a, Ponto b) {
		this.a=a;
		this.b=b;
	}
	
	public Ponto getA() {
		return this.a;
	}
	public void setA(Ponto a) {
		this.a=a;
	}
	public Ponto getB() {
		return this.b;
	}
	public void setB(Ponto b) {
		this.b=b;
	}
	
	public double calculaCoeficienteAngular() {
	   double m;  
		m=((this.b.getY()-this.a.getY())/ (this.b.getX()-this.a.getX()));
		
		return m;
	}
	
	public double calculaCoeficienteLinear() {
		
		double n;
		n= (calculaCoeficienteAngular()*this.a.getX() - this.a.getY());
		return n;

	}
	public boolean pertenceAReta(Ponto a) {
		
		boolean pertence=false;
		
		if ((this.calculaCoeficienteAngular()*a.getX()) + (this.calculaCoeficienteLinear())==a.getY()) {
			pertence=true;
		}
		return pertence;
	
	}
	

	public String representacaoReta() {
		return "Equacao da reta:" + this.calculaCoeficienteAngular() + "x  + " + this.calculaCoeficienteLinear();
	}


	public String pontoIntercesao(Reta y) {
		
		if (this.calculaCoeficienteAngular() == y.calculaCoeficienteAngular()) {
			return "retas paralelas";
			
		}else {
			
			double z=( this.calculaCoeficienteLinear() - (y.calculaCoeficienteLinear())) / (y.calculaCoeficienteAngular()	 -this.calculaCoeficienteAngular());
			double x= ( y.calculaCoeficienteAngular() * z + y.calculaCoeficienteLinear());
			
			return  "(" + x + "," + z + ")" ;
		}
			
	}
		
		
		
	
	
}
