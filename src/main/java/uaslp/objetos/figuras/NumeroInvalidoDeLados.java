package uaslp.objetos.figuras;

public class NumeroInvalidoDeLados extends RuntimeException {
    public NumeroInvalidoDeLados() {
        super("Número de lados válido a partir de 5");
    }
}
