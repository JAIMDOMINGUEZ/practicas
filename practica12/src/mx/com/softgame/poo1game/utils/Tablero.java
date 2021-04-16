package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import  mx.com.softgame.poo1game.utils.TheException;
public class Tablero {
    static int MAX_LINE = 10;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    static TheException theExceptionObj = new TheException("",0);
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
            System.out.println("No es posible insetar el personaje"+theExceptionObj.getPoss());
        }
        
        
       
    }
    public static void delPersonaje(Personaje p){
        boolean temp = false;
        try {
            if((idx- 1)>= 0 && (idx-1) < MAX_LINE){
                idx--;
                personajes[idx]=null;
                
            }
        } catch (Exception e) {
            System.out.println("No es posible borrar el personaje"+theExceptionObj.getPoss());
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
