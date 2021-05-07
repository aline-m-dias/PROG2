package componentes;

public class CamaroteInferior extends Vip {

	private String localizacaoIngresso;
	
	public CamaroteInferior(double valor, double valorAdicional, String localizacaoIngresso) {
		super(valor, valorAdicional);
		this.localizacaoIngresso=localizacaoIngresso;
	}

	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}

	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
	
	public void imprimeLocalozacao() {
		System.out.println("Localização: " + this.localizacaoIngresso);
	}
}
