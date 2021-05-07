package componentes;

public class Empresa {
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;


	public Empresa() {
		
	}

	public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
		this.nome=nome;
		this.endereco=endereco;
		this.cidade=cidade;
		this.estado=estado;
		this.cep=cep;
		this.telefone=telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void print() {
		System.out.println("\n Nome: " + this.getNome() + 
						   "\n Endereco: " + this.endereco +
						   "\n cidade: " + this.cidade +
						   "\n estado: " + this.estado +
						   "\n cep: " + this.cep+
						   "\n telefone: " + this.telefone);
	}

	
}
