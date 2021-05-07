package principal;

import componentes.FabricaDeSanduichesRT;
import componentes.SanduichesIngredientFactoryCG;
import componentes.SanduichesIngredientFactoryJP;

public class Main {

	public static void main(String[] args) {
		
		SanduichesIngredientFactoryCG cg = new SanduichesIngredientFactoryCG();
		cg.factoryMetodos();
		cg.criarPao("pão integral");
		cg.criarPresunto("presunto de frango");
		cg.criarQueijo("queijo prato");
		cg.criarSalada("sem verduras");
		
		FabricaDeSanduichesRT rt = new FabricaDeSanduichesRT();
		rt.factoryMetodos();
		rt.criarPao("pão bola");
		rt.criarPresunto(" presunto de peru");
		rt.criarQueijo("queijo cheddar");
		rt.criarSalada("sem verduras");
		
		
		SanduichesIngredientFactoryJP jp = new SanduichesIngredientFactoryJP();
		jp.factoryMetodos();
		jp.criarPao("pão frances");
		jp.criarPresunto(" presunto de frango");
		jp.criarQueijo("queijo mussarela");
		jp.criarSalada("com verduras");
		
	}
}
