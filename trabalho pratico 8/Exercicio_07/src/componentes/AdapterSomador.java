package componentes;

import java.util.ArrayList;
import java.util.List;

public class AdapterSomador implements SomadorEsperado{

	private static SomadorExistente somador = new SomadorExistente();
	
	List<Integer> list = new ArrayList<Integer>();
	
	@Override
	public int somaVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			list.add(vetor[i]);
		return somador.somaLista(list);
	}

	
}
