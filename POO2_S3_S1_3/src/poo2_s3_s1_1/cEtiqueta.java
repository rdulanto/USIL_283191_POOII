package poo2_s3_s1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class cEtiqueta implements ActionListener {
    
    
    JFrame f;
    JTextField tf;
    JButton b;
    JLabel l;
    
    public cEtiqueta(){
        tf = new JTextField();
        tf.setBounds(50,50,150,20);
        
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        
        b = new JButton("Busca IP");
        b.setBounds(50, 150, 95, 30);
        
        b.addActionListener(this);
        
        f = new JFrame("Ejemplo de JLabel");
        
        f.add(tf);
        f.add(b);
        f.add(l);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        try{
            
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            
            String mensaje = "La IP de " + host + " es: " + ip;
            
            l.setText(mensaje);
            
        }catch(Exception ex){l.setText(ex.toString());}
        
    }
    
}
