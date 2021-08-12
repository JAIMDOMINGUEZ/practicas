package mx.edu.labpoo.ordinario.ordinario12021.vistas;

import mx.edu.labpoo.ordinario.ordinario12021.vistas.Ventana;

public class Inicio {
    public static void main(String[] args) {
        
        String path = System.getProperty("user.home")+System.getProperty("file.separator")+"\\documents";
        String pathh = System.getProperty("user.home")+System.getProperty("file.separator")+"\\documentos";
        if (!pathh.exists()) {
            JOptionPane.showMessageDialog(f,"El archivo no existe ");
            return;
       }
        
        /*
        Ventana v = new Ventana();
        v.setVisible(true);
        */
    }
}
