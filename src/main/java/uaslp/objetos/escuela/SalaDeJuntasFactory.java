package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class SalaDeJuntasFactory {
    static List<SalaDeJuntas> salasDeJuntas = new ArrayList<>();

    public static SalaDeJuntas get(String nombre) {
        for(SalaDeJuntas salaDeJuntas : salasDeJuntas) {
            if(salaDeJuntas.getNombre().equals(nombre)) {
                return salaDeJuntas;
            }
        }

        SalaDeJuntas salaDeJuntas = new SalaDeJuntas(nombre);
        salasDeJuntas.add(salaDeJuntas);

        return salaDeJuntas;
    }
}
