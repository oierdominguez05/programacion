package unidad8Interfaces.Entregables.ej2InstalacionDeportiva.modelo;

public class Polideportivo implements Instalacion, Edificio {

    private String nombre;
    private double superficie;
    private int tipo;

    public Polideportivo(String nombre, double superficie, int tipo) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipo;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }
}
