package Examenes.Examen1_2ªev.Punto;

import Examen1_2ªev.Punto.modelo.Punto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe la clase Punto que representa un punto en el plano (con un componente
		 * x y un componente y), con los métodos:
		 * 
		 * Punto(double x, double y): construye un objeto con los datos pasados como
		 * parámetros. void desplazax(double dx): incrementa el componente x en la
		 * cantidad dx. void desplazaY(double dy): incrementa el componente y en la
		 * cantidad dy. void desplaza(double dx, double dy): desplaza ambos componentes
		 * según las cantidades dx (en el eje x) y dy (en el componente y).
		 * doubledistanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea
		 * entre el punto invocante y el punto otro. d = √((x2 - x1)² + (y2 - y1)²)
		 * toString(): muestra por consola la información relativa al punto.
		 */
		
		
		Punto modelo = new Punto(10, 33);
		
		modelo.desplazaX(5);
		modelo.desplazaY(10);
		
		System.out.println(modelo.getX());
		System.out.println(modelo.getY());
		
		System.out.println(modelo);
		System.out.println(modelo.distanciaEuclidea(modelo));
	}

}
