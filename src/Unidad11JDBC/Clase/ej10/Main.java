package Unidad11JDBC.Clase.ej10;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseñar la clase Alumno que tiene los siguientes atributos, de manera que se
		 * pueda almacenar sus objetos en la base de datos Instituto: • id: es el número
		 * identificativo único asignado a cada alumno, que sirve para distinguirlos de
		 * forma unívoca. • nombre: del alumno. Su tamaño nunca superará los 30
		 * caracteres. En caso de tener una longitud superior, se acortará. •
		 * fecNacimiento: fecha de nacimiento del alumno.
		 * 
		 * • notaMedia: la calificación media del alumno en el curso. • curso: cadena
		 * formada por dos caracteres que identifica el curso donde está matriculado el
		 * alumno.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el id");
		int id = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la fecha de nacimeinto");
		int fecNacimiento = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la nota media");
		double notaMedia = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el curso");
		String curso = teclado.nextLine();
		
		Alumno al = new Alumno(id, nombre, fecNacimiento, notaMedia, curso);
		
		try {
		PreparedStatement ps = ConexionDB.getConexion().prepareStatement("insert into instituto (id, nombre, fecNacimiento, notaMedia, curso) values (?,?,?,?,?)");
		ps.setInt(1, al.getId());
		ps.setString(2, al.getNombre());
		ps.setInt(3, al.getFecNacimiento());
		ps.setDouble(4, al.getNotaMedia());
		ps.setString(5, al.getCurso());
		ps.executeUpdate();
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
