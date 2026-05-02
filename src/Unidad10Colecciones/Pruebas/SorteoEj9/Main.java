package Unidad10Colecciones.Pruebas.SorteoEj9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sorteo<Integer> sorteo = new Sorteo<>();

		sorteo.add(5);
		sorteo.add(10);
		sorteo.add(15);
		sorteo.add(20);

		System.out.println("Premiados:");
		System.out.println(sorteo.premiados(2));
	}
}
