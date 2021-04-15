package nombrepersonas;

import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.JFrame;

public class Menu {
    String menu;

    public Menu () {

    }

    public int obtenerOpcionMenu() throws IOException{
        menu="MENU DE PROGRAMA USUARIOS\n";
        menu+="1.  Insertar persona\n";
        menu+="2.  Modificar persona\n";
        menu+="3.  Listar los personas\n";
        menu+="4.  Eliminar personas\n";
        menu+="5.  Salir\n";
        menu+="Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    
     public String obtenerNombrePersona() throws IOException {
        menu = "Introduzca Nombre de persona\n";
        return JOptionPane.showInputDialog(menu);
    }

    public String obtenerApellidosPersona() throws IOException {
        menu = "Introduzca Apellidos de persona\n";
        return JOptionPane.showInputDialog(menu);
    }

    public String obtenerUsuarioPersona() throws IOException {
        menu = "Introduzca Usuario de persona\n";
        return JOptionPane.showInputDialog(menu);
    }

    public String obtenerContraseñaPersona() throws IOException {
        menu = "Introduzca Contraseña de persona\n";
        return JOptionPane.showInputDialog(menu);
    }

    public int obtenerIdiomaPersona() throws IOException {
        menu = "Introduzca Idioma de persona\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Final del programa");
        System.exit(0);
    }

}