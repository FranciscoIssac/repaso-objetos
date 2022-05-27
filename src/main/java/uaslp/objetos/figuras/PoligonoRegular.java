package uaslp.objetos.figuras;

import static java.lang.Math.PI;
import static java.lang.Math.tan;

public class PoligonoRegular extends Figura{
    private final int numeroDeLados;
    private double lado;

    PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados
    {
        super("Poligono Regular");

        if(numeroDeLados < 5) {
            throw new NumeroInvalidoDeLados();
        }

        this.numeroDeLados = numeroDeLados;
    }

    PoligonoRegular(int numeroDeLados, double lado) throws NumeroInvalidoDeLados
    {
        super("Poligono Regular");

        if(numeroDeLados < 5) {
            throw new NumeroInvalidoDeLados();
        }

        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getLado()
    {
        return lado;
    }

    public double getArea()
    {
        double anguloInt = 2*PI/(2*numeroDeLados);
        double apotema = lado/(2*tan(anguloInt));

        return lado*numeroDeLados*apotema/2;
    }
}
