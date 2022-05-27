package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;
    private double area;

    Cuadrado()
    {
        super("Cuadrado");
    }

    Cuadrado(double lado)
    {
        super("Cuadrado");
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

    public double getArea() throws LadoNoProvistoException
    {
        if(lado <= 0) {
            throw new LadoNoProvistoException();
        }

        return lado*lado;
    }
}
