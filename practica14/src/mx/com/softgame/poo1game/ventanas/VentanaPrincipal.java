import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPrincipal {
    JFrame f;
    JLabel lblFile;
    JTextField txtFil;
    JButton btnOpen;
    JTextArea txtCont;
    Jlabel lblN;
    JLabel lblLeidos;
    Jbutton btnExit;
   public VentanaPrincipal(){
        f = new Jframe();
        f.setTitle("Practica 14");
        lblFile = new Jlabel("Nombre del arhivo");
        txtFil = new JTextField();
        btnOpen = JButton("Abrir archivo");
        txtCont = JTextArea();
        txtCont.setColumns(40);
        txtCont.setRows(30);
        lblLeidos = new JLabel("Caracteres Leidos");
        lblN = new Jlabel("0");
        btnExit = new JButton("Salir");
   } 
   private void initComponents() {
        f.setLayout(new FlowLayout());
        f.add(lblFile);
        f.add(txtFil);
        f.add(btnOpen);
        f.add(txtCont);
        f.add(lblLeidos);
        f.add(lblN);
        f.add(btnExit);
        ven.setSize(550,440);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ven.setVisible(true);

   }
   public static void main(String[]args){
    VentanaPrincipal v = new VentanaPrincipal();
    v.initComponents();
    
   }
}
