package unidad6Clases.EmpresaFerroviaria.modelo;

public class MaquinariaVagon {

	
	public int numero;
	public String carga;
	public String tipoMercancia;
	
	
	
	
	public MaquinariaVagon(int numero, String carga, String tipoMercancia) {
		super();
		this.numero = numero;
		this.carga = carga;
		this.tipoMercancia = tipoMercancia;
	}
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCarga() {
		return carga;
	}
	
	public void setCarga(String carga) {
		this.carga = carga;
	}
	
	public String getTipoMercancia() {
		return tipoMercancia;
	}
	
	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}
	
	
	
	
	
}
