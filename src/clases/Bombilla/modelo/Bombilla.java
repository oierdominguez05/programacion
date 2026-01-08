package clases.Bombilla.modelo;

public class Bombilla {

	
	
	public boolean general;
	public boolean bombilla1;
	public boolean bombilla2;
	public boolean bombilla3;
	
	
	
	public Bombilla(boolean general, boolean bombilla1, boolean bombilla2, boolean bombilla3) {
		super();
		this.general = general;
		this.bombilla1 = bombilla1;
		this.bombilla2 = bombilla2;
		this.bombilla3 = bombilla3;
	}



	public boolean isGeneral() {
		return general;
	}



	public void setGeneral(boolean general) {
		this.general = general;
	}



	public boolean getBombilla1() {
		return bombilla1;
	}



	public void setBombilla1(boolean bombilla1) {
		this.bombilla1 = bombilla1;
	}



	public boolean getBombilla2() {
		return bombilla2;
	}



	public void setBombilla2(boolean bombilla2) {
		this.bombilla2 = bombilla2;
	}



	public boolean getBombilla3() {
		return bombilla3;
	}



	public void setBombilla3(boolean bombilla3) {
		this.bombilla3 = bombilla3;
	}
	
	
	
	
}
