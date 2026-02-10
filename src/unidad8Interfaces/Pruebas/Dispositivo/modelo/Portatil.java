package unidad8Interfaces.Pruebas.Dispositivo.modelo;

public class Portatil extends Dispositivo implements Conectable{

	private double tamanio;
	private boolean wifi;

	public Portatil(String marca, String modelo, double precio, double tamanio) {
		super(marca, modelo, precio);
		this.tamanio = tamanio;
		this.wifi = false;
	}
	
	public void abrirPrograma(String nombre) {
		
	}

	@Override
	public void conectarWifi() {
		wifi = true;
		
	}
	
}
