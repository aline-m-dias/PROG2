package principal;
import java.util.Scanner;

import componentes.Calculadora;

public class Main {

	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		
		//quest�o 1
		Calculadora c1 = new Calculadora();
		char  operacao;
		System.out.println("Digite o primeiro numero:");
		double num1=sc.nextDouble();
		System.out.println("Digite o segundo numero:");
		double num2=sc.nextDouble();
		System.out.println("Qual opera��o voc� deseja (+,-,*,/)");
		operacao=sc.next().charAt(0);


		switch (operacao) {
		case '+':
			System.out.println("A soma dos numeros: " + c1.somar(num1, num2));
			break;

		case '-':
			System.out.println ("A subtra��o dos numeros:" + c1.subtrair(num1, num2));
			break;
		case '*':
			System.out.println("A multiplica��o dos numeros:" + c1.multiplicar(num1, num2));
			break;
		case '/':
			System.out.println(" A divis�o dos numeros:"+ c1.dividir(num1, num2));
			break;
		default:
			System.out.println("Opera��o invalida");

		}
		sc.close();
		
		//fim da quest�o 1
	
		//quest�o 2 opera��es com numeros complexos
		
		System.out.println("(2 + 3i) + (7 + i) =" + "(" + c1.somaReal(2.0, 7.0) + "+" + c1.somaImaginario(3.0, 1.0) + "i)");
		System.out.println("(5 + 4i) * (2 + 2i) =" + "(" +c1.multiplicarReal(5.0, 2.0) + "+" + c1.multiplicarImaginario(4.0,2.0) + "i)");
		System.out.println("(3 + i)/(4 + 2i) =" + "(" + c1.dividirReal(3.0, 4.0) + "+" + c1.dividirImaginario(1.0, 2.0) + "i)");

	    

	}
}
