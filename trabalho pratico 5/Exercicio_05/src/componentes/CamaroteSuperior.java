package componentes;

public class CamaroteSuperior  extends Vip{

	private double valorAdicionalCamarote;
	
	public CamaroteSuperior(double valor, double valorAdicional, double valorAdicinalCamarote) {
		super(valor, valorAdicional);
	    this.valorAdicionalCamarote=valorAdicinalCamarote;
	}
	
	public double getValorAdicionalCamarote() {
		return valorAdicionalCamarote;
	}

	public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
		this.valorAdicionalCamarote = valorAdicionalCamarote;
	}

	public double valorIngresso() {
		double soma=0;
		soma += super.valorVip()  + this.getValorAdicionalCamarote();
		return soma;
	}
}
