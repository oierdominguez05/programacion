package unidad8Interfaces.Pruebas.RefugioAnimales.modelo;

public class Perro extends Animal implements Adoptable{

	private String raza;
	private boolean adoptado;
	
	public Perro(String nombre, int edad, double peso, String raza) {
		super(nombre, edad, peso);
		this.raza = raza;
		this.adoptado = false;
	}


	public static void ladrar() {
		System.out.println("Ladrando");
	}


	@Override
	public void adoptar() {
		adoptado = true;
		
	}
	
	
}
