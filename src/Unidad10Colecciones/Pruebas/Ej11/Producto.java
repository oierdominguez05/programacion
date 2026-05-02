package Unidad10Colecciones.Pruebas.Ej11;

public class Producto {

    private String codigo;
    private String nombre;
    private int stock;

    public Producto(String codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getStock() { return stock; }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + stock + " uds)";
    }
}
