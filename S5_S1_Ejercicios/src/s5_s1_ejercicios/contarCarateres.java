
package s5_s1_ejercicios;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class contarCarateres implements ActionListener{
    
    JFrame f;
    JLabel lblCaracter, lblPalabra;
    JTextArea txaParrafo;
    JButton btnContar, btnColorB, btnColorT;
    lContar c;
    
    Color color;
    
    String mensajeP;

    public contarCarateres() {
        
        f= new JFrame("Contar caracteres y palabras");
        //etiquetas
        lblCaracter = new JLabel("Caracteres: ");
        lblCaracter.setBounds(50,50,400,20);
        lblPalabra = new JLabel("Palabras: ");
        lblPalabra.setBounds(50, 80, 400, 20);
        
        //textArea
        txaParrafo = new JTextArea();
        txaParrafo.setBounds(50, 110, 300, 200);
        
        //Botones
        btnContar = new JButton("Contar");
        btnContar.setBounds(50, 320, 100, 30);
        btnContar.addActionListener(this);
    
        
        btnColorB = new JButton("Color de Fondo");
        btnColorB.setBounds(150, 320, 100, 30);
        btnColorB.addActionListener(this);
        
        btnColorT = new JButton("Color de Fondo");
        btnColorT.setBounds(250, 320, 100, 30);
        btnColorT.addActionListener(this);
        
        f.add(lblCaracter);
        f.add(lblPalabra);
        f.add(txaParrafo);
        f.add(btnColorB);
        f.add(btnColorT);
        f.add(btnContar);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        try{
        
            if(e.getSource()==btnContar){
                mensajeP = txaParrafo.getText();
                c = new lContar(mensajeP);
                lblCaracter.setText("La cantidad de caracteres es: " +c.Caracteres());
                
                lblPalabra.setText("La cantidad de palabras es: " + c.Palabras());
                
            }else if(e.getSource()==btnColorB){
                color = JColorChooser.showDialog(btnContar, "Escoge un color", Color.BLACK);
                txaParrafo.setBackground(color);
            }else if(e.getSource()==btnColorT){
                color = JColorChooser.showDialog(btnContar, "Escoge un color", Color.BLACK);
                txaParrafo.setForeground(color);
            }
            
            
        }catch(Exception ex){ System.out.println("Error: "+ ex.toString());}
    }
    
}
