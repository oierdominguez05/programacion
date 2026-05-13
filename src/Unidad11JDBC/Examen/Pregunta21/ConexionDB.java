package Unidad11JDBC.Examen.Pregunta21;

import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	private static Connection conn;

	public static Connection getConexion() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bliblioteca?serverTimezone=UTC&allowMultiQueries=true", "root",
						"root");
				System.out.println("Se ha conectado.");
			} catch (ClassNotFoundException ex1) {
				System.out.println("No se ha conectado: " + ex1);
			} catch (SQLException ex2) {
				System.out.println("No se ha conectado: " + ex2);
			}
		}
		return conn;
	}
}

/*
 * Este examen propone una serie de ejercicios centrados en la conexión y
 * gestión de bases de datos mediante JDBC. Se trabaja con una base de datos
 * denominada BibliotecaDigital, orientada a la gestión de libros, autores y
 * préstamos. El objetivo es aplicar los conocimientos de acceso a datos, uso de
 * PreparedStatement, gestión de transacciones, mapeo objeto-relacional y buenas
 * prácticas con el patrón DAO.
 * 
 * Esquema de la base de datos BibliotecaDigital Tabla: Libros isbn VARCHAR(13)
 * PRIMARY KEY
 * 
 * titulo VARCHAR(255)
 * 
 * anyo INT
 * 
 * autor_id INT (FOREIGN KEY → Autores.id)
 * 
 * disponible BOOLEAN
 * 
 * Tabla: Autores id INT PRIMARY KEY
 * 
 * nombre VARCHAR(100)
 * 
 * pais VARCHAR(50)
 * 
 * Tabla: Prestamos id INT PRIMARY KEY AUTO_INCREMENT
 * 
 * usuario VARCHAR(100)
 * 
 * isbn VARCHAR(13) (FOREIGN KEY → Libros.isbn)
 * 
 * fechaInicio DATE
 * 
 * fechaFin DATE (nullable)
 * 
 * Elabora una función que realice cada uno de los ejercicios siguientes:
 * 
 * Crear la clase Libro con los atributos correspondientes. Usar JDBC para
 * consultar todos los libros existentes. Mostrar: ISBN, título, año y si están
 * disponibles. Obtener un listado con el título del libro, año y nombre del
 * autor. Ordenar por año descendente.
 * 
 * Pedir al usuario el nombre de un país. Mostrar todos los autores cuyo país
 * coincida (exactamente).
 * 
 * Solicitar ISBN, título, año y autor. Verificar: Que el ISBN no exista ya. Que
 * el autor_id exista en la tabla Autores. Si todo es correcto, insertar el
 * libro y marcarlo como disponible.
 * 
 * Obtener los 5 libros más prestados. Mostrar ISBN, título y número total de
 * préstamos. Ordenar de mayor a menor número de préstamos.
 */