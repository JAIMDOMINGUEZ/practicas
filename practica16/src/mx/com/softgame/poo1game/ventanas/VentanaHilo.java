package mx.com.softgame.poo1game.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaHilo extends JFrame {
    JMenuBar menubar;
    JLabel lblA;
    JLabel lblB;
    JLabel lblC;
    JLabel lblD;
    JMenu mnuArchivo;
    JMenuItem mnuinicio;
    JMenuItem mnuSalir;
     JFrame f;    
    public void InitComponents( ){
        
        menubar = new JMenuBar();
        lblA = new JLabel("A");
        lblB = new JLabel("B");
        lblC = new JLabel("C");
        lblD = new JLabel("D");
        mnuArchivo = new JLabel("Archivo");
        mnuinicio = new JMenu("Inicio");
        mnuSalir = new JMenu("Salir");
        this.setLayout (new GridLayout(4,1));
        menuArchivo.add(mnuinicio);
        menuArchivo.add(mnuSalir);
        this.add(b1);
        this.add(b2);

        this.pack();
        this.setVisible(true);
        

    }
    public void VentanaHilo(int i,String s){
        InitComponents();
        
    }
}
