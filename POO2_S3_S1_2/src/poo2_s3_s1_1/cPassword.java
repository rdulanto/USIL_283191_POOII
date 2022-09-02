
package poo2_s3_s1_1;

import javax.swing.*;
public class cPassword {
    
    JFrame f;
    JLabel l, lUser, lPass;
    JPasswordField pw;
    JButton b;
    JTextField tf;
    
    public cPassword(){
    
        f = new JFrame("Ejemplo de JPasswordField");
        l = new JLabel();
        l.setBounds(20,150,200,50);
        
        pw = new JPasswordField();
        pw.setBounds(100, 75, 100, 30);
        
        lUser = new JLabel("Usuario: ");
        lUser.setBounds(20, 20, 80, 30);
        
        lPass = new JLabel("Password: ");
        lPass.setBounds(20, 75, 80, 30);
        
        b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        
        tf = new JTextField();
        tf.setBounds(100, 20, 100, 30);
        
        f.add(pw);
        f.add(l);
        f.add(lUser);
        f.add(lPass);
        f.add(b);
        f.add(tf);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
