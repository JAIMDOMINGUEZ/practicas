package mx.com.softgame.poo1game.Utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero {
    static int MAX_LINE = 10;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    private Tablero(int MAX_LINE,int idx){
        this.MAX_LINE = MAX_LINE;
        this.idx = idx;
    }
    public static boolean addPersonaje(Personaje p){
        boolean temp = false;
        
        System.out.println(idx);
        if(idx+1 >= 0 && idx < MAX_LINE){
            personajes[idx]=p;
            idx++;
            return true;
        }
        
        return temp;
    }
    public static boolean delPersonaje(Personaje p){
        boolean temp = false;
        if(idx >= 0 && idx < MAX_LINE){
            personajes[idx]=null;
            idx--;
            return true;
        }
        idx--;
        return temp;
    }
    public static void showAll(){
        for(Personaje pe :personajes){
            if(pe!=null){
                System.out.println(pe.getNombre());
            }
        }

    }

}
