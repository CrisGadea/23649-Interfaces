import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String []args){
        // Quiero crear un usuario que tenga como datos mail y contraseña
        Usuario user = new Usuario("CrisGadea", "1234");

        List<String> nombres = new LinkedList<String>();
        List<String> nombres2 = new ArrayList<String>();

        System.out.println(user);
    }

}
