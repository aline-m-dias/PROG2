package componetes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Blog {

	private List<Postagem> listaPostagem = new ArrayList<>();

	
	public void adicionarPostagem (Postagem postagem) {
		listaPostagem.add(postagem);
	}
	
	public void publicarPostagem(Postagem postagem) {
		
		for(Postagem p: listaPostagem) {
			if (p.getId() == postagem.getId()) {
				listaPostagem.remove(p);
			}
			
		}
		listaPostagem.add(postagem);
	}
	
	public void listarPostagemPublicadas() {
		
		for(Postagem p: listaPostagem) {
			String s = "26/02/2021";
			DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			LocalDate data = LocalDate.parse(s, parser);
			if (p.getDataPublicacao().isBefore(data)){
				    p.imprime();
			}
			
		}
	}
	
	public void listarTodasPostagem() {
		for(Postagem p: listaPostagem) {
				p.imprime();
		}
	}
	
	public void apagarPostagem(Postagem postagem) {
		
		for (Postagem p: listaPostagem) {
			if (p.getId().equals(postagem.getId())) {
				listaPostagem.remove(p);
				System.out.println("Postagem apagada!");
			}
		}
	}
}
