package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class Direccion {
    private static Direccion instance;

    private Direccion() {

    }

    public static Direccion getInstance() {
        if(instance == null) {
            instance = new Direccion();
        }

        return instance;
    }
}
