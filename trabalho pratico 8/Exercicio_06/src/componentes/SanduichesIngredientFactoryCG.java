package componentes;

public class SanduichesIngredientFactoryCG  implements  iSanduichesIngredientFactory, PaoIF, PresuntoIF, QueijoIF, SaladaIF{

	@Override
	public void factoryMetodos() {
		System.out.println("Sanduiche cg\n\n");
		
		
	}

	@Override
	public void criarPao(String nome) {
		System.out.print(nome + "- ");
		
	}

	@Override
	public void criarSalada(String nome) {
		System.out.print(nome + "- ");
		
	}

	@Override
	public void criarQueijo(String nome) {
		System.out.print(nome + "- ");
		
	}

	@Override
	public void criarPresunto(String nome) {
		System.out.print(nome + "- ");
		
	}

}
