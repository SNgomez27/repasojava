package epsum.clasescamilo.objetosserializables.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpresa {
    public static void main(String[] args) {
        Output();
        Input();
    }
    public static void Output(){

        ArrayList<empleados>listaEmpleados = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("quiere añadir un empleado? (s/n)");
       String respuesta = sc.nextLine();
        while (respuesta.equalsIgnoreCase("s")){
            empleados emple = new empleados();
            System.out.println("Ingrese el nombre del empleado");
            emple.setNombre(sc.nextLine());
            System.out.println("Ingrese el edad del empleado");
            emple.setEdad(sc.nextInt());
            System.out.println("Ingrese el salario del empleado");
            emple.setSalario(sc.nextDouble());
            System.out.println("Desea seguir agregando empleados? (s/n)");
            sc.nextLine();
            respuesta = sc.nextLine();
            listaEmpleados.add(emple);
        }
        try (FileOutputStream fileOS = new FileOutputStream("C:\\Users\\ALUMNO\\IdeaProjects\\Ej5\\src\\epsum\\clasescamilo\\objetosserializables\\clases\\empleados.ser");
        ObjectOutputStream salida =new ObjectOutputStream(fileOS)){
            salida.writeObject(listaEmpleados);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void Input(){
        ArrayList<empleados>listaEmpleados = null;
        try (FileInputStream fileIS = new FileInputStream("C:\\Users\\ALUMNO\\IdeaProjects\\Ej5\\src\\epsum\\clasescamilo\\objetosserializables\\clases\\empleados.ser");
             ObjectInputStream entrada = new ObjectInputStream(fileIS)){
         listaEmpleados = (ArrayList<empleados>) entrada.readObject();
         for ( empleados empleado : listaEmpleados ){
             System.out.println(empleado);
         }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
