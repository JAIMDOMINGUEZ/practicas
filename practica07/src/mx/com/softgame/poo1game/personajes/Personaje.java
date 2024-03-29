//Jose Jaime Dominguez Sandoval
//Hora de inicio: 7:35
//Hora de finalizacion: 925
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private String nombre;
    private int edad;
    public Personaje(String nombre){
        this.nombre = nombre;
        this.edad= 0;
        int b;
    }
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if(edad>0 && edad<120){
            this.edad = edad;
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
        return nombre+"\t"+edad;   
    }
}