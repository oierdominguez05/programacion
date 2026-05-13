package Unidad11JDBC.Examen.Pregunta21;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int opcion = 0;

		while (opcion != 6) {
			System.out.println("Menu: 1 crear clase libro 2 mostrar 3 listado 4 buscarPais 5 insertarLibro 6 libros mas prestados");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			case 1:
				crearLibro();
				break;
			case 2:
				mostrar();
				break;
			case 3:
				listado();
				break;
			case 4:
				buscarPais();
				break;
			case 5:
				insertarLibro();
			case 6:
				masPrestado();
				break;
			}

		}

	}

	public static void crearLibro() {
		System.out.println("Introduce el isbn");
		String isbn = teclado.nextLine();
		System.out.println("Introduce el titulo");
		String titulo = teclado.nextLine();
		System.out.println("Introduce el año");
		int año = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce disponible");
		boolean disponible = teclado.nextBoolean();

		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Insert into libros(isbn,titulo,anyo,disponible) values(?,?,?,?)");
			ps.setString(1, isbn);
			ps.setString(2, titulo);
			ps.setInt(3, año);
			ps.setBoolean(4, disponible);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void mostrar() {
		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select isbn,titulo,anyo,disponible from libros");
			while (rs.next()) {
				System.out.println();
				System.out.println("ISBN: " + rs.getString("isbn"));
				System.out.println("Titulo: " + rs.getString("titulo"));
				System.out.println("Año: " + rs.getInt("anyo"));
				System.out.println("Disponible: " + rs.getBoolean("disponible"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void listado() {

		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select titulo,anyo from libros order by anyo desc");

			while (rs.next()) {
				System.out.println("Titulo: " + rs.getString("titulo"));
				System.out.println("Año: " + rs.getInt("anyo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void buscarPais() {
		System.out.println("Introduce el nombre del pais");
		String pais = teclado.nextLine();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Select nombre, pais from autores where pais = ?");
			ps.setString(1, pais);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Pais: " + rs.getString("pais"));
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void insertarLibro() {
		
		System.out.println("Introduce el isbn");
		String isbn = teclado.nextLine();
		System.out.println("Intrduce el titulo");
		String titulo = teclado.nextLine();
		System.out.println("Introduce el año");
		int año = teclado.nextInt();
		System.out.println("Introduce el autor id");
		int autor = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select * from libros where isbn=?");
			ps.setString(1, isbn);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("ISBN registrado");
			} else {
				PreparedStatement ps1 = ConexionDB.getConexion().prepareStatement("Select * from autores where id=?");
				ps1.setInt(1, autor);
				ResultSet rs1 = ps.executeQuery();
				
				if(rs1.next()) {
					System.out.println("Id encontrado en autores");
					PreparedStatement ps2 = ConexionDB.getConexion().prepareStatement("Insert libros(isbn,titulo,año,autor_id,disponible) values(?,?,?,?,?)");
					ps2.setString(1, isbn);
					ps2.setString(2, titulo);
					ps2.setInt(2, año);
					ps2.setInt(3, autor);
					ps2.setBoolean(4, true);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void masPrestado() {
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("select * from prestamos group by isbn order by isbn limit 5");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id: " + rs.getString(1));
				System.out.println("Usaurio: " + rs.getString("usuario"));
				System.out.println("ISBN: " + rs.getString("isbn"));
				System.out.println("Fecha inicio: " + rs.getDate("fechaInicio"));
				System.out.println("Fecha fin: " + rs.getDate("fechaFin"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
