package epsum.clasescamilo.ej5.main;

import epsum.clasescamilo.ej5.clases.Dispositivos;
import epsum.clasescamilo.ej5.clases.Tablet;
import epsum.clasescamilo.ej5.clases.TelefonoInteligente;

import java.util.Scanner;

public class mainDispositivos {
    public static void main(String[] args) {

  TelefonoInteligente telefonoInteligente = new TelefonoInteligente(null);
                telefonoInteligente.Encender();
                telefonoInteligente.conectarWifi();
                telefonoInteligente.desconectarWifi();
 Tablet tablet = new Tablet(null);
                tablet.Encender();
                tablet.conectarWifi();
                tablet.desconectarWifi();
       telefonoInteligente.setMarca();
        System.out.println(telefonoInteligente.toString());

            }
        };

