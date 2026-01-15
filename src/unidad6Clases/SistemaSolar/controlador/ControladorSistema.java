package unidad6Clases.SistemaSolar.controlador;

import unidad6Clases.SistemaSolar.modelo.Planeta;
import unidad6Clases.SistemaSolar.vista.VistaSistema;

public class ControladorSistema {

	
	
	Planeta modelo;
	VistaSistema vista;
	
	
	
	public ControladorSistema(Planeta modelo, VistaSistema vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}



	public void iniciar() {
		vista.mostrar();
		
	}
	
}
