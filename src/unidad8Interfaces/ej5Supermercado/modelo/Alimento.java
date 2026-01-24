package unidad8Interfaces.ej5Supermercado.modelo;

import java.time.LocalDate;

public interface Alimento {

	public void setCaducidad(LocalDate fc);

	public LocalDate getCaducidad();

	public int getCalorias();

}
