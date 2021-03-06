package componentes;

public class Empregado {
	private String nome;
	private double salario;
	private int horasTrabalhadas;
	
	/*atributo estatico*/
	private static int ContadorEmpregado=0;
	
	
	public Empregado(String nome, double salario) {
		this.nome=nome;
		this.salario=salario;
		this.horasTrabalhadas=8;
		Empregado.ContadorEmpregado++;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
	
		this.nome=nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas=horasTrabalhadas;
	}
	
	/*metodo estatico*/
	public static int getControladorEmpregados() {
		return ContadorEmpregado;
	}
	public void printInfo() {
		System.out.println("Nome:" + this.nome + "\n Salario:" + this.salario + "\n NUmero de horas trabalhadas por dia:" + this.horasTrabalhadas);
	}
	
	public void promo?ao (double percentualAumento) {
		this.salario = this.salario + this.salario*percentualAumento;
	}
	

	public void adicionaGratificacao(double gratificacao) {
		if (this.horasTrabalhadas>6) {
			this.salario= this.salario+ gratificacao;
			System.out.println("gratifica??o adicionada ao salario");
		}else {
			System.out.println("gratifica??o n?o adicionada ao salario, horas trabalhadas insuficiente");
		}
	}
}
