package mx.com.softgame.poo1game.pruebas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class PruebaOutIO {
    String npath = System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";
    try {
        InputStream file = new FileInputStream(npath);
        InputStream buffer = new BufferedInputStream(file);
        ObjectInput input = new ObjectInputStream(buffer);
       
          
    } catch (Exception e) {
        ex.printStackTrace();
    }
    

   
    }
    
}
