package nombrepersonas;

public class Persona {
    public String idioma, nombre, apellidos, usuario, contraseña;

    public Persona(String idioma, String nombre, String apellidos, String usuario, String contraseña) {
        this.idioma = idioma;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getStringPersona () {
     String mensaje = "Información actual de la Persona: \n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Apellidos: " + this.getApellidos() + "\n";
        mensaje = mensaje + "Usuario: " + this.getUsuario() + "\n";
        mensaje = mensaje + "Contraseña: " + this.getContraseña() + "\n";
        mensaje = mensaje + "Idioma: " + this.getIdioma() + "\n";
        mensaje = mensaje + "\n\n\n";
        return mensaje;
    }

} 