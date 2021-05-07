package componentes;

public class LampadaFluorescente extends Lampada{

	private double comprimentoLampada;

	public LampadaFluorescente(int numeroWatts, double comprimentoLampada) {
		super(numeroWatts); 
		this.comprimentoLampada = comprimentoLampada;
	}

	public double getComprimentoLampada() {
		return comprimentoLampada;
	}

	public void setComprimentoLampada(double comprimentoLampada) {
		this.comprimentoLampada = comprimentoLampada;
	}
	
	
	
	
	
}
