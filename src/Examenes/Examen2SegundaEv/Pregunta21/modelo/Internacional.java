package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public class Internacional extends Envio implements Especiales{

	private String paisDestino;
	TipoEnvio tipoEnvio;
	private double precioBase;
	public Internacional(int id, String origen, String destino, double peso, String paisDestino, TipoEnvio tipoEnvio) {
		super(id, origen, destino, peso);
		this.paisDestino = paisDestino;
		this.tipoEnvio = tipoEnvio;
		this.precioBase = 5.55;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	public TipoEnvio getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(TipoEnvio tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double precioFinal() {
		return precioBase * tipoEnvio.getMultiplicador();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Internacional [paisDestino=" + paisDestino + ", tipoEnvio=" + tipoEnvio + ", precioBase=" + precioBase
				+ "]";
	}
	@Override
	public void suplemento(double cantidad) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void precioFinalEspeciales() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	

}
