package Unidad1.EjEntregables;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import Bebida.Bebida;
import Comida.comida;
public class LaMaquina {

	private comida [] Comida = new comida[5];
	private Bebida[] Bebida = new Bebida[5];
	

	
	public void cargarProductos() {
		Comida[0] = new comida(0, "Patatas Fritas Lay's", 1.80f, 250, new Date(2025, 12 , 10));
		Comida[1]= new comida(1,"Chocolate Milka", 1.50f, 210, new Date(2025, 11, 20));
		Comida[2]= new comida(2, "Kitkat", 1.20f, 190, new Date(2025, 10, 15));
		Comida[3] = new comida(3, "Sandwich Mixto", 3.00f, 380, new Date(2025, 9 ,5));
		
		
		Bebida[0] = new Bebida(4, "Agua Mineral", 1.00f, 0, new Date (2026, 1, 1));
		Bebida[1] = new Bebida(5, "Monster Energy", 2.20f, 220, new Date(2025, 12, 25));
		Bebida[2] = new Bebida (6, "Zumo de naranja", 1.70f, 95, new Date(2025, 0, 30));
	}
	
	public Integer[] cargarStock() {
		Integer[] stock = new Integer[50];
		Random r = new Random();
		for (int k=0; k < 50; k++) {
			stock[k] = r.nextInt(7);
		}
		return stock;
	}
	
	
	public static void main(String[] args) {	
		LaMaquina lm = new LaMaquina();
		lm.cargarProductos();
		
	
		Integer [] stock = lm.cargarStock();
		System.out.println(Arrays.toString(stock));
	
	String eleccion = "a";
	while(!eleccion.equals("q")) {
		System.out.println("Bienvenido a la maquina expendedora, que quieres? (selecciona por número)");
		String mensaje = "";
		
			
		}
	}

}
