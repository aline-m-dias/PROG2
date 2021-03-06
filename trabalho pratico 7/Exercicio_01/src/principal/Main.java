package principal;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import componentes.Produto;

public class Main {


	public static void main(String [] args) {

		Scanner sc = new Scanner (System.in);

		int tam=0;
		/*cria  o conjunto set para armazenar a serie de nomes e n?o permite elementos repetidos*/
		Set <String> serieNomes = new  HashSet<>();

		/*trata a excess?o que pode ser gerada se o usu?rio n?o digitar um inteiro*/
		try {
			System.out.println("Quantos nomes deseja digitar:");
			tam = sc.nextInt();
		}catch( InputMismatchException e) {
			System.out.println("op??o inv?lida.");
		}

		String nome;

		/*adiciona nomes na serie de nomes*/
		for(int i=0; i<tam; i++) {

			System.out.println("Digite um nome:");
			nome=sc.next();
			serieNomes.add(nome);
		}

		/*imprime a serie de nomes lidos*/
		System.out.println(serieNomes);


		System.out.println("Digite o nome que deseja remover da serie:");
		nome=sc.next();

		/*testa se o nome est? na serie de nomes para remover, se n?o exibe a mensagem de erro*/
		if(serieNomes.contains(nome)) {
			serieNomes.remove(nome);
		}else {
			System.out.println("Mensagem de erro: nome n?o est? na lista");
		}


		System.out.println(serieNomes);

		/*verifica se determinado nome j? foi armazenado*/

		System.out.println("Qual nome vc deseja verificar se est? na lista:");
		nome=sc.next();

		if (serieNomes.contains(nome)) {
			System.out.println("Nome na lista.");
		}else {
			System.out.println("Nome n?o est? na lista");
		}


		/*verifica se o usu?rio deseja apagar os nomes da lista*/

		System.out.println("Deseja apagar a lista: 1 -sim / n?o");
		int op=sc.nextInt();

		/*apaga todos os nomes*/
		if(op==1) {
			serieNomes.clear();
		}


		System.out.println("------------------------------------");

		Set <Produto> serieProdutos = new  HashSet<>();

		Produto produtoAux = new Produto();

		/*trata a excess?o que pode ser gerada se o usu?rio n?o digitar um inteiro*/
		try {
			System.out.println("Quantos produtos deseja cadrastrar:");
			tam = sc.nextInt();
			for(int i=0; i<tam; i++) {
				System.out.println("Digite o codigo de barras do produto:");
				produtoAux.setCodidoBarra(sc.next());
				System.out.println("Digite o nome do produto:");
				produtoAux.setNome(sc.next());
				System.out.println("Digite o pre?o do produto:");
				produtoAux.setPreco(sc.nextDouble());	
				serieProdutos.add(produtoAux);
				
			}
			
			Produto p =  new Produto ("111","biscoito", 4.50);
			
			
		
			if(serieProdutos.contains(p)) {
				System.out.println("Produto j? est? na lista.");
			}else {
				serieProdutos.add(p);
				System.out.println("Produto inserido na lista.");
			}
			
			for(Produto produto: serieProdutos) {
				System.out.println(produto.toString());
			}
		}catch( InputMismatchException e) {
			System.out.println("op??o inv?lida.");
		}
		
		
		
		sc.close();
	}
}
