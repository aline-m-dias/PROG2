package componentes;

public class Vip extends Ingresso{

	public double valorAdicional;
	
	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional=valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double valorVip() {
		double soma=0;
		soma= super.getValor() + this.getValorAdicional();
		return soma;
	}
	
}
