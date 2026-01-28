package unidad7Herencia.Medico.modelo;

public class Pediatra extends Medico {

	public Pediatra(String nombre) {
		super(nombre);

	}

	tipoPediatra tipo;

	public tipoPediatra getTipo() {
		return tipo;
	}

	public void setTipo(tipoPediatra tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pediatra [tipo=" + tipo + "]";
	}

	
}
