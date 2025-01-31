package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public String getNombre()
    {
        return nombre;
    }
    public String getClave()
    {
        return clave;
    }

    public String getClaveDeCarrera()
    {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso()
    {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public static AlumnoBuilder builder()
    {
        return new AlumnoBuilder();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setClaveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera = claveDeCarrera;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
