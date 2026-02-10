package unidad8Interfaces.Pruebas.FlotaVehiculo;

import java.util.Arrays;

import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Coches;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Furgoneta;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Motos;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Vehiculo;
import unidad8Interfaces.ejRepasoFlotaVehiculos.modelo.Cilindrada;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Cambio;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.Capacidad;
import unidad8Interfaces.Pruebas.FlotaVehiculo.modelo.ComparaAnios;

public class Main {

	private static Vehiculo[] vehiculo = new Vehiculo[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coches c1 = new Coches(101, "Toyota", "Corolla", 2019, 0, Cambio.manual);
		Coches c2 = new Coches(102, "BMW", "Serie 3", 2022, 0, Cambio.automatico);
		Coches c3 = new Coches(103, "Seat", "Ibiza", 2018, 0, Cambio.manual);

		Furgoneta f1 = new Furgoneta(301, "Ford", "Transit", 2017, Capacidad.mediana);
		Furgoneta f2 = new Furgoneta(302, "Mercedes", "Sprinter", 2020, Capacidad.pesada);

		aniadir(c1);
		aniadir(c2);
		aniadir(c3);
		aniadir(f1);
		aniadir(f2);

		for (Vehiculo v : vehiculo) {
			if (v instanceof Coches) {
				((Coches) v).alquilar();
			}
			if (v instanceof Coches) {
				((Coches) v).calcularPrecio(3);
			}
			if (v instanceof Furgoneta) {
				((Furgoneta) v).alquilar();
			}
		}
		Arrays.sort(vehiculo, new ComparaAnios());
		System.out.println("Comparacionde años");
		mostrar();
	}

	public static void aniadir(Vehiculo v) {
		vehiculo = Arrays.copyOf(vehiculo, vehiculo.length + 1);
		vehiculo[vehiculo.length - 1] = v;
	}

	public static void mostrar() {
		for (Vehiculo v : vehiculo) {
			System.out.println(v);
		}
	}

}
