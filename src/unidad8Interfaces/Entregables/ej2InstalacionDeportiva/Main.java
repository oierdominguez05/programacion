package unidad8Interfaces.Entregables.ej2InstalacionDeportiva;

import java.util.ArrayList;
import java.util.Iterator;

import unidad8Interfaces.Entregables.ej2InstalacionDeportiva.modelo.EdificioOficinas;
import unidad8Interfaces.Entregables.ej2InstalacionDeportiva.modelo.Polideportivo;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> lista = new ArrayList<>();

        lista.add(new Polideportivo("Poli Norte", 1200, 1));
        lista.add(new Polideportivo("Poli Sur", 1500, 2));
        lista.add(new Polideportivo("Poli Centro", 1800, 1));

        lista.add(new EdificioOficinas(900, 20));
        lista.add(new EdificioOficinas(1200, 35));

        Iterator<Object> it = lista.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (o instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) o;
                System.out.println("Polideportivo: " + p.getNombre());
                System.out.println("Superficie: " + p.getSuperficieEdificio());
                System.out.println("Tipo: " + p.getTipoDeInstalacion());
            }

            if (o instanceof EdificioOficinas) {
                EdificioOficinas e = (EdificioOficinas) o;
                System.out.println("Edificio de oficinas");
                System.out.println("Superficie: " + e.getSuperficieEdificio());
                System.out.println("Oficinas: " + e.getNumeroOficinas());
            }

            System.out.println("----------------------");
        }
    }
}
