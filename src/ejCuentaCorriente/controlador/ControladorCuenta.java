package ejCuentaCorriente.controlador;

import java.util.Scanner;

import ejCuentaCorriente.modelo.Cuenta;
import ejCuentaCorriente.vista.VistaCuenta;

public class ControladorCuenta {

	private VistaCuenta vista;
	private Cuenta modelo;

	public ControladorCuenta(VistaCuenta vista, Cuenta modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}

	public void crearCuenta(String dni, String titular, double saldoInicial) {

	}

	public void ingresar(String dni, double cantidad) {
		modelo.setSaldo(modelo.getSaldo() + cantidad);
		vista.mostrar("Ingreso realizado. Nuevo saldo" + modelo.getSaldo());
	}

	public void retirar(String dni, double cantidad) {
		if (modelo.getSaldo() >= cantidad) {
			modelo.setSaldo(modelo.getSaldo() - cantidad);
			vista.mostrar("Retirada realizada. Nuevo saldo: " + modelo.getSaldo());
		} else {
			vista.mostrar("Saldo insuficiente");
		}
	}

	public void inicio() {
		Scanner teclado = new Scanner(System.in);
		vista.mostrar("Banco:" + Cuenta.getNombreBanco());
		vista.mostrar("Quieres cambiar de banco?");
		String nombre = teclado.nextLine();
		if (nombre.equals("si")) {
			vista.mostrar("Que banco?");
			String nuevoBanco = teclado.nextLine();
			Cuenta.setNombreBanco(nuevoBanco);
			vista.mostrar("Banco: " + Cuenta.getNombreBanco());

		} else if (nombre.equals("no")) {
			vista.mostrar("Banco: " + Cuenta.getNombreBanco());
		}
		vista.mostrar("Elegir operacion: " + "1. Ingresar " + "2. Retirar");
		int opcion = teclado.nextInt();
		if (opcion == 1) {
			vista.mostrar("Cuanto quieres ingresar?");
			int cantIngresar = teclado.nextInt();
			modelo.addSaldo(cantIngresar);
			vista.mostrar("Cantidad despues de ingresar: " + modelo.getSaldo());
		}
		if (opcion == 2) {
			vista.mostrar("Cuanto quieres retirar?");
			int cantRetirar = teclado.nextInt();
			modelo.removeSaldo(cantRetirar);
			vista.mostrar("Cantidad despues de retirar: " + modelo.getSaldo());
		}
	}

}
