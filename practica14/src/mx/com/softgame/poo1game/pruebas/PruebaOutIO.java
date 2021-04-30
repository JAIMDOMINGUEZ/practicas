package mx.com.softgame.poo1game.pruebas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class PruebaOutIO {
    String npath = System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";
    
    try {
        FileInputStream f =new FileInputStream (npath);
        ObjectInputStream s =new ObjectInputStream (f);
        
         s.close ();
    } catch (Exception e) {
     e.printStackTrace ();
    }
   
    }
}
