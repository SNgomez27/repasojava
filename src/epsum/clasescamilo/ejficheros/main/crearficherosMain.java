package epsum.clasescamilo.ejficheros.main;

import java.io.File;

public class crearficherosMain {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\Ej5\\src\\epsum\\clasescamilo\\ejficheros\\main\\fichero1.txt");
        try{
            if (archivo.createNewFile()){
                System.out.println("El archivo se ha creado con exito");
            }
            else {
                System.out.println("El archivo ya existe ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

