package Examenes.Examen2SegundaEv.Pregunta23.modelo;

public class Perecedero extends Producto implements CalcularPerecedero {

	private int diasCaducar;

	public Perecedero(String nombre, float precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		return super.toString() + "Perecedero [diasCaducar=" + diasCaducar + "]";
	}

	@Override
	public void reducir() {
		if(diasCaducar == 1) {
			super.setPrecio(4);
		} 
		if(diasCaducar == 2) {
			super.setPrecio(3);
		}
		if(diasCaducar == 3) {
			super.setPrecio(2);
		}
	}

	

}
