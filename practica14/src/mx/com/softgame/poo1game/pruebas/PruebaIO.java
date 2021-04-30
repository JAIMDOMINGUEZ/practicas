package mx.com.softgame.poo1game.pruebas;
import java.util.Scanner;
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
            FileReader fr =new FileReader();
            BufferReader br = new Bufferreader();
      }else{
        System.out.println("El archivo no existe,fin del programa");

       }


        
   } 
}
