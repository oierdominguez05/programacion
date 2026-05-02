package Unidad11JDBC.Entregables.ej2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Utiliza la técnica de mapeo objeto-relacional para cargar todas las oficinas
		 * de la base de datos en una lista de oficinas. Muestra el contenido de la
		 * lista de objetos creada
		 */
		
		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("select * from oficinas");
			ArrayList<Oficina> lista = new ArrayList<>();
			while(rs.next()) {
			int oficina = rs.getInt("oficina");
			String ciudad = rs.getString("ciudad");
			double superficie = rs.getDouble("superficie");
			double ventas = rs.getDouble("ventas");
			Oficina of = new Oficina(oficina, ciudad, superficie, ventas);
			lista.add(of);
			}
			System.out.println("Contenido de la lista");
			for(Oficina o: lista) {
				System.out.println(o);
			}
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
