package unidad7Herencia.Animales.modelo;

public class Gato extends Felino {

	public Gato(String sonido, String alimento, String habitat, String nombre) {
		super(sonido, alimento, habitat, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", getSonido()=" + getSonido() + ", getAlimento()=" + getAlimento()
				+ ", getHabitat()=" + getHabitat() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
