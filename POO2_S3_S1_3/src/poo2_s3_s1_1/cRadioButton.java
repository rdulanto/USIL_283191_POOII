
package poo2_s3_s1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class cRadioButton implements ActionListener{

    JFrame f;
    JRadioButton rbGenero1, rbGenero2;
    JButton bProcesa;
    ButtonGroup bg;
    
    public cRadioButton(){
    
        f =new JFrame("Ejemplo de RadioButton");
        
        rbGenero1 = new JRadioButton("Masculino");
        rbGenero1.setBounds(100,50,100,30);
        
        rbGenero2 = new JRadioButton("Femenino");
        rbGenero2.setBounds(100,100,100,30);
        
        bg = new ButtonGroup();
        bg.add(rbGenero1);
        bg.add(rbGenero2);
        
        bProcesa = new JButton("Mostrar");
        bProcesa.setBounds(100, 150, 80, 30);
        
        bProcesa.addActionListener(this);
        
        f.add(rbGenero1);
        f.add(rbGenero2);
        f.add(bProcesa);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        try{
        
            if(rbGenero1.isSelected()){
                JOptionPane.showMessageDialog(f,"Tu genero es Masculino");
                
            }
            
            if(rbGenero2.isSelected()){
                JOptionPane.showMessageDialog(f, "Tu genero es Femenino");
            }
        }catch(Exception ex){System.out.println("Error: " + ex.toString());}
    }
}
