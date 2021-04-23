package mx.com.softgame.poo1game.utils;
import java.util.Comparator;

import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.Personaje.*;
public class SortId implements Comparator<Personaje>{
    public int compare(Personaje p1,Personaje p2){
        return ((Personaje)p1).getId()-(Personaje)p2).getId();
    }
}
