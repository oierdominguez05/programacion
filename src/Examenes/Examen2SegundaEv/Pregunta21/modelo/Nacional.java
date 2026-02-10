package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public class Nacional extends Envio implements Especiales {

	ZonaReparto zonaReparto;
	private double precioBase;

	public Nacional(int id, String origen, String destino, double peso, ZonaReparto zonaReparto) {
		super(id, origen, destino, peso);
		this.zonaReparto = zonaReparto;
		this.precioBase = 5.44;
	}

	public ZonaReparto getZonaReparto() {
		return zonaReparto;
	}

	public void setZonaReparto(ZonaReparto zonaReparto) {
		this.zonaReparto = zonaReparto;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double precioFinal() {

		return precioBase + zonaReparto.getRecargo();

	}
	

	@Override
	public String toString() {
		return super.toString() +"Nacional [zonaReparto=" + zonaReparto + ", precioBase=" + precioBase + "]";
	}


	

	@Override
	public void precioFinalEspeciales() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suplemento(double cantidad) {
		// TODO Auto-generated method stub
		
	}

}
