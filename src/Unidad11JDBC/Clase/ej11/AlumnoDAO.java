package Unidad11JDBC.Clase.ej11;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Unidad11JDBC.Clase.ej10.Alumno;

public class AlumnoDAO {

	static Scanner teclado = new Scanner(System.in);

	public static void crear(Alumno al) {

		try {
			PreparedStatement ps1 = ConexionDB.getConexion()
					.prepareStatement("insert into alumno (nombre,fNacimiento,notaMedia,curso) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			ps1.setString(1, al.getNombre());
			ps1.setInt(2, al.getFecNacimiento());
			ps1.setDouble(3, al.getNotaMedia());
			ps1.setString(4, al.getCurso());
			System.out.println(ps1);
			int rows = ps1.executeUpdate();
			if (rows == 1) {
				ResultSet keys = ps1.getGeneratedKeys();
				keys.next();
				long idRecogido = keys.getLong(1);
				System.out.println(idRecogido);
				al.setId((int) idRecogido);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void leer(int idAlumno) {

		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("select * from alumno where id = ?");
			ps.setInt(1, idAlumno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Fecha de nacimineto: " + rs.getDouble("fNacimiento"));
				System.out.println("Nota media: " + rs.getDouble("notaMedia"));
				System.out.println("Curso: " + rs.getString("curso"));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void actualizar(Alumno al) {

		try {
			PreparedStatement ps2 = ConexionDB.getConexion()
					.prepareStatement("update alumno set nombre=?, fNacimiento=?, notaMedia=?, curso=? where id=?");

			ps2.setString(1, al.getNombre());
			ps2.setDouble(2, al.getFecNacimiento());
			ps2.setDouble(3, al.getNotaMedia());
			ps2.setString(4, al.getCurso());
			ps2.setInt(5, al.getId());
			ps2.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eliminar(int idEliminar) {

		try {
			PreparedStatement ps3 = ConexionDB.getConexion().prepareStatement("delete from alumno where id=?");
			ps3.setInt(1, idEliminar);
			ps3.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
