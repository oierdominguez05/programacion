package unidad9FicherosDeTexto.EjemploJAXB.controlador;

import java.io.File;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import unidad9FicherosDeTexto.EjemploJAXB.modelo.Persona;
import unidad9FicherosDeTexto.EjemploJAXB.modelo.Personas;

public class Main {
	private static Persona[] personas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("Carlos", 35);
		Persona p2 = new Persona("Carlos", 35);
		Persona p3 = new Persona("Carlos", 35);

		personas = new Persona[3];
		personas[0] = p1;
		personas[1] = p2;
		personas[2] = p3;
		
		Personas p = new Personas(personas);
		crearXML(p);

		
		 //Persona p1 = leerXML(); System.out.println(p1);
		 

	}

	public static void crearXML(Personas p) {
		try {
			JAXBContext context = JAXBContext.newInstance(Personas.class);

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			File file = new File("personas.xml");

			marshaller.marshal(p, file);
		

			System.out.println("El archivo XML se ha generado correctamente");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Persona leerXML() {

		Persona persona = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Persona.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			persona = (Persona) unmarshaller.unmarshal(new File("personas.xml"));

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return persona;

	}

}
