package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private String description;

    Triangulo()
    {
        super("Triangulo");
        description = "Cualquier triangulo";
    }

    Triangulo(String description, String name)
    {
        super(name);
        this.description = description;
    }

    Triangulo(double base, double altura)
    {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltura()
    {
        return altura;
    }

    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException
    {
        if(base <= 0) {
            throw new BaseNoProvistaException();
        }
        if(altura <= 0) {
            throw new AlturaNoProvistaException();
        }

        return base*altura/2;
    }

    public String getDescription()
    {
        return description;
    }
}
