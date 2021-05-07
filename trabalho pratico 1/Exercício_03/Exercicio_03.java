package Principal;

import java.util.Scanner;

public class Main {
	
	public static int recurssiva (int n) {
		
		if (n==1 || n==2) {
			return n;
		}
		else {
			return 2*recurssiva (n-1) + 3* recurssiva(n-2);
		}
	}

	public static void main (String [] args) {
		
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero:");
		n=sc.nextInt();
		System.out.println ("Sequencia do numero " + n + ": " + recurssiva(n));
		sc.close();
	}
}
