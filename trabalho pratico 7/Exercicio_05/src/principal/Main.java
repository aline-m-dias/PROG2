package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main (String []args) {

		Scanner sc = new Scanner (System.in);
		int numero=1;
		double r=0;
		int x,y;
		try {
	      do {

		
				System.out.println ("Eu sei dividir.");
				System.out.println("Informe o primeiro valor:");
				x= sc.nextInt();
				System.out.println("Informe o segundo valor:");
				y= sc.nextInt();
				numero=y;				
				r= x/y;
				System.out.println ("O resultado da divis?o e:" + r);

		  }while(numero !=0);
		}catch(InputMismatchException e) {
			
			System.out.println("Op??o invalida");

		}catch(ArithmeticException e) {
			System.out.println ("Voc? n?o pode dividir por zero");
		}
			sc.close();

		}
	}

