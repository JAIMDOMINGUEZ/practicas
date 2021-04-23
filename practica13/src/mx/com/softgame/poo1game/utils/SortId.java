package mx.com.softgame.poo1game.utils;
import java.util.Comparator;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.Personaje.*;
public class SortId implements Comparator{
    public int compare(Object o1,Object o2){
        return ((Personaje) o1).getId()-((Personaje) o2).getId();
    }

    

}
