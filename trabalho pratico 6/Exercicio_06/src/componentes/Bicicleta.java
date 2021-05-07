package componentes;

public class Bicicleta  extends Veiculo{

	
	public Bicicleta (float velocidade, int numPassageiros) {
		super(velocidade, numPassageiros);
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
}
