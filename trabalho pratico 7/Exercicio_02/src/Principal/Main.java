package Principal;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		//Map <chave, valor>
		
		Map<String, String> identificadoresFuncionarios = new HashMap<>();
		
		identificadoresFuncionarios.put("a1234", "Steve Jobs");
		identificadoresFuncionarios.put("a1235", "Scott McNealy");
		identificadoresFuncionarios.put("a1236", "Jeff Bezos");
		identificadoresFuncionarios.put("a1237", "Larry Ellison");
		identificadoresFuncionarios.put("a1238", "Bill Gates");
		
		/*imprime os funcionarios pelo seus respectivos identicadores*/
		for(String chave: identificadoresFuncionarios.keySet()) {
			System.out.println(chave + ":" + identificadoresFuncionarios.get(chave));
		}
		
		/*Tentando recuperar um funcionario cujo ID nao esta mapeado*/
		
		String c="A1234";
	
		busca(identificadoresFuncionarios, c);
		
	}
	
	public static void busca(Map<String, String> identificadores,String c) {
		System.out.println("Chave " + c +" : " +identificadores.get(c.toLowerCase()));
		
	}
}
	


