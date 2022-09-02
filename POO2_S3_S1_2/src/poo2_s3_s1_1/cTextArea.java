
package poo2_s3_s1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.*;

public class cTextArea implements ActionListener{
    
    JLabel l1, l2;
    JButton b;
    JTextArea ta;    
    JFrame f;
    
    public cTextArea(){
    
        f = new JFrame("Ejemplo de TextArea");
        l1 = new JLabel();
        l1.setBounds(50, 25, 100, 30);
        l2 = new JLabel();
        l2.setBounds(160, 25, 100, 30);
        
        ta = new JTextArea();
        ta.setBounds(20,75,250,200);
        
        b = new JButton("Contar Palabras");
        b.setBounds(100, 300, 120, 30);
        
        b.addActionListener(this);
        
        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        
        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        
        String texto = ta.getText();
        String palabras[] = texto.split("\\s");
        
        l1.setText("Palabras: " + palabras.length);
        l2.setText("Caracteres: " + texto.length());
        
        
    }
}
