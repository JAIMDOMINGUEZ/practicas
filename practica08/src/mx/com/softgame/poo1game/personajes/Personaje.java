//Jose Jaime Dominguez Sandoval
//Hora de inicio: 7:35
//Hora de finalizacion: 925
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private String nombre;
    private int vida;
    public Personaje(String nombre,int vida){
        this.nombre = nombre;
        this.vida= vida;
        
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        this.vida= 3;    
    }
    
    public void decVida(){
        vida--;
    }
    public void decVida(int vida){
        vida++;
    }





    public int getVida(){
        return vida;
    }
    public boolean setVida(int vida){
        if(vida>0 && vida=<100){
            this.vida = vida;
            return true;
        }else{
            return false;
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
    public String getDetalle(){
        return nombre+"\t"+vida+"\t"+escudo;   
    }
}