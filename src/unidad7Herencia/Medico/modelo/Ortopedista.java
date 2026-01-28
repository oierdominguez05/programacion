package unidad7Herencia.Medico.modelo;

public class Ortopedista extends Medico {

	public Ortopedista(String nombre) {
		super(nombre);

	}

	tipoOrtopedista tipo;

	public tipoOrtopedista getTipo() {
		return tipo;
	}

	public void setTipo(tipoOrtopedista tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + "]";
	}

	
	
}
