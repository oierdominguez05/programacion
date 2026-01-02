package ejCuentaCorriente.controlador;

import java.util.ArrayList;

import ejCuentaCorriente.modelo.Cuenta;

public class ControladorCuenta {

	private ArrayList<Cuenta> listaCuentas = new ArrayList<>();

	public ControladorCuenta(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	public void crearCuenta(String dni, String titular, double saldoInicial) {

	}

	public boolean buscarCuenta(String dni) {
		for (Cuenta i : listaCuentas) {
			if (i.equals(dni)) {
				return true;

			}
			
		}
		return false;
	}

	
	public void ingresar(String dni, double cantidad) {
		
	}
	
	
	public void retirar(String dni, double cantidad) { 
		
	}
	
	
}
