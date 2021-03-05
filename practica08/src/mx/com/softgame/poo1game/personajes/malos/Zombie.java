package mx.com.softgame.poo1game.personajes.malos;
package mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje{
    boolean ataque;
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
            super.deckVida(3);
        }else{
            super.deckVida(2);
        }
    }
    public void decVida(int menosVida){
        if(ataque == false){
            super.deckVida((menosVida*3));
        }else{
            super.deckVida((menosVida*2));
        }
        
    }

}