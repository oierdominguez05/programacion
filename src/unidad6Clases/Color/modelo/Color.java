package unidad6Clases.Color.modelo;

import java.util.ArrayList;

public class Color {

	
	ArrayList<String> color = new ArrayList<>();

	public Color() {
		color.add("azul");
		color.add("verde");
		color.add("amarillo");
		color.add("rojo");
	}

	@Override
	public String toString() {
		return "Color [color=" + color + "]";
	}
	

	
}
