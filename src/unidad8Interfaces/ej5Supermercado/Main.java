package unidad8Interfaces.ej5Supermercado;

import unidad8Interfaces.ej5Supermercado.modelo.Calorias;
import unidad8Interfaces.ej5Supermercado.modelo.Cereales;
import unidad8Interfaces.ej5Supermercado.modelo.Detergente;
import unidad8Interfaces.ej5Supermercado.modelo.Productos;
import unidad8Interfaces.ej5Supermercado.modelo.Vino;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Suponga que debe crear distintas clases Java para describir los productos que
		 * vende un supermercado. Para unificar el código de los distintos programadores
		 * del equipo debe crear las siguientes Interfaces Java para describir algunas
		 * características de los productos. • Interfaz EsLiquido o Esta interfaz indica
		 * que los objetos creados a partir de la clase serán íquidos, y tendrá los
		 * siguientes métodos: o public void setVolumen(double v); o public double
		 * getVolumen(); o public void setTipoEnvase(String env); o public String
		 * getTipoEnvase(); • Interfaz EsAlimento o Esta interfaz indica que los objetos
		 * creados a partir de la clase serán o alimentos, y tendrá los siguientes
		 * métodos: o public void setCaducidad(LocalDate fc); o public LocalDate
		 * getCaducidad(); o public int getCalorias(); • Interfaz ConDescuento o Esta
		 * interfaz indicará que el producto tiene descuento e incluirá los siguientes
		 * métodos: o public void setDescuento(double des); o public double
		 * getDescuento(); o public double getPrecioDescuento(); Se pide que programe
		 * las siguientes clases de productos, implementando las interfaces que sean
		 * necesarias: • Clase Detergente o Define una botella de detergente (debe tener
		 * en cuenta que este producto puede tener descuento) o Sus propiedades
		 * principales serán: Marca (String) y Precio (double) o Incluya otras
		 * propiedades según sea necesario a la hora de implementar las interfaces. o
		 * Constructor: Programe un constructor que reciba como parámetros una marca y
		 * un precio. o Programe métodos set y get para la marca y el precio. o Programe
		 * el método toString con todas las características del producto. • Clase
		 * Cereales o Define el producto caja de cereales. (Este producto no tiene
		 * descuentos) o Las propiedades del producto serán Marca, Precio y Tipo de
		 * cereal (String) o Programe un constructor que reciba como parámetros las tres
		 * propiedades anteriores. o Programe los métodos set y get para dichas
		 * propiedades. o Programe los métodos de las interfaces implementadas. (Si es
		 * necesario añada más propiedades a la clase) o A tener en cuenta: las calorías
		 * serán las siguientes: 5 si el cereal es espelta, 8 si es maíz, 12 si es
		 * trigo, y 15 en los demás casos. o Programe el método toString para devolver
		 * una cadena con todas las características del producto. • Clase Vino o Esta
		 * clase describirá el producto botella de vino. (Este producto es susceptible
		 * de tener descuento) o El producto tendrá como propiedades la marca, el tipo
		 * de vino, los grados de alcohol y el precio. o Programe al igual que los
		 * productos anteriores un constructor con estas cuatro propiedades como
		 * parámetros. o Programe también los métodos set, get, toString y los métodos
		 * de las interfaces. Añada nuevas propiedades si es necesario. o A tener en
		 * cuenta: las calorías se calcularán multiplicando por 10 la graduación
		 * alcohólica. Realiza un programa de prueba dónde cree varios productos de cada
		 * clase. Haz un ejemplo de polimorfismo creando un Array de productos
		 * alimenticios y calculando la suma de sus calorías.
		 */

		Vino vino = new Vino("Tinto", 15.6);
		Detergente detergente = new Detergente("Dove", 3.44);
		Cereales cereales = new Cereales("Sin chocolate", Calorias.MAIZ);

		System.out.println(vino);
		System.out.println(detergente);
		System.out.println(cereales);

	}

}
