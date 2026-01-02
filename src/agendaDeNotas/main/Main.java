package agendaDeNotas.main;


import modelo.Usuario;
import vista.VistaAgenda;

import controlador.ControladorAgenda;
import modelo.Usuario;
import vista.VistaAgenda;
public class Main {

    public static void main(String[] args) {

      
        Usuario usuario = new Usuario("Usuario de prueba");

 
        VistaAgenda vista = new VistaAgenda();

   
        new ControladorAgenda(usuario, vista);

     
        vista.setVisible(true);
    }
}
