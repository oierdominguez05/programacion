package ejCuentaCorriente.modelo;

public class Cuenta {

	public String dni = "12345678X";
	public String titular = "Paco";
	public double saldo = 0;
	public static String nombreBanco = "Santander";

	public Cuenta(String dni, double saldoInicial) {
		this.dni = dni;
		this.titular = "Desconocido";
		this.saldo = saldoInicial;
	}

	public Cuenta(String dni, String titular, double saldoInicial) {
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void addSaldo(double cantidad) {
		this.saldo += cantidad;
	}

	public void removeSaldo(double cantidad) {
		this.saldo -= cantidad;
	}

	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		Cuenta.nombreBanco = nombreBanco;
	}

}
