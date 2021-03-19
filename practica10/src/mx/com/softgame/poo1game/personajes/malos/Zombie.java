package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje{
    protected boolean ataque;
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
    public boolean getAtaque(){
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
    public String toString(){
        return super.toString()+"{"+ataque+"}";
    }
    public boolean equals(Object x){
        boolean resultado = false;
        if ( (x != null) && (x instanceof Zombie) ) {
            Zombie z = (Zombie) x;
            if ((ataque == z.ataque) && (super.equals(x))){
                resultado = true;
                return resultado;
            }
        
        }return resultado;
    }
    public String getIdVida(){
        return getIdVida()+ataque;//el metodo del padre es final y no se puede modificar
    }

}