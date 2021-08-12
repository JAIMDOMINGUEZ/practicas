package mx.com.softgame.poo1game.ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import mx.com.softgame.poo1game.hilos.Hilo;

public class VentanaHilo extends JFrame {
    JMenuBar menubar;
    JLabel lblA;
    JLabel lblB;
    JLabel lblC;
    JLabel lblD;
    JMenu mnuArchivo;
    JMenuItem mnuinicio;
    JMenuItem mnuSalir;
    
    public void initComponents(){
        menubar = new JMenuBar();
        lblA = new JLabel("A");
        lblB = new JLabel("B");
        lblC = new JLabel("C");
        lblD = new JLabel("D");
        mnuArchivo = new JMenu("Archivo");
        mnuinicio = new JMenuItem("Inicio");
        mnuSalir = new JMenuItem("Salir");
        this.setLayout (new GridLayout(4,1));
        mnuArchivo.add(mnuinicio);
        mnuArchivo.add(mnuSalir);
        menubar.add(mnuArchivo);
        this.setJMenuBar(menubar);
        mnuSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
               
            }
            }); 
        mnuinicio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    iniciarHilos();
                   
            }
            });
        this.add(lblA);
        this.add(lblB);
        this.add(lblC);
        this.add(lblD);
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400,600);
        //this.setVisible(true);
    }
    public  VentanaHilo(){
        initComponents();
    }
    public void iniciarHilos(){
        Hilo hilo1 = new Hilo("A",lblA);
        Hilo hilo2 = new Hilo("B",lblB);
        Hilo hilo3 = new Hilo("C",lblC);
        Hilo hilo4 = new Hilo("C",lblD);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
