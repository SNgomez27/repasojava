package epsum.clasescamilo.ej5.clases;

import epsum.clasescamilo.ej5.interfaces.Conectable;

public class TelefonoInteligente  extends  Dispositivos implements Conectable {




    public TelefonoInteligente(String marca) {
        super(marca);
    }



    @Override
    public void Encender() {
        this.estado = Estados.Encendido;
        System.out.println("El telefono es inteligente esta encendido");

    }

    @Override
    public void conectarWifi() {
        System.out.println("El telefono esta conectado al wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("El telefono esta desconectado del wifi");
    }

    @Override
    public String toString() {
        return "la marca del telefono es: " + marca;
    }
}
