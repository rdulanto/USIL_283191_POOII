
package poo2_s3_s1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class cComboBox implements ActionListener{
    
    JFrame f;
    JLabel l;
    JButton b;
    JComboBox cb;
    
    //String productos[];
    
    public cComboBox(){
    
        f = new JFrame("Ejemplo de ComboBox");
        l = new JLabel();
        //l.setBounds(200, 50, 400, 100);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        
        b = new JButton("Opera");
        b.setBounds(200, 100, 75, 20);
        
        b.addActionListener(this);
        
        String productos[] = {"Pizza","Hamburguesa","Gaseosa"};
        
        cb = new JComboBox(productos);
        
        cb.setBounds(50, 100, 90, 20);
        
        f.add(cb);
        f.add(l);
        f.add(b);
        
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        try{
        
            String mensaje ="El producto elegido es: ";
            
            mensaje += cb.getItemAt(cb.getSelectedIndex());
            
            l.setText(mensaje);
            
        }catch(Exception ex){System.out.println("Error: " + ex.toString());}
    }
    
}
