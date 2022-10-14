
package s9_file;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

import java.io.*;


public class Interfaz implements ActionListener{
    
    JTextArea jtaTexto;
    JButton btnGuarda;
    JFrame f;
    FileWriter fw = null;
    PrintWriter pw = null;
    
    
    public Interfaz(){
        
    f = new JFrame("Ejemplo de Clase File");
    jtaTexto = new JTextArea();
    jtaTexto.setBounds(50, 25, 250, 200);
    
    //Boton
    btnGuarda = new JButton("Guardar");
    btnGuarda.setBounds(100,300,120,30);
    btnGuarda.addActionListener(this);
    
    
    f.add(jtaTexto);
    f.add(btnGuarda);
    
    
    f.setSize(450,450);
    f.setLayout(null);
    f.setVisible(true);
           
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        String texto = jtaTexto.getText();
        
        try{
            
            fw = new FileWriter("Miarchivo.txt");
            pw = new PrintWriter(fw);
            
            pw.println(texto);
            
            JOptionPane.showMessageDialog(null,"Archivo generado");
            
            pw.close();
            
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
    
}
