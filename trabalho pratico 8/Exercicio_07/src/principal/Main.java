package principal;

import componentes.AdapterSomador;
import componentes.Cliente;
import componentes.SomadorEsperado;

public class Main {


	public static void main(String []args) {
		
		SomadorEsperado e= new AdapterSomador();
		Cliente cliente = new Cliente(e);
		cliente.executar();
	}
	
}
