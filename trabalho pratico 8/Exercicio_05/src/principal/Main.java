package principal;

import componentes.CarroPopular;
import componentes.CarroSedan;
import componentes.FabricaDeCarro;
import componentes.FabricaFiat;
import componentes.FabricaFord;

public class Main {

	public static void main(String[]args) {
		
		
		System.out.println("Fiat:");
		FabricaDeCarro fabrica = new FabricaFiat();
	    CarroSedan sedan = fabrica.criarCarroSedan();
	    CarroPopular popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    popular.exibirInfoPopular();
	    
	    
		System.out.println("\n\nFord:");
	    fabrica = new FabricaFord();
	    sedan = fabrica.criarCarroSedan();
	    popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    popular.exibirInfoPopular();
	}
}
