package mx.com.softgame.poo1game.utils;
public class TheException extends Exception{
    private int poss;
    public TheException(String msg, int poss){
        this.poss = poss;
        msg = ""; 
    }
    public int getPoss(){
        return poss;
    } 
}