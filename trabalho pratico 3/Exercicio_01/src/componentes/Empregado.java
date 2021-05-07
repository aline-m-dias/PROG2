package componentes;

public class Empregado {

	private String nome;
	private double salario;
	private int horasTrabalhadas;
	
	/*construtor*/
	public Empregado(String nome, double salario) {
		this.nome=nome;
		this.salario=salario;
		this.horasTrabalhadas=8;
	}
	/*metodos gets e sets*/
	
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
	/*apresenta no console, o nome do empregado, o salario e o numero de horas trabalhadas por dia*/
	public void printInfo() {
		System.out.println("Nome:" + this.nome + "\n Salario:" + this.salario + "\n NUmero de horas trabalhadas por dia:" + this.horasTrabalhadas);
	}
	
	/*Adiciona um percentual de aumento salarial ao empregado*/
	public void promoçao (double percentualAumento) {
		this.salario = this.salario + this.salario*percentualAumento;
	}
	
	/*Adiciona uma gratifica¸c˜ao, fornecida como parˆametro, ao salario do empregado, caso o numero de horas trabalhadas seja maior que 6.*/

	public void adicionaGratificacao(double gratificacao) {
		if (this.horasTrabalhadas>6) {
			this.salario= this.salario+ gratificacao;
			System.out.println("gratificação adicionada ao salario");
		}else {
			System.out.println("gratificação não adicionada ao salario, horas trabalhadas insuficiente");
		}
	}
}
