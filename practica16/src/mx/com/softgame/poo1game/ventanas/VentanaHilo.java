package mx.com.softgame.poo1game.ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        mnuinicio = new JMenuItem("Inicio");
        mnuSalir = new JMenuItem("Salir");
        this.setLayout (new GridLayout(4,1));
        menuArchivo.add(mnuinicio);
        menuArchivo.add(mnuSalir);
        mnuSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                this.dispose();
               
            }
            }); 
        mnuinicio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    iniciarHilos();
                   
            }
            });
        this.add(b1);
        this.add(b2);
        this.pack();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400,600);
    }
    public void VentanaHilo(int i,String s){
        InitComponents();

    }
    public void iniciarHilos(){
        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();
        Hilo hilo3 = new Hilo();
        Hilo hilo4 = new Hilo();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();



    }

}
