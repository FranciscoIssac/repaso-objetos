package uaslp.objetos.escuela;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void a() {
        // Given:
        Dependencia1 dependencia1 = new ClaseX();
        Dependencia2 dependencia2 = new ClaseX();
        Dependencia3 dependencia3 = new ClaseX();
        AlgoritmoX  algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        // When:
        int a = 1, b = 1;
        String c = "a";
        algoritmoX.algoritmoACubrir(a, b, c);

        //Then:
    }

    @Test
    public void b() {
        // Given:
        Dependencia1 dependencia1 = new ClaseX();
        Dependencia2 dependencia2 = new ClaseX();
        Dependencia3 dependencia3 = new ClaseX();
        AlgoritmoX  algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        // When:
        int a = 1, b = 2;
        String c = "b";
        algoritmoX.algoritmoACubrir(a, b, c);

        //Then:
    }

    @Test
    public void c() {
        // Given:
        Dependencia1 dependencia1 = new ClaseX();
        Dependencia2 dependencia2 = new ClaseX();
        Dependencia3 dependencia3 = new ClaseX();
        AlgoritmoX  algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        // When:
        int a = 2, b = 1;
        String c = "c";
        algoritmoX.algoritmoACubrir(a, b, c);

        //Then:
    }

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
}
