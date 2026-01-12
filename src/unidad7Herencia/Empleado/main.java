package unidad7Herencia.Empleado;

import Herencia.Empleado.modelo.Directivo;
import Herencia.Empleado.modelo.Empleado;
import Herencia.Empleado.modelo.Oficial;
import Herencia.Empleado.modelo.Operario;
import Herencia.Empleado.modelo.Tecnico;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado empleado = new Empleado("Jose");
		Oficial oficial = new Oficial("Carlos");		
		Operario operario = new Operario("Raul");
		Tecnico tecnico = new Tecnico("Manolo");
		Directivo directivo = new Directivo("Pepe");
		
		System.out.println(empleado);
		System.out.println(oficial);
		System.out.println(operario);
		System.out.println(tecnico);
		System.out.println(directivo);
	}

}
