package mx.com.softgame.poo1game.pruebas;
import java.util.ArrayList;
import java.util.Scanner;

import mx.com.softgame.poo1game.personajes.Personaje;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
public class PruebaIO {
    public static void main(String[] args) {
       Scanner file = new  Scanner(System.in);
       System.out.println("nombre del archivo:");
       String fle = file.nextLine();
       String path = System.getProperty("user.home");
       path += System.getProperty("file.separator")+fle.trim();
       System.out.println(path) ;
       File archivo = new File(path);
        
      if (archivo.exists()) {
            System.out.println();
            ArrayList<Personaje> personajes = new ArrayList<Personaje>();
            try {
              FileReader input = new FileReader(archivo);
              BufferedReader bufInput = new BufferedReader(input);
              String linea ;
              String cuantos = bufInput.readLine();
              int count = Integer.valueOf(cuantos);
              System.out.println(count);
              for (int i = 0; i < count; i++) {
                  linea = bufInput.readLine();
                  String[] partes = linea.split(",");
                  System.out.println(partes [1]);

              }




              
              bufInput.close();
          } catch (Exception e) {
              e.printStackTrace();
          }
                 
      }else{
        System.out.println("El archivo no existe,fin del programa");

       }


        
   } 
}
