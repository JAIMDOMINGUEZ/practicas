
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;

public class Ventana extends JFrame {
    public Ventana(){
        initComponents();
        this.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void initComponents(){
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Archivo");
        JMenu proc = new JMenu("Procesar");
        JMenuItem open = new JMenuItem("abrir");
        JMenuItem end = new JMenuItem("Salir");
        JMenuItem start = new JMenuItem("Iniciar");
        start.enable(false);
        menuBar.add(file);
        menuBar.add(proc);
        file.add(open);
        file.add(end);
        end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();//cerrar ventana
            }
        });
        proc.add(start);
        this.setJMenuBar(menuBar);
        this.setTitle("ExamenLaboratorio");

    }
    //Componentes
    JMenuBar menuBar;
    JMenu file;
    JMenu proc;
    JMenuItem open;
    JMenuItem end;
    JMenuItem start;
    
    public static void main(String[] args) {
        Ventana ven = new Ventana();
        ven.setVisible(true);
       }
    
}
