package componentes;

public class FactoryLanchoneteCG  extends FactoryLanchonete{

	@Override
	public void criarSanduiche(String tipo) {
		System.out.println(tipo);	
	}

}
