package unidad8Interfaces.ej1FiguraEsfera;

import unidad8Interfaces.ej1FiguraEsfera.modelo.Cubo;
import unidad8Interfaces.ej1FiguraEsfera.modelo.Lados;
import unidad8Interfaces.ej1FiguraEsfera.modelo.Piramide;
import unidad8Interfaces.ej1FiguraEsfera.modelo.Prisma;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea las clases Figura, Esfera, Cubo, Pirámide y Prisma. Implementar una
		 * interfaz que defina un método que devuelva el número de lados. Hacer que SOLO
		 * las figuras que tengan lados la implementen.
		 */

		Lados cubo = new Cubo();
		Lados Piramide = new Piramide();
		Lados Prisma = new Prisma();

		System.out.println("Cubo: " + cubo.getNumeroLados() + " lados");
		System.out.println("Piramide: " + Piramide.getNumeroLados() + " lados");
		System.out.println("Prisma: " + Prisma.getNumeroLados() + " lados");
	}

}
