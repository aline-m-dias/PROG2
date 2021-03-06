package componentes;

import java.util.Scanner;

public class DVD extends Midia   {

	private int nFaixas;
	
	public DVD() {
		super();
	}
	
	public DVD(int codigo, double preco, String nome,int nFaixas) {
		super(codigo, preco,nome);
		this.nFaixas=nFaixas;
	}
	
	
	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}

	@Override
	public String getTipo() {
		return "NOME DA CLASSE:" + this.getClass().getName();
	}
	
	@Override 
	public String getDetalhes() {
		System.out.println("Mostrando capa DVD");
		return super.getDetalhes() + "\n numero de faixas: " + this.getnFaixas();
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
		System.out.println("Digite o numero de faixas");
		this.nFaixas= sc.nextInt();
		
	}
	
	
}
