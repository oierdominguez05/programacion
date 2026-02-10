package unidad8Interfaces.Pruebas.Dispositivo.modelo;

public class Movil extends Dispositivo implements Conectable{

	private int memoriaGB;
	private boolean wifi;

	public Movil(String marca, String modelo, double precio, int memoriaGB) {
		super(marca, modelo, precio);
		this.memoriaGB = memoriaGB;
		this.wifi = false;
	}
	
	
	public void instalarApp(String nombre) {
		
	}


	@Override
	public void conectarWifi() {
		wifi = true;
		
	}
	
	
}
