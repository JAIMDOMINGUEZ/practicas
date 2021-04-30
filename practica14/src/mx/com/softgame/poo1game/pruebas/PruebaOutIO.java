package mx.com.softgame.poo1game.pruebas;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import mx.com.softgame.poo1game.personajes.Personaje;




public class PruebaOutIO {
    private static String npath = System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";
     public static void main(String[] args) {
        Personaje pe;
        try {
            FileInputStream f =new FileInputStream(npath);
            ObjectInputStream s =new ObjectInputStream (f);
           
            while(s.readObject()!=null)
                {
                    pe= (Personaje)s.readObject();
                    System.out.println(pe);
                 
                }
            s.close ();
            
        }catch(Exception e) {
           
        }
        
        
    
       
         
        
    }
    
    
}
