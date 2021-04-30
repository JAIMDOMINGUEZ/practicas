import java.util.Scanner;

public class PruebaIO {
    public static void main(String[] args) {
       Scanner file = new  Scanner(System.in);
       String fle = file.nextline();
       String path = System.getProperty("user.home");
       path += "\\"+fle.trim();
       System.Out.println(path) ;
       File myFile = new File("fle");
      

        
   } 
}
