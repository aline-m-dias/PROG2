package principal;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double a=0, b=0;
		try {
			System.out.println("Digite o valor de a:");
			a= sc.nextDouble();
			System.out.println("Digite o valor de b:");
			b= sc.nextDouble();
			System.out.println("Resultado:"+ metodo1(a,b));
		}catch(ArithmeticException e) {
			System.out.println("Houve uma excess?o");
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static double metodo1(double a,double b) throws ArithmeticException{
		return metodo2(a,b);
	}
	
	public static  double metodo2(double a, double b) throws ArithmeticException {
		  return a/b;
		 
	}
	
	
}
