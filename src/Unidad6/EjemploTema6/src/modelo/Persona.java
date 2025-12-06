package modelo;

public class Persona {

	private String nombre;      // atributos globales//
	private String apellido;
	private int edad;
	private final String DNI;    // final = datos que en todo el programa no van a cambiar//
	private float estatura;
	
	
	public Persona(String nombre, String apellido, String DNI, float estatura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.estatura = estatura;
	}
	
	public Persona(String nombre, String apellido, String DNI, float estatura, int edad) {
		this(nombre, apellido, DNI, estatura);
		this.edad= edad;
	}
	
	public Persona(String nombre, String apellido, String DNI) {
		this(nombre, apellido, DNI, 0);  // 0 = crear un objeto sin un valor//
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {   //Cambiar un valor por otro//
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			System.out.println("Edad no valida");
		}
	}
	
	public void crecer() {
		edad++;
	}
		
		public String recuperarNombreYApellido() {
			return nombre + " " + apellido;
		}
		
		
	
}
