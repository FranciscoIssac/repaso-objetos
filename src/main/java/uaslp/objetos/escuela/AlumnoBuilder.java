package uaslp.objetos.escuela;

import java.time.LocalDate;

public class AlumnoBuilder {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public AlumnoBuilder nombre(String nombre) {
        this.nombre = nombre;

        return this;
    }

    public AlumnoBuilder clave(String clave) {
        this.clave = clave;

        return this;
    }

    public AlumnoBuilder claveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera = claveDeCarrera;

        return this;
    }

    public AlumnoBuilder anioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;

        return this;
    }

    public AlumnoBuilder fechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;

        return this;
    }

    public Alumno build() {
        Alumno alumno = new Alumno();
        alumno.setNombre(this.nombre);
        alumno.setClave(clave);
        alumno.setClaveDeCarrera(claveDeCarrera);
        alumno.setAnioDeIngreso(anioDeIngreso);
        alumno.setFechaNacimiento(fechaNacimiento);

        return alumno;
    }
}
