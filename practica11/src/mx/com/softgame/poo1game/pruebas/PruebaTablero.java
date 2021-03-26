package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaTablero {
    public static void main(String[]args){
        Personaje[] arr ={new Planta("Wendy",50), new Zombie("jose",false),
        new Zombie("Karen",true), new Planta("Giovana",99), new Planta("victor",30),
        new Zombie("Vania"),new  Planta("Ricardo"),new Zombie("Brian",false),
        new Planta("Lesly",9),new Planta("Carlos", 10), new Zombie("Cristian", 20, false),
        new Planta("Oscar", 40)
        };
        
    }
}
