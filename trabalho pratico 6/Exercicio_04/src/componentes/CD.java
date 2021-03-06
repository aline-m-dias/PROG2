package componentes;

import java.util.Scanner;

public class CD extends Midia {

	private int nMusicas;
	
	public CD() {
		super();
	}
	
	public CD(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		this.nMusicas=nMusicas;
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	
	@Override
	public String getTipo() {
		return "NOME DA CLASSE: " + this.getClass().getName();
	}
	
	@Override 
	public String getDetalhes() {
		System.out.println("Tocando a primeira musica do cd");
		return super.getDetalhes() + "\n numero de musicas : " + this.nMusicas;
	}
	

	
	@Override 
	public void printDados() {
		System.out.println(this.getTipo());
		System.out.println(this.getDetalhes());
	}
	
	@Override
	public void inserirDados() {
	
		Scanner sc= new Scanner (System.in);
		super.inserirDados();
		System.out.println("Digite o numero de musicas");
		this.nMusicas= sc.nextInt();
		
	}
}
