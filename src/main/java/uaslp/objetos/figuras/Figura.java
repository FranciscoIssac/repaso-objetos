package uaslp.objetos.figuras;

public class Figura extends DrawableItem{
    private String name;

    Figura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
