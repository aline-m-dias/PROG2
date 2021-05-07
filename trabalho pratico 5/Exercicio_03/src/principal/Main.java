package principal;

import componentes.Restaurante;

public class Main {

	public static void main(String[] args) {
		
		Restaurante ru = new Restaurante("Ru UFOP", "rua 16", "João Monlevade", "MG",
										 "12343-000", "9999999", "saudavel", 3.00);
		
		System.out.println(ru.getNome());
		
		ru.setCidade("Ouro Preto");
		ru.setTipoComida("comida japonesa");
		
		ru.print();
	}
}
