package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.Tablero;

public class PruebaTableroE {
    public static void main(String[]args){
        Personaje[] arr ={new Planta("Giovana",50), new Zombie("Miguel",false),
        new Zombie("Karen",true), new Planta("Leonardo",99), new Planta("Sebastian",30),
        new Zombie("Vania"),new  Planta("Ricardo"),new Zombie("Brian",false),
        new Planta("Lesly",9),new Planta("Carlos", 10), new Zombie("Cristian", 20, false),
        new Planta("Oscar", 40)
        };
        
      
        for(Personaje p : arr){
            
        }
          
        Tablero.showAll(); 
        System.out.println("................");
        Tablero.delPersonaje(arr[2]);
        Tablero.showAll();
        System.out.println("................");
        
        for(int j = 0; j <=15; ++j){
            
        }    
            

        

    }
}
