package unidad6Clases.Bombilla.modelo;

import java.util.Objects;

public class Bombilla {

	
	
	private boolean encendida;
	private static boolean interruptorGeneral = true;
	
	public Bombilla() {
		this.encendida = false;
		
	}
	public void encender() {
		this.encendida = true;
	}
	
	public void apagar() {
		this.encendida = false;
	}
	
	public static void encenderGeneral() {
		interruptorGeneral = true;
	}
	public static void apagarGeneral() {
		interruptorGeneral = false;
	}
	
	
	}
	
	

