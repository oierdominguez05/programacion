package unidad7Herencia.Animales.modelo;

public abstract class Animal {

	protected String sonido;
	private String alimento;
	private String habitat;
	private String nombre;


	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Animal(String sonido, String alimento, String habitat, String nombre) {
		super();
		this.sonido = sonido;
		this.alimento = alimento;
		this.habitat = habitat;
		this.nombre = nombre;
	}

	
	
}
