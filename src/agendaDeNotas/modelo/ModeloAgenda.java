package agendaDeNotas.modelo;

import java.util.ArrayList;

public class ModeloAgenda {

	



	    private ArrayList<String> mensajes;

	    public ModeloAgenda() {
	        mensajes = new ArrayList<>();
	        mensajes.add("Comprar: Pan, Agua, Leche, Manzanas, Carne y Embutido."); 
	        mensajes.add("Llevar a clase el libro de matemáticas.");
	        mensajes.add("Reunión de jueves: preparar una presentación PowerPoint."); 
	        mensajes.add("Volver al menú principal.");
	    }

	    public ArrayList<String> getMensajes() {
	        return mensajes;
	    }

	    public void añadirMensaje(String mensaje) {
	        mensajes.add(mensaje);
	    }

	    public void borrarMensaje(int index) {
	        mensajes.remove(index);
	    }
	}


	
	

