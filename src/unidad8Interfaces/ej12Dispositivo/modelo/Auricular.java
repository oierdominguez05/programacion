package unidad8Interfaces.ej12Dispositivo.modelo;

public class Auricular implements Conectable, Recargable {

	private String marca; 
	private String modelo;
	private double bateria;
	private String tipoConexion;
	private boolean conectado;
	
	

	public Auricular(String marca, String modelo, double bateria, String tipoConexion, boolean conectado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
		this.tipoConexion = tipoConexion;
		this.conectado = false;
	}

	@Override
	public void recargarBateria() {
		bateria = 100;
		System.out.println("Bateria recargada al 100%");
	}

	@Override
	public double verificarNivelBateria() {
		return bateria;
	}

	@Override
	public boolean usarCablePropio() {
		return false;
	}

	@Override
	public void conectar() {
		System.out.println("Auricular conectado");
		conectado = true;
		
	}

	@Override
	public void desconectar() {
		System.out.println("Auricular desconectado");
		conectado = false;
		
	}

	@Override
	public boolean verificarConexion() {
		return conectado;
	}
	
	
	public void cambiarCancion() {
		System.out.println("Cancion cambiada");
	}
	public void ajustarVolumen(int nivel) {
		System.out.println("Volumen ajustado a: " + nivel);
	}
	

}
