package principal;

import componentes.FactoryLanchonete;
import componentes.FactoryLanchoneteCG;
import componentes.FactoryLanchoneteJP;
import componentes.FactoryLanchoneteRT;

public class Main {

	public static void main(String [] args) {
		
		FactoryLanchonete l1 = new FactoryLanchoneteCG();
		l1.criarSanduiche("Sanduiche com pão integral, queijo prato, presunto de frango,sem verduras");
		
		FactoryLanchonete l2 = new FactoryLanchoneteJP();
		l2.criarSanduiche("Sanduiche com pão frances, queijo mussarela, presunto de frango,com verduras");
		
		FactoryLanchonete l3 = new FactoryLanchoneteRT();
		l3.criarSanduiche("Sanduiche com pão bola, queijo cheddar, presunto de peru,sem verduras");
		
	}
}
