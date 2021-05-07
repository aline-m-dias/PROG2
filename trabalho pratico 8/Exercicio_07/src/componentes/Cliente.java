package componentes;

public class Cliente {

	private SomadorEsperado somador;
	
	public Cliente(SomadorEsperado somador) {
		this.somador=somador;
	}
	
	public void executar() {
		int [] vet = new int [] {1,2,3,4,5,6,7,8,9,10};
		int soma = somador.somaVetor(vet);
		System.out.println("Resultado da soma:" + soma);
	}
}


