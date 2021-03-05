package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje{
    boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        this.nombre = nombre;
        this.vida = 3;
        this.ataque = ataque;
    }
    public Zombie(String nombre){
        this.nombre = nombre;
        this.vida = 3;
        this.ataque = false;
    }
    boolean ataque(){
        return ataque
    }
    public void decVida(){
        if(escudo == false){
            vida=(vida--)*3;//
        }else{
            vida=(vida--)*2;
        }
    }
    public void decVida(int vida){
        if(escudo == false){
            vida=(this.vida--)*3;//
        }else{
            vida=(this.vida--)*2;
        }
        
    }

}