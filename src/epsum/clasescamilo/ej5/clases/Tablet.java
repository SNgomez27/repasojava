package epsum.clasescamilo.ej5.clases;

import epsum.clasescamilo.ej5.interfaces.Conectable;

public class Tablet extends  Dispositivos implements Conectable {

    public Tablet (String marca) {
        super(marca);
    }

    @Override
    public void Encender() {
        this.estado = Estados.Encendido;
        System.out.println("La tablet es inteligente esta encendido");

    }

    @Override
    public void conectarWifi() {
        System.out.println("La tablet esta conectado al wifi ");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("La tablet esta desconectado del wifi");
    }
}
