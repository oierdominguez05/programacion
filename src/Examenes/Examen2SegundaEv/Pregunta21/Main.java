package Examenes.Examen2SegundaEv.Pregunta21;

import java.util.Arrays;


import Examenes.Examen2SegundaEv.Pregunta21.modelo.Envio;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.Internacional;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.Nacional;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.TipoEnvio;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.ZonaReparto;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.CompararPeso;
import Examenes.Examen2SegundaEv.Pregunta21.modelo.CompararPrecioBase;

public class Main {

	private static Envio[] envio = new Envio[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nacional nacional1 = new Nacional(234, "Madrid", "Sevill", 234565, ZonaReparto.ZONA_1);
		Nacional nacional2 = new Nacional(445, "Bilbao", "Barcelona", 555467, ZonaReparto.ZONA_2);
		Internacional inter1 = new Internacional(233, "Paris", "Burdeos", 4644, "Francia", TipoEnvio.ECONOMICO);
		anadir(nacional1);
		anadir(nacional2);
		anadir(inter1);

		Arrays.sort(envio);
		System.out.println("Ordenacion por envio");
		mostrar();

		Arrays.sort(envio, new CompararPeso());
		System.out.println("Ordenacion por peso");
		mostrar();

		Arrays.sort(envio, new CompararPrecioBase());
		System.out.println("Ordenador por precio base");
		mostrar();
	}

	public static void anadir(Envio d) {
		envio = Arrays.copyOf(envio, envio.length + 1);
		envio[envio.length - 1] = d;
	}

	public static void mostrar() {
		for (Envio e : envio) {
			System.out.println(e);
		}
	}

}

/*
 * Sistema de gestión de envíos de una empresa de logística
 * 
 * Una empresa de logística quiere desarrollar una aplicación en Java para
 * gestionar los envíos que registra diariamente.
 * 
 * La empresa trabaja con distintos tipos de envíos, pero todos ellos comparten
 * una serie de datos comunes que deben poder tratarse de forma conjunta.
 * 
 * De todo envío, la empresa necesita almacenar obligatoriamente:
 * 
 * Un código identificativo numérico El origen El destino El peso del envío (en
 * kilogramos) Tipos de envíos
 * 
 * 1. Envíos nacionales
 * 
 * Los envíos nacionales, además de la información común, tienen asociada una
 * zona de reparto.
 * 
 * Las zonas de reparto están predefinidas y tienen los siguientes recargos
 * fijos:
 * 
 * ZONA_1 → recargo de 5 € ZONA_2 → recargo de 10 € ZONA_3 → recargo de 15 €
 * Además, todo envío nacional tiene un precio base.
 * 
 * El precio final de un envío nacional se calcula como:
 * 
 * precioFinal = precioBase + recargoZona
 * 
 * 2. Envíos internacionales
 * 
 * Los envíos internacionales incluyen:
 * 
 * El país de destino Un tipo de envío Los tipos de envío internacional y sus
 * multiplicadores son:
 * 
 * ECONOMICO → multiplicador 1.10 ESTANDAR → multiplicador 1.25 URGENTE →
 * multiplicador 1.50 Además, todo envío internacional tiene un precio base.
 * 
 * El precio final de un envío internacional se calcula como:
 * 
 * precioFinal = precioBase × multiplicadorTipo
 * 
 * 3. Envíos especiales
 * 
 * Algunos envíos requieren condiciones especiales de transporte.
 * 
 * Estos envíos:
 * 
 * Pueden ser nacionales o internacionales Tienen un suplemento adicional fijo
 * de 20 € Se facturan, por lo que tienen precio final El precio final de un
 * envío especial se calcula como:
 * 
 * precioFinal = precioFinalBase + 20
 * 
 * donde precioFinalBase es el precio calculado como envío nacional o
 * internacional según corresponda.
 * 
 * 4. Envíos informativos (NO facturables)
 * 
 * La empresa también registra envíos informativos, que:
 * 
 * Sirven únicamente para control y trazabilidad No tienen precio No se facturan
 * No se les puede calcular precio final Estos envíos:
 * 
 * Tienen código, origen, destino y peso No participan en ningún cálculo
 * económico Funcionalidades obligatorias
 * 
 * El sistema debe permitir:
 * 
 * Mostrar por pantalla la información completa de cualquier envío. Calcular el
 * precio final únicamente de los envíos que se facturan. Almacenar envíos de
 * distintos tipos en una única estructura común. Ordenar los envíos según los
 * siguientes criterios: Orden natural: por código identificativo, en orden
 * ascendente. Ordenación alternativa 1: por peso, en orden ascendente.
 * Ordenación alternativa 2: por precio base, en orden descendente. (Los envíos
 * informativos no participarán en esta ordenación.) Restricciones técnicas
 * 
 * El programa debe desarrollarse en Java Se debe aplicar programación orientada
 * a objetos Los envíos se almacenarán en una estructura de tamaño fijo Se deben
 * utilizar: Comparable para el orden natural Comparator para las ordenaciones
 * alternativas Se deben usar enumerados con información asociada cuando proceda
 * El diseño debe permitir añadir nuevos tipos de envíos sin modificar el código
 * ya existente Ejecución del programa
 * 
 * Al ejecutar el programa:
 * 
 * Se crearán al menos: 2 envíos nacionales (con distintas zonas) 2 envíos
 * internacionales (con distintos tipos) 1 envío especial 1 envío informativo Se
 * mostrará el listado inicial de envíos. Se mostrará el listado ordenado: Por
 * código (ascendente) Por peso (ascendente) Por precio base (descendente,
 * excluyendo envíos informativos) No es necesario implementar menús ni entrada
 * de datos por teclado.
 * 
 * Indicaciones finales
 * 
 * Los datos se crearán directamente en el código. No se evaluará la interacción
 * con el usuario. Los valores económicos indicados en el enunciado no pueden
 * modificarse.
 */
