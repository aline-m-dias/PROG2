package principal;

import java.util.Scanner;

import componentes.Calculator;
import minhasExcessoes.InvalidOperationException;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		Calculator c = new Calculator ();
                double a, b;
		System.out.println("Digite um  primeiro valor:");
		a=sc.nextDouble();
		System.out.println("Digite um  segundo valor:");
		b=sc.nextDouble();
				
		System.out.println("Qual opera��o deseja realizar: 1- div / 2- log10");
		int op= sc.nextInt();
		
		switch (op) {
		 case 1: 
			 try {
				System.out.println("resultado: "+ c.div(a,b));
				
			}catch(InvalidOperationException e) {
				 System.out.println( e.getMensagem());
				 e.printStackTrace();
			}
			 
			 break;
		 case 2:
			 System.out.println("resultado: "+ c.log10(a));
			 break;
		 default:
			 System.out.println("Op��o invalida");
		
		}
		
		/*se remover o tratamento de excess�o ao executar o codigo o java exibe que
		 *  a excess�o InvalidOperationException est� acontecendo*/
		
		
		sc.close();
	}

}
