package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
    char escudo;
    public Planta(String nombre,int vida,char escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Planta(String nombre,char escudo){
        this(nombre,3,escudo);
    }
    public Planta(String nombre,int vida){
        super(nombre,vida,'A');
    }
    public Planta(String nombre){
        this(nombre,3,'A');
    }
    public void decVida(){
        if(escudo == 'A'){
            vida=(vida--)*2;
        }
    }
    public void decVida(int vida){
        if(escudo == 'A'){
            vida=(this.vida--)*2;
        }
        
    }
    public char getEscudo(){
        return vida;
    } 

}