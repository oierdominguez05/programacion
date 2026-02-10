package unidad8Interfaces.ej12Dispositivo.modelo;

public class Smartphone implements Conectable, Recargable, Multimedia {

	private String marca;
	private String modelo;
	private double bateria;
	private int almacenamiento;
	private boolean conectado;

	public Smartphone(String marca, String modelo, double bateria, int almacenamiento, boolean conectado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
		this.almacenamiento = almacenamiento;
		this.conectado = false;
	}

	@Override
	public void reproducirContenido() {
		System.out.println("Reproduciendo contenido");

	}

	@Override
	public void pausarReproduccion() {
		System.out.println("Reproduccion pausada");

	}

	@Override
	public void recargarBateria() {
		bateria = 100;
		System.out.println("La bateria esta al: " + bateria + "%");

	}

	@Override
	public double verificarNivelBateria() {
		return bateria;
	}

	@Override
	public boolean usarCablePropio() {
		return true;
	}

	@Override
	public void conectar() {
		conectado = true;
		System.out.println("Dispositivo conectado");

	}

	@Override
	public void desconectar() {
		conectado = false;
		System.out.println("Dispositivo desconectado");

	}

	@Override
	public boolean verificarConexion() {
		return conectado;
	}

	@Override
	public void ajustarVolumen(int nivel) {
		System.out.println("El volumen se ha ajustado a:" + nivel);
	}

	public void realizarLlamadas(int numero) {
		System.out.println("Realizando llamada a: " + numero);
	}

	public void enviarMensajes(int numero, String texto) {
		System.out.println("Enviando mensaje a:" + numero + "con texto: " + texto);
	}

}
