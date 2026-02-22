package unidad9FicherosDeTexto.EjerciciosClase.ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String ruta = "NumerosReales.txt";

        double suma = 0;
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea = br.readLine(); 
            if (linea != null) {
                String[] numeros = linea.split(" ");

                for (String num : numeros) {
                    double valor = Double.parseDouble(num);
                    suma += valor;
                    contador++;
                }
            }
            br.close();
            if (contador > 0) {
                double media = suma / contador;
                System.out.println("Suma total: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("El fichero está vacío o no contiene números.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
