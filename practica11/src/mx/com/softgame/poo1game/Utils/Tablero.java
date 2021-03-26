package mx.com.softgame.poo1game.Utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero {
    static int MAX_LINE;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    private Tablero(int MAX_LINE,int idx){
        this.MAX_LINE = MAX_LINE;
        this.idx = idx;
    }
    static boolean addPersonaje(Personaje p){
        boolean temp = false;
        if(idx == personajes.length){
            personajes[idx]=p;
            idx++;
            return true;
        }
        idx++;
        return temp;
    }
    static boolean delPersonaje(Personaje p){
        boolean temp = false;
        if(idx == personajes.length){
            personajes[idx]=null;
            idx++;
            return true;
        }
        idx++;
        return temp;
    }
    public void showAll(){
        for(Personaje pe :personajes){
            if(pe!=null){
                System.out.println(pe);
            }
        }

    }

}
