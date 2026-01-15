package Examen1_2ªev.EmpresaTransporte.vista;
import Examen1_2ªev.EmpresaTransporte.modelo.Caja;
import java.util.Scanner;

import EmpresaTransporte.modelo.Caja;

public class VistaTransporte {

	Caja modelo;

	public void iniciar() {
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Dime un valor para etiqueta");
	String etiqueta = teclado.nextLine();
	modelo.setEtiqueta(etiqueta);
	System.out.println(modelo);
	}
	
}
