package componentes;

public class FabricaDeSanduichesRT implements  iSanduichesIngredientFactory,PaoIF, PresuntoIF, QueijoIF, SaladaIF{

	@Override
	public void factoryMetodos() {
		System.out.println(" \nSanduiche rt \n\n");
		
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
