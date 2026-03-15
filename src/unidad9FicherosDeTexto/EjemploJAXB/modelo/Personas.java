package unidad9FicherosDeTexto.EjemploJAXB.modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")
public class Personas {

	private Persona[] personas;

	public Personas() {

	}

	public Personas(Persona[] personas) {
		this.personas = personas;
	}

	@XmlElement(name = "persona")
	public Persona[] getPersonas() {
		return personas;
	}

	public void setPersonas(Persona[] persona) {
		this.personas = personas;
	}

}
