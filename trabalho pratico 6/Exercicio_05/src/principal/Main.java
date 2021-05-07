package principal;

import java.util.ArrayList;
import java.util.List;

import componentes.Animal;
import componentes.Resultado;

public class Main {

	public static void main(String [] args) {
		
		List <Animal> listaAnimais = new ArrayList<>();
		
		Animal cachorro = new Animal ("mamifero", "cachorro");
		Animal boi = new Animal ("mamifero", "boi");
		Animal lagarto = new Animal ("reptil", "lagarto");
		
		listaAnimais.add(cachorro);
		listaAnimais.add(boi);
		listaAnimais.add(lagarto);
		
	
		Resultado r = new Resultado("mamifero", 2);
		
	
		List <Resultado> result = new ArrayList<>();
		
		
		result= r.numeroAnimais(listaAnimais);
		
		System.out.println("Especies:");
		for (Resultado x: result) {
			System.out.println(x.getNomeEspecie());
		}
		
		
		
	}
}
