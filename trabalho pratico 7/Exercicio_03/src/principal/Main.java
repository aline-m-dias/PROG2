package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main (String [] args) {
		
		Random aleatorio = new Random();
		
		List <Integer> listaInteiros= new ArrayList<>();
		
		for (int i=0; i<50; i++) {
			
			listaInteiros.add(aleatorio.nextInt(99));
		}
		
		for(int i=0; i<50; i++) {
			System.out.println(listaInteiros.get(i));
		}
		
		int menor= Collections.min(listaInteiros);
		System.out.println("Menor elemento:" + menor);
		System.out.println("Maior elemento:" + Collections.max(listaInteiros) );
		System.out.println("Frenquencia que o menor elemento apareceu na lista:" + Collections.frequency(listaInteiros,menor));
		Collections.sort(listaInteiros);
		
		System.out.println("Lista Ordenada:");
		
		for(int i=0; i<50; i++) {
			System.out.println(listaInteiros.get(i));
		}
		
		
	}
}

