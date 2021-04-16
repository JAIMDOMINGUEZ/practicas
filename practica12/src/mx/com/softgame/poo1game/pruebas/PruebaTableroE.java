package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.Tablero;

public class PruebaTableroE {
    public static void main(String[]args){
        Personaje[] arr ={new Planta("Giovana",50), new Zombie("Miguel",false),
        new Zombie("Karen",true), new Planta("Leonardo",99), new Planta("Sebastian",30),
        new Zombie("Hanna"),new  Planta("oscar"),new Zombie("Brian",false),
        new Planta("Lesly",9),new Planta("Vania", 10), new Zombie("Erick", 20, false),
        new Planta("Aline", 40)
        };
        for(Personaje p : arr){
            Tablero.addPersonaje(p);
        }
        Tablero.delPersonaje(arr[2]);
        Tablero.showAll();
        int k = 0;
        while (k<15) {
            for(Personaje p : arr){
                Tablero.delPersonaje(p);
                k++;
            }
        }
        
         
            
       

      
        
          
        Tablero.showAll(); 
        System.out.println("................");
        Tablero.delPersonaje(arr[2]);
        
        System.out.println("................");
        
            
            

        

    }
}
