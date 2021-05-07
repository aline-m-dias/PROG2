package principal;

import componentes.AdaptadorTemperatura;
import componentes.MedidorCelsiusIF;
import componentes.MedidorFarenheit;

public class Main {

	public static void main(String[] args) {
		
		MedidorFarenheit temperatura = new MedidorFarenheit();
		MedidorCelsiusIF temperaturaCelsius = new AdaptadorTemperatura();
		System.out.println("temperatura em graus celsius:" + temperaturaCelsius.medirTemperatura());
		
	}

}
