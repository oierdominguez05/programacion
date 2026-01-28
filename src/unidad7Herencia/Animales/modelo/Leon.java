package unidad7Herencia.Animales.modelo;

public class Leon extends Felino{

	public Leon(String sonido, String alimento, String habitat, String nombre) {
		super(sonido, alimento, habitat, nombre);
		
	}

	@Override
	public String toString() {
		return "Leon [sonido=" + sonido + ", getSonido()=" + getSonido() + ", getAlimento()=" + getAlimento()
				+ ", getHabitat()=" + getHabitat() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
