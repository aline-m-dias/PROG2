package teste;

import componentes.Empregado;

public class Main {

	public static void main (String [] args) {
		
		Empregado e1 = new Empregado("Jose", 2000.00);
		
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Salario: " + e1.getSalario());
		System.out.println("horas trabalhadas: \n" + e1.getHorasTrabalhadas());
		
		Empregado e2 = new Empregado("João", 1000.00);
		e2.setHorasTrabalhadas(5);
		
		e1.adicionaGratificacao(500);
		
		e2.adicionaGratificacao(500);
		
		e1.promoçao(0.10);
		System.out.println("Funcionario " + e1.getNome() +" recebeu uma promocao, Novo salário: " + e1.getSalario());
		
		e1.printInfo();
		e2.printInfo();
	}
}
