package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero {
    static int MAX_LINE = 10;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    private Tablero(int MAX_LINE,int idx){
        this.MAX_LINE = MAX_LINE;
        this.idx = idx;
    }
    public static void addPersonaje(Personaje p){
        boolean temp = false;
        try {
            if(idx >= 0 ){
                idx--;
                personajes[idx]=p;
                
            } 
        } catch (Exception e) {
            
        }
        
        
       
    }
    public static void delPersonaje(Personaje p){
        boolean temp = false;
        if((idx- 1)>= 0 && (idx-1) < MAX_LINE){
            idx--;
            personajes[idx]=null;
            
        }
        
        
    }
    public static void showAll(){
        for(Personaje pe :personajes){
            if(pe!=null){
                System.out.println(pe.getNombre());
            }
        }

    }

}
