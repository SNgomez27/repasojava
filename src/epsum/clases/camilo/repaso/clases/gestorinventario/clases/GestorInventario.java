package epsum.clases.camilo.repaso.clases.gestorinventario.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    ArrayList<Producto> productos = new ArrayList<>();


    public void  Output(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Desea ingresar un producto (s/n)");
       String respuesta = sc.nextLine();
       while(respuesta.equals("s")){
           Producto producto = new Producto();
           System.out.println("Ingrese el codigo del  producto");
          producto.setCod(sc.next());
           System.out.println("Ingrese el nombre del  producto");
           producto.setNombre(sc.next());
           System.out.println("Ingrese la cantidad del  producto");
           producto.setCantidad(sc.nextInt());
           System.out.println("Ingrese el precio del  producto");
           producto.setPrecio(sc.nextDouble());
           productos.add(producto);
           System.out.println("Desea ingresar otro producto (s/n)");
           sc.nextLine();
           respuesta = sc.nextLine();
       }
       FileWriter();
   }
    public void filereader() {
        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\Ej5\\src\\epsum\\clases\\camilo\\repaso\\clases\\gestorinventario\\clases\\productosTxt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            long size = file.length();
            System.out.println( size + "bytes");
            br.close();
          } catch (FileNotFoundException e){
                throw new RuntimeException(e);
            } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }

    public void FileWriter(){
        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\Ej5\\src\\epsum\\clases\\camilo\\repaso\\clases\\gestorinventario\\clases\\productosTxt");

        if (file.exists()){}
        else
            try {
                file.createNewFile();
            }catch (IOException e){
                throw new RuntimeException(e);
            } try {
             FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(productos.toString());
            bufferedWriter.close();
         } catch (Exception e) {
             System.out.println("Error" + e.getMessage());
         }
    }

}
