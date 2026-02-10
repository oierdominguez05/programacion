package unidad8Interfaces.ej12Dispositivo.modelo;

public class Tablet implements Conectable, Multimedia {

	private String marca;
	private String modelo;
	private int almacenamiento;
	private String resolucionPantalla;
	private boolean conectado;

	public Tablet(String marca, String modelo, int almacenamiento, String resolucionPantalla, boolean conectado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.almacenamiento = almacenamiento;
		this.resolucionPantalla = resolucionPantalla;
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
	public void ajustarVolumen(int nivel) {
		System.out.println("Volumen ajustado a: " + nivel);

	}

	@Override
	public void conectar() {
		conectado = true;

	}

	@Override
	public void desconectar() {
		conectado = false;

	}

	@Override
	public boolean verificarConexion() {
		return conectado;
	}

	public void abrirAplicacion(String app) {
		System.out.println("Aplicacion: " + app + "abierta");
	}

	public void reproducirVideo(String video) {
		System.out.println("Reproduciendo: " + video);
	}

}
