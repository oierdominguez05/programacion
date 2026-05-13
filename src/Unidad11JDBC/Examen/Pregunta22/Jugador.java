package Unidad11JDBC.Examen.Pregunta22;

public class Jugador {

	private String dni;
	private String nombre;
	private String posicion;
	private double estatura;

	public Jugador(String dni, String nombre, String posicion, double estatura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.posicion = posicion;
		this.estatura = estatura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + ", posicion=" + posicion + ", estatura=" + estatura + "]";
	}

}

/*
 * Queremos gestionar la plantilla de un equipo de fútbol, en la que a cada
 * jugador se le asigna un dorsal que no puede estar repetido. Para ello vamos a
 * crear una estructura de tipo Map cuyas entradas corresponden a los jugadores,
 * con el dorsal como clave y un objeto de la clase Jugador como valor. De cada
 * jugador se guarda el DNI, el nombre, la posición en el campo (para
 * simplificar, los jugadores pueden ser porteros, defensas, centrocampistas y
 * delanteros) y su estatura. Define la clase Jugador y un enumerado para la
 * posición en el campo, e implementa los siguientes métodos estáticos: • public
 * static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal), que
 * añade una entrada al mapa con el dorsal pasado como parámetro y el jugador
 * creado dentro del método, introduciendo sus datos por consola. • static
 * Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal),que
 * elimina la entrada correspondiente al jugador cuyo dorsal se pasa como
 * parámetro. Dicho dorsal desaparece del mapa hasta que se asigne a otro
 * jugador por medio de un alta. El método devuelve el jugador eliminado. •
 * static void mostrar(Map<Integer, Jugador> plantilla), que muestra una lista
 * de los dorsales con los nombres de los jugadores correspondientes. • static
 * void mostrar(Map<Integer, Jugador> plantilla, String posición), que muestra
 * una lista de los jugadores que comparten una misma posición. Por ejemplo,
 * todos los defensas o todos los delanteros. • static boolean
 * editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal), que permite
 * modificar los datos de un jugador, excepto su dorsal y su DNI. Devuelve true
 * si el dorsal existe y false en caso contrario.
 * 
 * Archivos de respuestas Pregunta 22
 */
