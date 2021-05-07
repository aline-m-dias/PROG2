package principal;

import componentes.Ponto;
import componentes.Reta;

public class Main {
	
	public static void main(String[] args) {
		
		Ponto A= new Ponto (2.0,2.0);
		Ponto B= new Ponto(3.0,4.0);
		Reta r = new Reta(A, B);
		
		System.out.println("Coeficiente angular" + r.calculaCoeficienteAngular());
		System.out.println("Coeficiente Linear" + r.calculaCoeficienteLinear());
		
		System.out.println(r.representacaoReta());
		
		Ponto C = new Ponto (3.0, 8.0);
		Ponto D = new Ponto (6.0, 1.0);
		
		System.out.println(r.pertenceAReta(C));
		System.out.println(r.pertenceAReta(D));
		
		Ponto c= new Ponto (3.0,0.0);
		Ponto d= new Ponto(0.0,2.0);
		
		Ponto e= new Ponto (-3.0,0.0);
		Ponto f= new Ponto(-1.5,3.0);
		
		Reta s = new Reta(c, d);
		Reta z = new Reta(e, f);
		
		System.out.println("Coeficiente angular" + s.calculaCoeficienteAngular());
		System.out.println("Coeficiente Linear" + s.calculaCoeficienteLinear());
		System.out.println("Coeficiente angular" + z.calculaCoeficienteAngular());
		System.out.println("Coeficiente Linear" + z.calculaCoeficienteLinear());
		
		System.out.println ("Ponto Intercessão: " + s.pontoIntercesao(z) );
		
     	System.out.println ("Ponto Intercessão: (" + s.pontoIntercesao(s));
		
		
	}

}
