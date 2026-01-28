package unidad7Herencia.Medico;

import unidad7Herencia.Medico.modelo.Ortopedista;
import unidad7Herencia.Medico.modelo.Pediatra;
import unidad7Herencia.Medico.modelo.tipoOrtopedista;
import unidad7Herencia.Medico.modelo.tipoPediatra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ortopedista ortopedista = new Ortopedista("Oier");
		Pediatra pediatra = new Pediatra("Ander");
		ortopedista.setTipo(tipoOrtopedista.maxilofacial);
		pediatra.setTipo(tipoPediatra.neurologo);
		
		System.out.println(ortopedista);
		System.out.println(pediatra);
		
		
	}

}
