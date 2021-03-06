package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Componentes.Empregado;

public class TestaEmpregado {
	
	

	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		List <Empregado> listaEmpregados= new ArrayList<>();
		
		Empregado e1= new Empregado("1", "Jo?o", 2000.00, "12/03/2015");
		Empregado e2= new Empregado("2", "Jose", 1100.00, "12/03/2018");
		Empregado e3= new Empregado("3", "Jo?o", 4000.00, "12/03/2019");
		Empregado e4= new Empregado("4", "maria", 11100.00, "12/03/2020");
		
	   
		listaEmpregados.add(e1);
		listaEmpregados.add(e2);
		listaEmpregados.add(e3);
		listaEmpregados.add(e4);

		
		System.out.println("Lista sem ordenar:");
		
		for(Empregado e: listaEmpregados) {
			System.out.println(e.toString());
		}
		
		Collections.sort(listaEmpregados);
	
		System.out.println("Lista  ordernada:");
		
		for(Empregado e: listaEmpregados) {
			System.out.println(e.toString());
		}
		
		Empregado menorSalario =  Collections.min(listaEmpregados);
		System.out.println ("Funcionario com menor Salario:" +  menorSalario);
		
		Empregado maiorSalario =  Collections.max(listaEmpregados);
		System.out.println ("Funcionario com menor Salario:" +  maiorSalario);
		
		System.out.println ("Funcionario mais experiente:" +  listaEmpregados.get(1));

		System.out.println ("Funcionario menos experiente:" +  listaEmpregados.get(3));
		sc.close();
		
	}
}
