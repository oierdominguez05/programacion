package unidad7Herencia.Animales.modelo;

public class Lobo extends Canidos {

	public Lobo(String sonido, String alimento, String habitat, String nombre) {
		super(sonido, alimento, habitat, nombre);
		
	}

	@Override
	public String toString() {
		return "Lobo [sonido=" + sonido + ", getSonido()=" + getSonido() + ", getAlimento()=" + getAlimento()
				+ ", getHabitat()=" + getHabitat() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
