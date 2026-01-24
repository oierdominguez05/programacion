package unidad8Interfaces.ej5Supermercado.modelo;

public class Cereales implements Productos {

	private final String producto = "Caja cereales";
	private String tipoCereal;
	private Calorias calorias;

	

	public Cereales(String tipoCereal, Calorias calorias) {
		super();
		this.tipoCereal = tipoCereal;
		this.calorias = calorias;
	}

	@Override
	public String marca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public String getProducto() {
		return producto;
	}

	@Override
	public String toString() {
		return "Cereales producto= " + producto + " tipoCereal= " + tipoCereal + " calorias= " + calorias;
	}
	
	
	

}
