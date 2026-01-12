package Herencia.Poligono;

import Herencia.Poligono.modelo.Poligono;
import Herencia.Poligono.modelo.Rectangulo;
import Herencia.Poligono.modelo.Triangulo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa la clase abstracta Poligono, con los atributos base y altura, de
		 * tipo double y el método abstracto double area(). Heredando de Poligono,
		 * implementa las clases no abstractas Triangulo y Rectangulo.
		 */

		Rectangulo rectangulo = new Rectangulo(5, 3);
		Triangulo triangulo = new Triangulo(5, 3);

		System.out.println("Area del rectangulo: " + rectangulo.area());
		System.out.println("Area del triangulo: " + triangulo.area());
	}

}
