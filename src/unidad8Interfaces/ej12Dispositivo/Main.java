package unidad8Interfaces.ej12Dispositivo;

import unidad7Herencia.Multimedia.modelo.Multimedia;
import unidad8Interfaces.ej12Dispositivo.modelo.Auricular;
import unidad8Interfaces.ej12Dispositivo.modelo.Conectable;
import unidad8Interfaces.ej12Dispositivo.modelo.Smartphone;
import unidad8Interfaces.ej12Dispositivo.modelo.Tablet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Supongamos que necesitas modelar distintos tipos de dispositivos
		 * electrónicos. Debes crear interfaces Java para describir algunas
		 * características comunes de estos dispositivos y luego implementar clases
		 * específicas. • Interfaz Conectable: Crea una interfaz llamada Conectable con
		 * métodos conectar(), desconectar(), y verificarConexion(). Esta interfaz
		 * indica que los objetos creados a partir de la clase serán dispositivos
		 * conectables. • Interfaz Recargable: Define una interfaz Recargable con
		 * métodos recargarBateria(), verificarNivelBateria(), y usarCablePropio(). Esta
		 * interfaz indicará que los objetos creados a partir de la clase serán
		 * dispositivos recargables. • Interfaz Multimedia: Diseña una interfaz
		 * Multimedia con métodos reproducirContenido(), pausarReproduccion(), y
		 * ajustarVolumen(). Esta interfaz indica que los objetos creados a partir de la
		 * clase serán dispositivos multimedia. • Clase Smartphone: Define la clase
		 * Smartphone, que implementa las interfaces Conectable, Recargable, y
		 * Multimedia. o Sus propiedades principales serán Marca (String), Modelo
		 * (String), Batería (double), y Almacenamiento (int). o Constructor: Programa
		 * un constructor que reciba como parámetros la marca, modelo, capacidad de
		 * batería y almacenamiento. o Métodos adicionales: Implementa métodos para
		 * realizar llamadas y enviar mensajes. • Clase Auriculares: Define la clase
		 * Auriculares, que implementa las interfaces Conectable y Recargable. o
		 * Propiedades: Marca (String), Modelo (String), Batería (double), y Tipo de
		 * Conexión (String). o Constructor: Programa un constructor que reciba como
		 * parámetros la marca, modelo, capacidad de batería y tipo de conexión. o
		 * Métodos adicionales: Implementa métodos para cambiar la canción y ajustar el
		 * volumen. Clase Tablet: Crea la clase Tablet, que implementa las interfaces
		 * Conectable y Multimedia. o Propiedades: Marca (String), Modelo (String),
		 * Almacenamiento (int), y Resolución de Pantalla (String). o Constructor:
		 * Programa un constructor que reciba como parámetros la marca, modelo,
		 * almacenamiento y resolución de pantalla. o Métodos adicionales: Implementa
		 * métodos para abrir aplicaciones y reproducir videos. Programa de Prueba: Crea
		 * un programa de prueba donde instancies varios dispositivos de cada clase.
		 * Demuestra el polimorfismo creando un Array de dispositivos conectables y
		 * verifica sus conexiones o capacidad de reproducción según las interfaces
		 * implementadas.
		 */

		Auricular auricular = new Auricular("Apple", "Pro", 20, "Cable", false);
		Smartphone smartphone = new Smartphone("Xiaomi", "Nuevo", 35, 256, false);
		Tablet tablet = new Tablet("Huawei", "antiguo", 525, "14", false);

		Conectable[] conectables = { auricular, smartphone, tablet };

		for (Conectable c : conectables) {
			c.conectar();
			System.out.println("Conectado" + c.verificarConexion());
			c.desconectar();
		}
		
		    for (Conectable c : conectables) {
		        c.conectar();
		        System.out.println("Conectado: " + c.verificarConexion());
		        c.desconectar();
		    }

		    for (Conectable c : conectables) {
		        if (c instanceof Multimedia) {
		            Multimedia m = (Multimedia) c;
		            m.reproducirContenido();
		            m.ajustarVolumen(10);
		            m.pausarReproduccion();
		        }
		    }
		}
}

