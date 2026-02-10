package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public interface Alquilar {

	public void alquilar();
	public void entregar();
	public float calcularPrecio(int dias);
	public boolean mostrarEstado();
}
