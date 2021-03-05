package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
    char escudo;
    public Planta(String nombre,int vida,char escudo){
        this.nombre = nombre;
        this.vida= vida;
        this.escudo = escudo;
    }
    public Planta(String nombre,char escudo){
        this.nombre = nombre;
        this.vida= 3;
        this.escudo = escudo;
    }
    public Planta(String nombre,int vida){
        this.nombre = nombre;
        this.vida= vida;
        this.escudo = A;
    }
    public Planta(String nombre){
        this.nombre = nombre;
        this.vida= 3;
        this.escudo = A;
    }
    public char escudo(){
        return vida;
    } 

}