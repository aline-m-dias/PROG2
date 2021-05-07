package Principal;

import java.util.Scanner;

public class Main {

	public static int negativos(float vet []) {
		
		int i;
		int cont=0;
		for (i=0; i<vet.length; i++) {
			if(vet[i]<0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static void main(String [] args) {
		
		int n;
		System.out.println ("digite o tamanho do vetor");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		float vet[]= new float[n];
		for (int i=0; i<vet.length; i++) {
			System.out.println("Digite um numero");
			vet[i]= sc.nextFloat();
		}
		
		int numNegativos = negativos(vet);
		System.out.println ("o vetor possui " + numNegativos + "  numeros negativos");
		
	}
}
