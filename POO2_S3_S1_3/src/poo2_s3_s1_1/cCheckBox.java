
package poo2_s3_s1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class cCheckBox implements ActionListener{
    
    JFrame f;
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    
    public cCheckBox(){
    
        f = new JFrame("Ejemplo de Checkbox");
        
        l = new JLabel("Ordena tu pedido");
        l.setBounds(50, 50, 300, 20);
        
        cb1 = new JCheckBox("Pizza -> 50");
        cb1.setBounds(100, 100, 150, 20);
        
        cb2 = new JCheckBox("Hamburguesa -> 30");
        cb2.setBounds(100, 150, 150, 20);
        
        cb3 = new JCheckBox("Gaseosa -> 10");
        cb3.setBounds(100, 200, 150, 20);
        
        b = new JButton("Ordena aqui");
        b.setBounds(100, 250, 80, 30);
        
        b.addActionListener(this);
        
        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        try{
        
            float monto = 0;
            
            String opciones = "";
            
            if(cb1.isSelected()){
                monto += 50;
                opciones += "Pizza -> 50\n";
            }
            
            if(cb2.isSelected()){
                monto += 30;
                opciones += "Hamburguesa -> 30\n";
            }
            
            if(cb3.isSelected()){
                monto += 10;
                opciones += "Gaseosa -> 10\n";
            }
            
            opciones += "---------\n";
            JOptionPane.showMessageDialog(null, opciones + "Total: " + monto);
            
        }catch(Exception ex){System.out.println("Error: "+ex.toString());}
    }
}
