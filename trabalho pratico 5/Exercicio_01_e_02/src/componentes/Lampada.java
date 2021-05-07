package componentes;

public class Lampada {

	private String estadoLampada;
	private int numeroWatts;
	private int quantidadeVezesAcesa;
	

	/*atributo estatico*/
	private static int Contador=0;
	
	
	/*Constrututor que recebe como argumentos o numero de watts da lampada*/
	
	public Lampada(int numeroWatts) {
		this.estadoLampada="apagado";
		this.numeroWatts=numeroWatts;
		this.quantidadeVezesAcesa=0;
		Lampada.Contador++;
	}
	/*construtor  sem argumentos, que considera que a lampada tem 60 watts*/
	
	public Lampada() {
		this.estadoLampada="apagado";
		this.numeroWatts=60;
		this.quantidadeVezesAcesa=0;
		Lampada.Contador++;
	}
	

	
	public String getEstadoLampada() {
		return this.estadoLampada;
	}


	public void setEstadoLampada(String estadoLampada) {
		this.estadoLampada = estadoLampada;
	}
	
	public int getNumerowatts() {
		return  this.numeroWatts;
	}
	
	public void setNumeroWatts(int numeroWatts) {
		this.numeroWatts=numeroWatts;
	}

	
	public int getQuantidadeVezesAcesa() {
		return quantidadeVezesAcesa;
	}



	public void setQuantidadeVezesAcesa(int quantidadeVezesAcesa) {
		this.quantidadeVezesAcesa = quantidadeVezesAcesa;
	}

	/*metodo estatico*/
	public static int getContador() {
		return Contador;
	}
	/* metodo que possibilita o ajuste para cada um dos estados da lampada*/
	public void ajusteLampada(int valorLuminosidade) {
		
		if(valorLuminosidade == 0) {
			this.estadoLampada="Apagada";
		}
		else if(valorLuminosidade == 50) {
			this.estadoLampada="Meia Luz";
			this.quantidadeVezesAcesa++;
		}
		else if(valorLuminosidade == 100) {
			this.estadoLampada="Acesa";
			this.quantidadeVezesAcesa++;
		} else {
			System.out.println ("Valor luminosidade inválido");
		}
	}
	
	/*retorna  true se a lampada esta ligada e false caso contrario.*/
	public boolean estaLigada() {
		if (this.estadoLampada == "Acesa" || this.estadoLampada == "Meia Luz" ) {
			
			return true;
		}
		
		return false;
	}
	/*retorna  true se a lampada consumir menos de 40 watts e false caso contrario.*/
	public boolean ehEconomica () {
		if (this.numeroWatts<40) {
			return true;
		}
		return false;
		
	}
}
