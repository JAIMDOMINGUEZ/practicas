package mx.com.softgame.poo1game.ventanas;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
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
        txtFil = new JTextField(20);
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
        btnOpen.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
               openFile();
          }
          });  

         
        f.add(txtCont);
        f.add(lblLeidos);
        f.add(lblN);
        f.add(btnExit);
        btnExit.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent o){
               f.dispose();
          }
          }); 
        f.pack();
        f.setSize(550,440);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

   }
   public static void main(String[]args){
    VentanaPrincipal v = new VentanaPrincipal();
    v.initComponents();
    
   }
   public void openFile(){
          String file = txtFil.getText();
          String path = System.getProperty("user.home")+System.getProperty("file.separator")+file;
          System.out.println(path);
          txtCont.setText("");
          File archivo = new File(path);
          if (!archivo.exists()) {
               JOptionPane.showMessageDialog(f,"El archivo no existe ");
               return;
          }
          
          if(archivo.isFile()){
               getContenido(archivo);
          }
          if(archivo.isDirectory()){
               getlist(archivo);
          }
     
     }
     
     public void getContenido(File f){
          try {
               FileReader fe = new FileReader(f);
               BufferedReader be = new BufferedReader(fe);
               int count = 0;
               String linea;
               while((linea = be.readLine())!=null) {
                    txtCont.append(linea+"\n");
                    count = linea.length()+count;
                    System.out.println(linea);
                }
               be.close();
               lblN.setText(Integer.toString(count));
          } catch (Exception e) {
               e.printStackTrace();
          } 
     }
     public void getlist(File f){
         
          
          try {
               //FileReader fe = new FileReader(f);
               String[] contenido = f.list();
               //BufferedReader be = new BufferedReader(fe);
               int count = 0;
               
               for (String linea : contenido) {
                    if(linea!=null){
                         txtCont.append(linea+"\n");
                         count = linea.length()+count;
                         System.out.println(linea);
                    }
               }
               
               
               lblN.setText(Integer.toString(count));
          } catch (Exception e) {
               e.printStackTrace();
          } 
     }
   
  
}

