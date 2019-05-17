package mx.itson.ritapp.Entidades;
import mx.itson.ritapp.Enumeradores.tipoUsuario;


public class Usuario {

    private static final String TAG = Usuario.class.getSimpleName();

    private int idUsuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contrasena;
    private Enum<tipoUsuario> tipoUsaurio;
    private int numEmpleado;


    public Usuario(int idUsuario, String nombre, String apellido, String telefono, String correo, String contrasena, Enum<tipoUsuario> tipoUsaurio, int numEmpleado) {

        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoUsaurio = tipoUsaurio;
        this.numEmpleado = numEmpleado;

    }



    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Enum<tipoUsuario> getTipoUsaurio() {
        return tipoUsaurio;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }


    public boolean compararCon(Usuario usuario){



        return  this.nombre.compareTo(usuario.nombre)== 0 &&
                this.apellido.compareTo(usuario.apellido)== 0 &&
                this.telefono.compareTo(usuario.telefono)== 0 &&
                this.correo.compareTo(usuario.correo)== 0 &&
                this.contrasena.compareTo(usuario.contrasena)== 0 &&
                this.tipoUsaurio.compareTo((tipoUsuario) usuario.tipoUsaurio)== 0;


    }

}
