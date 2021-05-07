package principal;

import componentes.Automovel;
import componentes.Bicicleta;
import componentes.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo bicicleta = new Bicicleta(10,1);
		
		System.out.println(bicicleta.acelerar(5));
		bicicleta.parar();
		
		Veiculo carro = new Automovel(0,5,20);
		
		System.out.println(carro.acelerar(80));
		carro.parar();
	
		Automovel a1 = new Automovel(0,5,20);
		
		a1.trocarOleo(20);
		
		

	}

}
