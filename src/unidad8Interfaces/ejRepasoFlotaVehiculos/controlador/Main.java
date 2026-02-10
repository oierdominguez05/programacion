package unidad8Interfaces.ejRepasoFlotaVehiculos.controlador;

import java.util.Arrays;

import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Cambio;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Categoria;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Cilindrada;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Coche;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.ComparaAlquileres;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.ComparaAnios;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Furgoneta;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Moto;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Vehiculo;

public class Main {

	public static Vehiculo[] flota = new Vehiculo[0];

	public static void main(String[] args) {

		Coche c1 = new Coche(7, "Santimovil", "32", 1999, 20, 2, Cambio.manual);
		Coche c2 = new Coche(22, "Guzmanmovil", "A2", 2011, 20, 4, Cambio.automatico);

		Moto m1 = new Moto(13, "Samumoto", "C1", 2001, 15, Cilindrada.cc125);
		Moto m2 = new Moto(1, "PabloMoto", "C1", 2010, 30, Cilindrada.cc50);
		Moto m3 = new Moto(5, "PabloMoto", "C1", 2010, 30, Cilindrada.cc50);

		Furgoneta f1 = new Furgoneta(1, "Furgoneko", "L2", 2016, 50, Categoria.ligera);
		Furgoneta f2 = new Furgoneta(20, "Furgodavid", "G5", 2001, 60, Categoria.pesada);

		aniadirElemento(c1);
		aniadirElemento(c2);
		aniadirElemento(m1);
		aniadirElemento(m2);
		aniadirElemento(m3);
		aniadirElemento(f1);
		aniadirElemento(f2);

		/*
		 * c1.alquilar(); System.out.println(c1.mostrarEstado()); c1.entregar();
		 * System.out.println(c1.mostrarEstado());
		 * System.out.println(c1.calcularPrecio(7));
		 * System.out.println(c2.calcularPrecio(7));
		 */

		// System.out.println(Arrays.toString(flota));

		// =================== NATURAL ID ====================
		Arrays.sort(flota);
		System.out.println(Arrays.toString(flota));

		/*
		 * //====================== POR ALQUILER BASE =====================
		 * ComparaAlquileres ca = new ComparaAlquileres(); Arrays.sort(flota, ca);
		 * System.out.println(Arrays.toString(flota));
		 */

		/*
		 * //========================== POR AÑO ============================
		 * ComparaAnios can = new ComparaAnios(); Arrays.sort(flota, can);
		 * System.out.println(Arrays.toString(flota));
		 */
	}

	public static void aniadirElemento(Vehiculo nuevo) {

		flota = Arrays.copyOf(flota, flota.length + 1);

		flota[flota.length - 1] = nuevo;
	}
}
