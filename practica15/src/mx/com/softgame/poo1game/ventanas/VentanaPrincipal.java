import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class VentanaPrincipal {
    JFrame f;
    JLabel lblFile;
    JTextField txtFil;
    JButton btnOpen;
    JTextArea txtCont;
    JLabel lblN;
    JLabel lblLeidos;
    JButton btnExit;
   public VentanaPrincipal(){
        f = new JFrame();
        f.setTitle("Practica 14");
        lblFile = new JLabel("Nombre del arhivo");
        txtFil = new JTextField();
        btnOpen = new JButton("Abrir archivo");
        txtCont = new JTextArea();
        txtCont.setColumns(40);
        txtCont.setRows(30);
        lblLeidos = new JLabel("Caracteres Leidos");
        lblN = new JLabel("0");
        btnExit = new JButton("Salir");
   } 
   private void initComponents() {
        f.setLayout(new FlowLayout());
        f.add(lblFile);
        f.add(txtFil);
        f.add(btnOpen);
        //btnOpen.addActionListener(l);
        f.add(txtCont);
        f.add(lblLeidos);
        f.add(lblN);
        f.add(btnExit);
        f.setSize(550,440);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

   }
   public static void main(String[]args){
    VentanaPrincipal v = new VentanaPrincipal();
    v.initComponents();
    
   }
}
