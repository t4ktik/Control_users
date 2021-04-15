package nombrepersonas;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class NombrePersonas {

    public static void main (String[] Args) throws IOException {

        int opcionEligeUsuario = 0;
        List <Persona> listaPersonas = new ArrayList<> ();
        Menu opcionesUsuario = new Menu();
        Menu mensajeVent = new Menu();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            if (opcionEligeUsuario == 1) {

              Persona tmpPersona = new Persona();
                tmpPersona.SetNombre(opcionesUsuario.obtenerNombrePersona());
                tmpPersona.SetApellidos(opcionesUsuario.obtenerApellidosPersona());
                tmpPersona.SetUsuario(opcionesUsuario.obtenerUsuarioPersona());
                tmpPersona.SetContraseña(opcionesUsuario.obtenerContraseñaPersona());
                tmpPersona.SetIdioma(opcionesUsuario.obtenerIdiomaPersona());

                listaPersonas.add(tmpPersona);
            }
            
            if (opcionEligeUsuario == 2) {
                String identPersonaBuscada = opcionesUsuario.obtenerUsuarioPersona();
                boolean personaEncontrada = false;

                Iterator<Persona> it = listaPersonas.iterator();
                Persona tmpAnalizando;

                while ( it.hasNext() ) {

                    tmpAnalizando = it.next();

                    if (tmpAnalizando.getUsuario().equals(identPersonaBuscada) ) {
                        personaEncontrada = true;
                        String mensaje = tmpAnalizando.getStringPersona();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para esta persona";

                        mensajeVent.mostrarMensaje(mensaje);

                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombrePersona());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosPersona());
                        tmpAnalizando.SetUsuario(opcionesUsuario.obtenerUsuarioPersona());
                        tmpAnalizando.SetContraseña(opcionesUsuario.obtenerContraseñaPersona());
                        tmpAnalizando.SetIdioma(opcionesUsuario.obtenerIdiomaPersona());

                        mensaje = tmpAnalizando.getStringPersona();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }

                }

                if (personaEncontrada == false) {
                    mensajeVent.mostrarMensaje("No se encontró a la persona con ese User");
                }
            }

            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<Persona> it2 = listaPersonas.iterator();
                Persona tmpAnalizando;

                while ( it2.hasNext() ) {  
                    tmpAnalizando = it2.next();         
                    listado = listado + tmpAnalizando.getStringPersona();
                    listado = listado + "\n\n\n";
                }

                mensajeVent.mostrarMensaje(listado);

            }

            if (opcionEligeUsuario == 4) {
                String identPersonaBuscada = opcionesUsuario.obtenerUsuarioPersona();
                boolean personaEncontrada = false;

                Iterator<Persona> it = listaPersonas.iterator();
                Persona tmpAnalizando;

                while ( it.hasNext() && personaEncontrada==false ) {    

                    tmpAnalizando = it.next();

                    if (tmpAnalizando.getUsuario().equals(identPersonaBuscada) ) {
                        personaEncontrada = true;
                        String mensaje = tmpAnalizando.getStringPersona();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de esta persona\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        listaPersonas.remove(tmpAnalizando);
                        personaEncontrada=true;

                    } else { }

                }

                if (personaEncontrada == false) {
                    mensajeVent.mostrarMensaje("No se encontró a la persona con ese Usuario");
                }
            }

        }

        opcionesUsuario.cerrarPrograma();

    }

}