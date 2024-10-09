package epsum.clasescamilo.ej5.clases;

import java.util.Scanner;

public abstract class Dispositivos {
    protected Estados estado;
    protected String marca;


    public Dispositivos (String marca){
        this.estado=Estados.Apagado;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la marca de tu celular");
        String marca = scanner.nextLine();

    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }


    public abstract void Encender();

}
