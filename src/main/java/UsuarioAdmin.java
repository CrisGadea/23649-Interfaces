public class UsuarioAdmin extends Usuario{
    private Boolean puedeAdministrar;

    public UsuarioAdmin(String nombreUsuario, String contrasenia){
        super(nombreUsuario,contrasenia);
        puedeAdministrar = true;
    }

}
