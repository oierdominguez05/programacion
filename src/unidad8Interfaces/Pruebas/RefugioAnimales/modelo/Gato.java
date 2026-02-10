package unidad8Interfaces.Pruebas.RefugioAnimales.modelo;

public class Gato extends Animal implements Adoptable{

	private String color;
	private boolean adoptado;

	public Gato(String nombre, int edad, double peso, String color) {
		super(nombre, edad, peso);
		this.color = color;
		this.adoptado = false;
	}

	public static void maullar() {
System.out.println("Maullando");
	}

	@Override
	public void adoptar() {
		adoptado = true;
	}
}
