package componentes;

import java.util.List;

public interface iFerramentas {

	public List<Animal> filtraEspecie (List<Animal> completo, String especieFiltrar);
	public List<String> classificaEspecies ( List<Animal> completo );
}
