package componentes;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

	private String nomeEspecie;
	private int quantidade;

	public Resultado() {
		
	}
	public Resultado (String nomeEspecie, int quantidade) {
		this.nomeEspecie=nomeEspecie;
		this.quantidade=quantidade;
	}


	public String getNomeEspecie () {
		return nomeEspecie ;
	}
	public int getQuantidade () {
		return quantidade ;
	}


	public List<Resultado> numeroAnimais(List <Animal> listaAnimais){
		
		List <Resultado>  resultado = new ArrayList<>();
		int cont =0;
		
		for(Animal x: listaAnimais) {
			
			if (x.classificaEspecies(listaAnimais).equals(x.filtraEspecie(listaAnimais, x.getNomeEspecie()))){
					cont++;
					
			}
		
				Resultado  result = new Resultado (x.getNomeEspecie(), cont);
				resultado.add(result);
				
			}
		
		return resultado;
	}
	
}
