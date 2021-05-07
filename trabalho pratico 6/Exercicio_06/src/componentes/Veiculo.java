package componentes;

public abstract class Veiculo {

	private float velocidade;
	private  int numPassageiros;
	
	public Veiculo (float velocidade, int numPassageiros) {
		this.velocidade=velocidade;
		this.numPassageiros=numPassageiros;
	}
	
	
	public float getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}


	public int getNumPassageiros() {
		return numPassageiros;
	}


	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}


	public abstract float acelerar(float velocidade);
	public abstract void parar();
}
