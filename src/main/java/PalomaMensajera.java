public class PalomaMensajera extends Paloma implements Transferible{

    public void enviarMensaje(String mensaje, Transferible receptor){
        receptor.recibirMensaje(mensaje);
    }

    public void comer(){

    }

    public String recibirMensaje(String mensaje){
        return mensaje;
    }
}
