package componentes;

import java.util.Scanner;

public class Midia implements iDetalhes{

	private int codigo;
	private double preco;
	private String nome;
	
	public Midia() {
		
	}
	
	public Midia(int codigo, double preco, String nome) {
		this.codigo=codigo;
		this.preco=preco;
		this.nome=nome;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*Retorna uma String com o nome da classe.*/
	public String getTipo() {
		return "NOME DA CLASSE:" + this.getClass().getName();
	}
	
	/*Retorna uma String com as informa??es contidas nos campos.*/
	
	@Override
	public String getDetalhes() {
		return "Codigo: " + this.getCodigo() + 
				"\nPre?o: " + this.getPreco() +
				"\nNome:  " + this.getNome();
	}
	
	public void printDados() {
		System.out.println(this.getTipo());
		System.out.println(this.getDetalhes());
	}
	
	public void inserirDados() {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o c?digo");
		this.codigo= sc.nextInt();
		System.out.println("Digite o pre?o");
		this.preco=sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome");
		this.nome=sc.nextLine();
		
	}
}
