public interface Transferible {
    void enviarMensaje(String mensaje, Transferible receptor);

    String recibirMensaje(String mensaje);

}
