package principal;

import java.util.Scanner;

import componentes.CamaroteInferior;
import componentes.CamaroteSuperior;
import componentes.Normal;

public class Main {

	public static void main(String[]args) {

		Scanner sc = new Scanner (System.in);	

		
		System.out.println("Digite o tipo de ingresso: \n\n 1- para normal \n\n 2-para vip");

		int tipo= sc.nextInt();
		
		switch (tipo){
		case 1:
			Normal i1= new Normal(50);	
			i1.TipoIngresso();
			i1.imprimeValor();
			break;
		case 2: 
		
			System.out.println("Ingresso vip");
			System.out.println("Digite o tipo de camarote: \n\n 1- para superior \n\n 2-para inferior");
			int tipoCamarote=sc.nextInt();
			if (tipoCamarote ==1) {
				CamaroteSuperior i2 = new CamaroteSuperior(80, 30,50);
				System.out.println("Valor ingresso:" + i2.valorIngresso());
			}
			if(tipoCamarote == 2) {
				CamaroteInferior i3 = new CamaroteInferior(80, 30,"vip");
				System.out.println("Valor ingresso:" + i3.valorVip());
			}
			break;
		default:
			System.out.println ("Op??o invalida");
		}
		sc.close();
	}
}
