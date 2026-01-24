package unidad8Interfaces.ej2Banco;

import unidad8Interfaces.ej2Banco.modelo.Persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una aplicación para gestionar la información de los empleados y
		 * clientes de un banco, teniendo en cuenta que un empleado puede ser, a la vez,
		 * cliente del banco. Para ello, crear una única clase Persona que implemente
		 * las interfaces Cliente y Empleado. Para simplificar solo se van a tener en
		 * cuenta los siguientes atributos: • Como empleado: número de horas trabajadas
		 * en el mes. • Como cliente: saldo de su cuenta. • Comunes: DNI (inmutable una
		 * vez creado), nombre y dos booleanos que digan si es cliente y/o empleado.
		 * Escribir un programa donde se crea un empleado que es cliente y se incrementa
		 * su número de horas trabajadas y su saldo como cliente.
		 */

		Persona modelo = new Persona("12345688G", "Oier", true, true);
		

		 double resultado1 = modelo.incrementarHoras(28);
		 double resultado2 = modelo.incrementarSaldo(300);
		
		

		System.out.println("Horas trabajadas: " + modelo.getNumHoras());
		System.out.println("Saldo Actual: " + modelo.getSaldo());

	}

}
