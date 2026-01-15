package unidad6Clases.SistemaSolar.modelo;

public class Planeta {

	
	private String nombre;
	private double cantSatelites;
	private double masa;
	private double volumen;
	private double diametro;
	private double distanciaMedia;

	
	
	
	
	public Planeta(String nombre, double cantSatelites, double masa, double volumen, double diametro, double distanciaMedia) {
		super();
		this.nombre = nombre;
		this.cantSatelites = cantSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaMedia = distanciaMedia;

	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getCantSatelites() {
		return cantSatelites;
	}




	public void setCantSatelites(double cantSatelites) {
		this.cantSatelites = cantSatelites;
	}




	public double getMasa() {
		return masa;
	}




	public void setMasa(double masa) {
		this.masa = masa;
	}




	public double getVolumen() {
		return volumen;
	}




	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}




	public double getDiametro() {
		return diametro;
	}




	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}




	public double getDistanciaMedia() {
		return distanciaMedia;
	}




	public void setDistanciaMedia(double distanciaMedia) {
		this.distanciaMedia = distanciaMedia;
	}


	
	
	public double densidad() {
		double division = getMasa() / getVolumen();
		return division;
	}
	
	
	
}
