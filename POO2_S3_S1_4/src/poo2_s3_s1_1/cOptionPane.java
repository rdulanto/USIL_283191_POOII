
package poo2_s3_s1_1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class cOptionPane extends WindowAdapter{
    
    JFrame f;
    
    public cOptionPane(){
    
        f= new JFrame("Ejemplo de OptionPane");
        
/*
        //String nombre, mensaje;
        //JOptionPane.showMessageDialog(f,"Hola, bienvenid@!","Saludo",JOptionPane.WARNING_MESSAGE);
        
        nombre = JOptionPane.showInputDialog(f,"Ingresa tu nombre: ");
        
        mensaje = "Hola, bienvenid@: " + nombre;
        
        JOptionPane.showMessageDialog(f,mensaje,"Saludo",JOptionPane.WARNING_MESSAGE);
*/
        f.addWindowListener(this);
        
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
                
    }
    
    public void windowClosing(WindowEvent e){
        int valor = JOptionPane.showConfirmDialog(f, "Estas seguro que quieres salir?");
        
        if(valor == JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
