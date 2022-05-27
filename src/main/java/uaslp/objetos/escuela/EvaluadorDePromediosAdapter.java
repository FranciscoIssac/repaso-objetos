package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private final EvaluadorDePromedios evaluadorDePromedios;

    EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        List<Double> calificaciones = new ArrayList<>();
        char [] charCalificaciones = listaDeCalificaciones.toCharArray();
        String strNumber = "";
        double number;

        for (char charCalificacion : charCalificaciones) {
            if ((Character.isDigit(charCalificacion) || charCalificacion == 46)) {
                strNumber = strNumber.concat(Character.toString(charCalificacion));
            } else {
                number = Double.parseDouble(strNumber);
                calificaciones.add(number);
                strNumber = "";
            }
        }
        number = Double.parseDouble(strNumber);
        calificaciones.add(number);


        return evaluadorDePromedios.evalua(calificaciones);
    }
}
