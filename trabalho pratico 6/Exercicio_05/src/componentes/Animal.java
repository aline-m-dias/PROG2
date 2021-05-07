package componentes;

import java.util.ArrayList;
import java.util.List;

public class Animal implements iAnimal,  iFerramentas  {

	private String nomeEspecie;
	private String nomeAnimal;
	
	public Animal(String nomeEspecie, String nomeAnimal) {
		this.nomeEspecie=nomeEspecie;
		this.nomeAnimal=nomeAnimal;
	}

	@Override
	public String getNomeEspecie() {
		return this.nomeEspecie;
	}
	@Override
	public String getNomeAnimal() {
		return this.nomeAnimal;
	}

	@Override
	public List<Animal> filtraEspecie (List<Animal> completo, String especieFiltrar){	
		List <Animal> Animal = new ArrayList<>();

		for( int i = 0; i < Animal.size() ; i++){

			if ( Animal.get(i).getNomeEspecie() == especieFiltrar){

				Animal.add(Animal.get(i));  
			}

		}		

		return Animal;
	}


	@Override
	public List<String> classificaEspecies ( List<Animal>completo ) {
		
		//agrupar nomes das especie em um array
		ArrayList <String> especies = new ArrayList<String>();	  

		for (Animal x: completo) {
				especies.add(x.getNomeEspecie());
		}
		
		return especies;
	}

}
