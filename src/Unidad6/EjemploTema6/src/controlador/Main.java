package controlador;

import modelo.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("Oier","Dominguez","12345678T",1.6f);
		
		System.out.println(p1.getNombre());
		
		p1.setNombre("Oscar");
		System.out.println(p1.getNombre());
		
		
		
		
		
		
		
	}

}
