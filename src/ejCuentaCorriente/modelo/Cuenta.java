package ejCuentaCorriente.modelo;

public class Cuenta {

	
	
	String dni = "12345678X";
	String titular = "Paco";
	double saldo = 0;
	
	
	public void operaciones (String dni, String titular, double saldo) {
		
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


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
	
	
}
