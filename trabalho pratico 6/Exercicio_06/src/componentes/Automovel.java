package componentes;

public class Automovel  extends Veiculo{

	
	private float litros;
	
	public Automovel(float velocidade, int numPassageiros, int litros) {
		super(velocidade, numPassageiros);
		this.litros=litros;
	}
	
	
	public float getLitros() {
		return litros;
	}


	public void setLitros(float litros) {
		this.litros = litros;
	}
	

	@Override
	public float acelerar(float velocidade) {
		float somaVelocidade= super.getVelocidade() + velocidade;
		super.setVelocidade(somaVelocidade);
		return super.getVelocidade();
	}
	
	@Override
	public  void parar() {
		super.setVelocidade(0);
		System.out.println("veiculo parado");
	}
	
	public void trocarOleo(float litros) {
		this.setLitros(litros);
		System.out.println ("Oleo trocado");
	}

	
}
