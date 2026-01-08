package clases.MarcaPagina;

public class MarcaPagina {

	

		
		
		/*Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura
de un libro. Deberá disponer de métodos para incrementar la página
leída, para obtener información de la última página que se ha leído y
para comenzar desde el principio una nueva lectura del mismo libro.
*/
		
		
		

		public int paginaActual;
		
		public MarcaPagina() {
			this.paginaActual = 0;
		}
		
		public void sumPagina() {
			paginaActual++;
		}
		public void restPaginaActual() {
			paginaActual--;
		}
		
		public int getPaginaActual() {
			return paginaActual;
			
		}
		
		public void reiniciar() {
			paginaActual = 0;
		}
	

}
