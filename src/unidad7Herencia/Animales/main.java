package unidad7Herencia.Animales;

import unidad7Herencia.Animales.modelo.Gato;
import unidad7Herencia.Animales.modelo.Leon;
import unidad7Herencia.Animales.modelo.Lobo;
import unidad7Herencia.Animales.modelo.Perro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Gato gato = new Gato("Maullido", "Ratones", "Domestico", "Felis silvestris catus.");
		Leon leon = new Leon("Rugido", "Carnivoro", "Pradera", " Panthera leo");
		Lobo lobo = new Lobo("Aullido", "Carnivoro", "Bosque", "Canis Lupus");
		Perro perro = new Perro("Ladrido", "Carnivoro", "Domestico", "Canis lupus familiaris");
		
		System.out.println(gato);
		System.out.println(leon);
		System.out.println(lobo);
		System.out.println(perro);
	}

}
