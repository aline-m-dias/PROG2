package principal;

import java.util.ArrayList;
import java.util.List;

import componentes.CD;
import componentes.DVD;
import componentes.Midia;

public class Main {

	public static void main(String[] args) {
		
		CD cd1 = new CD ();
		DVD dvd1= new DVD();
		DVD dvd2= new DVD();
		
		cd1.inserirDados();
		dvd1.inserirDados();
		dvd2.inserirDados();
		
		 List <Midia> listMidia= new ArrayList<>();
		 listMidia.add(cd1);
		 listMidia.add(dvd1);
		 listMidia.add(dvd2);
		 
		 for (Midia x: listMidia) {
			 x.printDados();
		 }

	}

}
