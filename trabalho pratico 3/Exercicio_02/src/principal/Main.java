package principal;

import java.util.Scanner;

import componentes.Matriz;

public class Main {

	public static void main (String [] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Digite quantas linhas ter? a matriz");
		int linha=sc.nextInt();
		System.out.println("Digite quantas colunas ter? a matriz");
		int coluna=sc.nextInt();
		Matriz mat= new Matriz(linha, coluna);
		System.out.println("Numero de linhas:" + mat.getLinha());
		System.out.println("Numero de colunas:" + mat.getColuna());
		mat.preencheMatriz();
		mat.imprimeMatriz();
		mat.modificaPosicaoMatriz();
		System.out.println("matriz Modificada:");
		mat.imprimeMatriz();
		mat.matrizTranposta();
		System.out.println("Matriz Tranposta:");
		mat.imprimeMatriz();
		sc.close();
		
	}
}
