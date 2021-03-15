//Jose Jaime Dominguez Sandoval
//Hora de inicio: 7:33
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    protected String nombre;
    protected int vida;
    public Personaje(String nombre,int vida){
        this.nombre = nombre;
        this.vida= vida;
        
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida= 3;    
    }
    
    public void decVida(){
        decVida(1);
    }
    public void decVida(int menosVida){
        if((vida-menosVida)>0){
            vida = vida-menosVida;
        }
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        if((vida>0) && (vida<100)){
            this.vida = vida;
        }
    }
    public void setNombre(String nombre){
        if(nombre.length()>3 && nombre.length()<10 ){
            this.nombre = nombre;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO "+nombre);
    }
    public String toString(){
        return nombre+"\t"+vida; 
    }
    public boolean equals(Object x){
        boolean resultado = false;
        if ( (x != null) && (x instanceof Personaje) ) {
            Personaje p = (Personaje) x;
            if ( (nombre == p.nombre) && (vida == p.vida)){
                return true;
            }   
        }return resultado;
    }
}