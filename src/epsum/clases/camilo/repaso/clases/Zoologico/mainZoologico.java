package epsum.clases.camilo.repaso.clases.Zoologico;

import epsum.clases.camilo.repaso.clases.Animal;
import epsum.clases.camilo.repaso.clases.Aves;
import epsum.clases.camilo.repaso.clases.Mamiferos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class mainZoologico {
    public static void main(String[] args) {
        Output();
        //Input();
    }
    public static void Output() {
        Scanner sc = new Scanner(System.in);
     ArrayList<Animal> animals = new ArrayList<>();
            System.out.println("Su animal es mamifero o ave (M/A)");
           String respuesta = sc.nextLine();
           while (respuesta.equalsIgnoreCase("M")) {
               Mamiferos mamiferos = new Mamiferos();
                System.out.println("Ingresa el nombre de el mamifero");
              mamiferos.setNombre(sc.nextLine());
                System.out.println("Ingresa la edad de el mamifero");
                mamiferos.setEdad(sc.nextInt());
                System.out.println("Su animal tiene pelo?");
                animals.add(mamiferos);
            } else if (respuesta.equalsIgnoreCase("A")) {
                Aves aves = new Aves ();
                System.out.println("Ingresa el nombre de el mamifero");
                aves.setNombre(sc.nextLine());
                System.out.println("Ingresa la edad de el mamifero");
                aves.setEdad(sc.nextInt());
                System.out.println("Su ave puede volar?");
                animals.add(aves);
            }
            try(FileOutputStream fileOS = new FileOutputStream(C:\Users\ALUMNO\IdeaProjects\Ej5\src\epsum\clases\camilo\repaso\clases\Zoologico\animales.ser));{
                ObjectOutputStream salida = new ObjectOutputStream(fileOS)){
                salida.writeObject();
                }
            } catch e) {
                throw new RuntimeException(e);
            }
        }
    }
}
