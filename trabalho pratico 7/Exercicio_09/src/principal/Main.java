package principal;

import java.util.Scanner;

public class Main {
	 static Scanner  sc= new Scanner (System.in);
	 
	public static void main(String[] args) {
		
		try {
			someMethod();
		}catch(Exception e) {
			e.printStackTrace(); //exibe a excessão InputMismatchException
		}
		
		sc.close();
	}

	public static void someMethod() throws Exception{
		someMethod2();
	}
	public static void someMethod2() throws Exception{
		System.out.println("Digite um valor:");
		int a =sc.nextInt();
	}
	
	
}
