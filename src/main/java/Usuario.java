public class Usuario {
    // nombre de usuario y una contraseña
    private String nombreDeUsuario;
    private String contrasenia;

    public Usuario(String nombre, String contrasenia){
        nombreDeUsuario = nombre;
        this.contrasenia = contrasenia;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void ingresarDinero(Double dinero){

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
