package componentes;

public class Produto {

	
	private String codidoBarra;
	private String nome;
	private double preco;
	
	public Produto() {
		
	}
	
	public Produto(String codigoBarra, String nome, double preco) {
		this.codidoBarra=codigoBarra;
		this.nome=nome;
		this.preco=preco;
	}

	public String getCodidoBarra() {
		return codidoBarra;
	}

	public void setCodidoBarra(String codidoBarra) {
		this.codidoBarra = codidoBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		 return this.getCodidoBarra().charAt(0);
	}
	

	@Override
	public boolean equals(Object obj) {
		
		Produto  p = (Produto) obj;
		if (codidoBarra != null) {
			if(codidoBarra.equals(p.codidoBarra))
			    return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Produto [codidoBarra=" + codidoBarra + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
	
}

