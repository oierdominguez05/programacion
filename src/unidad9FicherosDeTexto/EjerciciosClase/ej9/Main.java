package unidad9FicherosDeTexto.EjerciciosClase.ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            System.out.println("1. Añadir firma");
            System.out.println("2. Ver libro de firmas");
            System.out.println("3. Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("Escribe tu firma:");
                    String firma = teclado.nextLine();
                    boolean repetida = false;

                    try {
                        BufferedReader br = new BufferedReader(new FileReader("firmas.txt"));
                        String linea;

                        while ((linea = br.readLine()) != null) {
                            if (linea.equalsIgnoreCase(firma)) {
                                repetida = true;
                                break;
                            }
                        }
                        br.close();

                        if (repetida) {
                            System.out.println("Esa firma ya existe en el libro.");
                        } else {
                            BufferedWriter bw = new BufferedWriter(new FileWriter("firmas.txt", true));
                            bw.write(firma);
                            bw.newLine();
                            bw.close();
                            System.out.println("Firma añadida correctamente.");
                        }

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("firmas.txt"));
                        String linea;

                        System.out.println("=== Libro de firmas ===");
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                        br.close();

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

    }
}
