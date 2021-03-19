public class Utileria{
    int contadorID;
    private Utileria(cintadorID){//solo se tiene acceso al cintructor dentro de la clase  solo se llama por medio de un metodo estatico
        this.contadorID = contadorID;
    }
    public static int getID(){
        return ++contadorID;
    }
}