package epsum.clases.camilo.repaso.clases;

public class Mamiferos extends Animal {
    private boolean tienePelo;

    public Mamiferos(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }
}
