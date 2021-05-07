package principal;

import componentes.Lampada;
import componentes.LampadaFluorescente;

public class Main {

	public static void main (String [] args) {
		
		Lampada a = new Lampada (30);
		System.out.println(a.getEstadoLampada());
		a.ajusteLampada(100);
		System.out.println(a.estaLigada());
		a.ajusteLampada(0);
		System.out.println(a.estaLigada());
		a.ajusteLampada(100);
		a.ajusteLampada(50); 
		a.ajusteLampada(100);
		System.out.println(a.getQuantidadeVezesAcesa());
		
		Lampada b = new Lampada();
		System.out.println("eh economica:" + b.ehEconomica());
		System.out.println("eh economica:" + a.ehEconomica());
		System.out.println("Numero instancias:" + Lampada.getContador());
		
		System.out.println ("\n\n************* teste exercicio 2 ***************");
		
		LampadaFluorescente a1 = new LampadaFluorescente(60, 1.20);
		
		System.out.println("Comprimento Lampada: " + a1.getComprimentoLampada());
		System.out.println("eh economica: " + a1.ehEconomica());
		System.out.println("está ligada?: " + a1.estaLigada());
		System.out.println("Numero instancias:" +  LampadaFluorescente.getContador());
		
		
		
		
		
	
	}
	
	
	
}
