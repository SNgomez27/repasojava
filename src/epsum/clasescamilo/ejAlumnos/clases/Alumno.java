package epsum.clasescamilo.ejAlumnos.clases;

public class Alumno {
    String nombre;
    int edad;
    String curso;
    int cicloCursado;
    double notaMedia;

    public Alumno(String nombre, int edad,String curso, int cicloCursado, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cicloCursado = cicloCursado;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCicloCursado() {
        return cicloCursado;
    }

    public void setCicloCursado(int cicloCursado) {
        this.cicloCursado = cicloCursado;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
