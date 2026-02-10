package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

public class Vehiculo {

	private String matricula;
	private String marca;
	private double precio;
	Combustible combustible;

	public Vehiculo(String matricula, String marca, double precio, Combustible combustible) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.precio = precio;
		this.combustible = combustible;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Vehiculo matricula= " + matricula + ", marca= " + marca + ", precio= " + precio + ", combustible= "
				+ combustible;
	}

	
	
}
