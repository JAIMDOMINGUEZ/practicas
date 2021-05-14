package  mx.com.softgame.poo1game.hilos;



import javax.swing.JLabel;

public class Hilo extends Thread{
    JLabel etiqueta;
    public Hilo(String name,Jlabel etiqueta){
        name = "";
        etiqueta = new JLabel("");
    }
    public void run(){
        String str;
        for (int i = 0; i < 10; i++) {
            str = etiqueta.getText();
            char c = str.charAt(str.length()-1);
            etiqueta.setText(str);
            int n = Math.random()*1000+0;
            str.sleep(n);
        }
        str = str+"Hecho";
        etiqueta.setText(str);

    }
}