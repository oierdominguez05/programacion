package unidad8Interfaces.Pruebas.TallerMecanico;

import java.util.Arrays;

import unidad8Interfaces.Pruebas.TallerMecanico.modelo.Coche;
import unidad8Interfaces.Pruebas.TallerMecanico.modelo.Combustible;
import unidad8Interfaces.Pruebas.TallerMecanico.modelo.Moto;
import unidad8Interfaces.Pruebas.TallerMecanico.modelo.Vehiculo;
import unidad8Interfaces.Pruebas.TallerMecanico.modelo.CompararMarca;
import unidad8Interfaces.Pruebas.TallerMecanico.modelo.CompararPrecio;
public class Main {

	private static Vehiculo[] vehiculo = new Vehiculo[0];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Clase base: Vehiculo Todos los vehículos tienen:
		 * 
		 * matrícula (String)
		 * 
		 * marca (String)
		 * 
		 * precio reparación (double)
		 * 
		 * tipo de combustible (enum Combustible)
		 * 
		 * Y deben poder mostrarse por pantalla (toString()). 2. Enum: Combustible 3.
		 * Tipos de vehículos 🚗 Coche Además de lo común:
		 * 
		 * número de puertas (int)
		 * 
		 * método abrirMaletero()
		 * 
		 * 🏍 Moto Además de lo común:
		 * 
		 * cilindrada (int)
		 * 
		 * método hacerCaballito() 4. Interfaz: Reparacion java public interface
		 * Reparacion { void reparar(); } Coche implementa Reparacion
		 * 
		 * Moto implementa Reparacion
		 * 
		 * 🟩 5. Comparadores Crear dos comparadores:
		 * 
		 * ✔️ Comparar por precio total (precio + costeExtra del enum) ✔️ Comparar por
		 * marca (orden alfabético) 🟩 6. Requisitos del programa (main) En el main:
		 * 
		 * Crear un array fijo de tamaño 0 e ir ampliándolo con Arrays.copyOf().
		 * 
		 * Añadir varios coches y motos.
		 * 
		 * Mostrar todos los vehículos.
		 * 
		 * Llamar a métodos específicos según el tipo:
		 * 
		 * si es Coche → abrirMaletero()
		 * 
		 * si es Moto → hacerCaballito()
		 * 
		 * Llamar a reparar() en todos los que implementen Reparacion.
		 * 
		 * Ordenar por precio total y mostrar.
		 * 
		 * Ordenar por marca y mostrar.
		 */

		
		Coche coche = new Coche("9834 CCA", "Huinday", 12.000, Combustible.diesel, 5);
		Coche coche1 = new Coche("9834 MNA", "Nissan", 14.000, Combustible.electrico, 5);
		Coche coche2 = new Coche("9834 CFA", "Seat", 11.000, Combustible.gasolina, 5);
		
		
		Moto moto = new Moto("6354HHY", "BMW", 17.000, Combustible.diesel, 3);
		Moto moto1 = new Moto("6354HHY", "BMW", 16.000, Combustible.gasolina, 3);
		Moto moto2 = new Moto("6354HHY", "BMW", 16.000, Combustible.gasolina, 3);
		
		aniadir(coche);
		aniadir(coche1);
		aniadir(coche2);
		aniadir(moto);
		aniadir(moto1);
		aniadir(moto2);
		
		
		for(Vehiculo v : vehiculo) {
			if(v instanceof Coche) {
				((Coche)v).abrirmaletero();
			}
			if(v instanceof Moto) {
				((Moto)v).hacercaballito();
			}
		}
		
		Arrays.sort(vehiculo, new CompararMarca());
		System.out.println("Comparar marca");
		mostrar();
		Arrays.sort(vehiculo, new CompararPrecio());
		System.out.println("Comparar precio");
		mostrar();
	}

	public static void aniadir(Vehiculo v) {
		vehiculo = Arrays.copyOf(vehiculo, vehiculo.length +1);
		vehiculo[vehiculo.length -1] = v;
		}
	
	public static void mostrar() {
		for(Vehiculo v : vehiculo) {
			System.out.println(v);
		}
	}
	
}
