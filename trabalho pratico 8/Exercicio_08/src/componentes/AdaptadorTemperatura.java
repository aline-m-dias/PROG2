package componentes;

public class AdaptadorTemperatura implements  MedidorCelsiusIF {

	private static MedidorFarenheit temperaturaFarenheit = new MedidorFarenheit();

	@Override
	public double medirTemperatura() {
		return (temperaturaFarenheit.getTemperaturaFarenheit()-32)/1.8;
	}
}
