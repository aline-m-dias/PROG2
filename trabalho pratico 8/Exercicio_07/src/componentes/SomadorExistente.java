package componentes;

import java.util.List;

public class SomadorExistente {

	public int somaLista(List<Integer> list) {
		int result=0;
		
		for(int i:list) {
			result=result+=i;
			
		}
		return result;
	}
}
