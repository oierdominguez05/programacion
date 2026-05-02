package unidad9FicherosDeTexto.Pruebas.Nombres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lee nombres.txt (un nombre por línea) y guarda en sinRepetidos.txt solo los
		 * nombres únicos, en orden alfabético.
		 * 
		 * 💡 Pista: necesitas unicidad y orden automático
		 */
		
		TreeSet<String> nombres = new TreeSet<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("sinRepetidos.txt"));
			
			String linea;
			
			while((linea = br.readLine())!= null) {
				nombres.add(linea);
				
			}
			
			for(String s : nombres) {
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
