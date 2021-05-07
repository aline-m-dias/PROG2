package Principal;

import java.util.Scanner;

public class Main {


	public static void preenche(int vet[]) {

		int i;
		Scanner sc = new Scanner(System.in);

		for (i=0; i<vet.length; i++) {
			System.out.println ("digite um numero");

			vet[i]=sc.nextInt();
		}

		sc.close();

	}

	public static void primos (int vet[]) {

		int cont;
		for (int i=0; i<vet.length; i++) {
			for (int j=2; j<vet.length; j++) {

				if (vet[i]==2) {
					System.out.println ("Numero primo: " + vet[i] + " - Posição: " + i);
				}

				if (vet[i]%j==0) {
					break;				
				}
				else {
					System.out.println ("Numero primo: " + vet[i] + " - Posição: " + i);
					break;
				}

			}

		}

	}


	public static void main (String [] args)
	{
		int n;
		System.out.println("Digite o tamanho do vetor");	
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int vet[]= new int[n];
		preenche(vet);
		primos(vet);
		sc.close();

	}
}
