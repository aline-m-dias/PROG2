package componentes;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private Universidade universidade;
	private String cargoTrabalho;
	
	public Pessoa (String nome, String dataNascimento, Universidade universidade, String cargoTrabalho) {
		this.nome=nome;
		this.dataNascimento=dataNascimento;
		this.universidade = universidade;
		this.cargoTrabalho=cargoTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCargoTrabalho() {
		return cargoTrabalho;
	}

	public void setCargoTrabalho(String cargoTrabalho) {
		this.cargoTrabalho = cargoTrabalho;
	}
	/*metodo que dira seu nome e em que universidade trabalha*/
	public void imprime() {
		System.out.println("Nome: " + this.getNome() + ", Trabalhou como "  + this.getCargoTrabalho() + " na universidade: " + this.universidade.getNome() + " ( " + this.universidade.getEndereco() + ")" );
	}

	
}
