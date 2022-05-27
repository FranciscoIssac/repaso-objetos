package uaslp.objetos.escuela;

public class ClaseX implements Dependencia1, Dependencia2, Dependencia3 {

    private String dato;

    @Override
    public void save(String c) {
        dato = c;
    }

    @Override
    public void print(int a, String c) {
        System.out.println("a = " + a + "/nc: " + c);
    }

    @Override
    public void send(int a, int b) {

    }

    @Override
    public void recover() {

    }
}
