package Examenes.Examen1_2ªev.EmpresaTransporte;

import Examen1_2ªev.EmpresaTransporte.modelo.Caja;
import Examen1_2ªev.EmpresaTransporte.vista.VistaTransporte;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Las empresas de transporte, para evitar daños en los paquetes, embalan todas
		 * sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente
		 * con un ancho, un alto y un fondo y, una vez creada, se mantiene inmutable.
		 * Cada caja lleva pegada una etiqueta, de un máximo de 30 caracteres, con
		 * información útil como el nombre del destinatario, dirección, etc. Implementa
		 * la clase caja con los siguientes métodos:
		 * 
		 * Caja (int ancho, int alto, int fondo, Unidad unidad): que construye una caja
		 * con las dimensiones especificadas, que pueden encontrarse en «cm»
		 * (centímetros) o «m» (metros). double getVolumen(): que devuelve el volumen de
		 * la caja en metros cúbicos. void setEtiqueta(String etiqueta): que modifica el
		 * valor de la etiqueta de la caja. string toString() : que devuelve una cadena
		 * con la representación de la caja.
		 */

		Caja modelo = new Caja(12, 55, 98, null);
		VistaTransporte vista = new VistaTransporte();

		vista.iniciar();
	}

}
