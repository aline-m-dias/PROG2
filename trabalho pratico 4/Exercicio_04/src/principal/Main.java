package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import componetes.Blog;
import componetes.Postagem;
import componetes.Usuario;

public class Main {

	public static void main (String [] args) {

		Scanner sc= new Scanner (System.in);
		Usuario user1 = new Usuario(1, "user", "user", "123");
		String login, senha;

		System.out.println("Digite o login do usuario: ");
		login =sc.nextLine();
		System.out.println("Digite a senha do usuario: ");
		senha=sc.nextLine();

		int valida=0;
		if (login.equals(user1.getLogin()) && senha.equals(user1.getSenha()) ) {
			System.out.println("Usuario v?lido");
			valida=1;
		}else {
			System.out.println("Usuario ou senha invalidos");
		}
		
		if (valida!=0) {

			Blog b1= new Blog();
			
			String s = "25/02/2021";
			DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			LocalDate data = LocalDate.parse(s, parser);
			
			Postagem p1 = new Postagem(1," primeiro post", "ol? mundo!",data);
			Postagem p2 = new Postagem(2," segundo post", "eu estudando prog 2! ",data.plusDays(2));
			Postagem p3 = new Postagem(3," terceito post", "amo programar! ",data.plusDays(1));
			Postagem p4 = new Postagem(4," quarto post", "estou estudando aeds! ",data);
		
			b1.adicionarPostagem(p2);
			b1.publicarPostagem(p1);
			b1.publicarPostagem(p2);
			b1.publicarPostagem(p3);
			b1.publicarPostagem(p4);
			
			
			System.out.println("Postagens Publicadas:\n");
			b1.listarPostagemPublicadas();
			
			System.out.println("\n\nTodas Postagens:\n");
			
			b1.listarTodasPostagem();
			
			
			

			sc.close();
		}
		
	}
}
