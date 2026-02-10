package unidad8Interfaces.Pruebas.Dispositivo;

import java.util.Arrays;

import unidad8Interfaces.Pruebas.Dispositivo.modelo.Dispositivo;
import unidad8Interfaces.Pruebas.Dispositivo.modelo.Movil;
import unidad8Interfaces.Pruebas.Dispositivo.modelo.Portatil;
import unidad8Interfaces.Pruebas.Dispositivo.modelo.CompararPrecio;
import unidad8Interfaces.Pruebas.Dispositivo.modelo.CompararMarca;

public class Main {

	private static Dispositivo[] dispositivo = new Dispositivo[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 🟩 1. Clase base: Dispositivo Todos los dispositivos tienen:
		 * 
		 * marca (String)
		 * 
		 * modelo (String)
		 * 
		 * precio (double)
		 * 
		 * Y deben poder mostrarse por pantalla (toString()).
		 * 
		 * 🟩 2. Tipos de dispositivos 📱 Móvil Además de lo común:
		 * 
		 * memoria interna (int, en GB)
		 * 
		 * puede instalar apps → método instalarApp(String nombre)
		 * 
		 * 💻 Portátil Además de lo común:
		 * 
		 * tamaño de pantalla (double, en pulgadas)
		 * 
		 * puede abrir programas → método abrirPrograma(String nombre)
		 * 
		 * 🟩 3. Interfaz: Conectable Algunos dispositivos pueden conectarse a internet.
		 * 
		 * La interfaz tendrá:
		 * 
		 * java public interface Conectable { void conectarWifi(); } Los móviles
		 * implementan Conectable
		 * 
		 * Los portátiles también implementan Conectable
		 * 
		 * 🟩 4. Comparadores Crear dos comparadores:
		 * 
		 * ✔️ Comparar por precio (de menor a mayor) ✔️ Comparar por marca (orden
		 * alfabético) 🟩 5. Requisitos del programa En el main:
		 * 
		 * Crear un array fijo de tamaño 0 e ir ampliándolo con Arrays.copyOf().
		 * 
		 * Añadir varios móviles y portátiles.
		 * 
		 * Mostrar todos los dispositivos.
		 * 
		 * Llamar a métodos específicos según el tipo:
		 * 
		 * si es Móvil → instalarApp
		 * 
		 * si es Portátil → abrirPrograma
		 * 
		 * Llamar a conectarWifi() en todos los que implementen Conectable.
		 * 
		 * Ordenar por precio y mostrar.
		 * 
		 * Ordenar por marca y mostrar.
		 */
		Movil movil = new Movil("Xiaomi", "Notebook", 12.33, 128);
		Movil movil2 = new Movil("Huawei", "Matebook", 124, 256);

		Portatil portatil = new Portatil("Lenovo", "Loq 15", 868, 565);
		Portatil portatil2 = new Portatil("Acer", "Nitro", 663, 15);

		anadir(movil);
		anadir(movil2);
		anadir(portatil);
		anadir(portatil2);

		for (Dispositivo d : dispositivo) {
			if (d instanceof Movil) {
				((Movil) d).instalarApp("Instagram");
			}
			if (d instanceof Portatil) {
				((Portatil) d).abrirPrograma("Java");
			}
			if(d instanceof Portatil) {
				((Portatil)d).conectarWifi();
			}
		}
		Arrays.sort(dispositivo, new CompararPrecio());
		System.out.println("Comparado por precio");
		mostrar();

		Arrays.sort(dispositivo, new CompararMarca());
		System.out.println("Comparado por marca");
		mostrar();

	}

	public static void anadir(Dispositivo d) {
		dispositivo = Arrays.copyOf(dispositivo, dispositivo.length + 1);
		dispositivo[dispositivo.length - 1] = d;
	}

	public static void mostrar() {
		for (Dispositivo d : dispositivo) {
			System.out.println(d);
		}
	}

}
