package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje{
    public boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre,vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        this(nombre,3,ataque);
    }
    public Zombie(String nombre){
        this(nombre,3,false);
        
    }
    boolean getAtaque(){
        return ataque;
    }
    public void decVida(){
        if(ataque == false){
            super.decVida(3);
        }else{
            super.decVida(2);
        }
    }
    public void decVida(int menosVida){
        if(ataque == false){
            super.decVida((menosVida*3));
        }else{
            super.decVida((menosVida*2));
        }
        
    }

}