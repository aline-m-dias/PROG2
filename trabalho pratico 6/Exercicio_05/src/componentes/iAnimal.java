package componentes;

import java.util.List;

public interface iAnimal {

	public String getNomeEspecie();
	public String getNomeAnimal();
	public List<Animal> filtraEspecie(List<Animal> completo, String especieFiltrar);
	public List<String> classificaEspecies(List<Animal> completo);
	
}

