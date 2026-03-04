package unidad9FicherosDeTexto.Pruebas.PalabraClave;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el nombre del fichero (Enter para usar entrada.txt):");
        String nombreFichero = teclado.nextLine().trim();

        if (nombreFichero.isEmpty()) {
            nombreFichero = "entrada.txt";
        }

        System.out.println("Dime una palabra clave:");
        String clave = teclado.nextLine().trim();

        BufferedReader br = null;
        BufferedWriter resultado = null;

        try {
            br = new BufferedReader(new FileReader(nombreFichero));
            resultado = new BufferedWriter(new FileWriter("resultado.txt"));

            String linea;
            int contadorLineas = 0;
            int lineasConClave = 0;

            while ((linea = br.readLine()) != null) {
                contadorLineas++;

                if (linea.toLowerCase().contains(clave.toLowerCase())) {
                    resultado.write(linea);
                    resultado.newLine();
                    lineasConClave++;
                }
            }

            System.out.println("Lineas leidas: " + contadorLineas);
            System.out.println("Lineas con la palabra clave: " + lineasConClave);
            System.out.println("Resultado guardado en resultado.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (resultado != null) resultado.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        teclado.close();
    }
}