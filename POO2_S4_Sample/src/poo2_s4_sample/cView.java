
package poo2_s4_sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class cView {

    JFrame f;
    JButton bProcesa;
    JLabel lFabricante, lTPrograma, lDispositivo;
    JComboBox cbFabricante, cbTPrograma, cbDispositivo;
    String[] fabricantes = {"Microsoft","Apple","Linux"};
    String[] TPrograma = {"Sistema Operativo","Lenguaje de Programación"};
    String[] Dispositivo = {"Celulares","Tablas","Otros"};
    
    public cView(){
    
        f= new JFrame("Software Factory");
        
        //Fabricantes
        lFabricante = new JLabel("Fabricante");
        lFabricante.setBounds(50, 50, 100, 30);
        
        cbFabricante = new JComboBox(fabricantes);
        cbFabricante.setBounds(150, 50, 200, 30);
        
        //Tprograma
        lTPrograma = new JLabel("Tipo de Programa");
        lTPrograma.setBounds(50, 100, 100, 30);

        cbTPrograma = new JComboBox(TPrograma);
        cbTPrograma.setBounds(150, 100, 200, 30);
        
        cbTPrograma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String prog = (String) cbTPrograma.getSelectedItem();
                
                if (prog == "Lenguaje de Programación"){
                    //Dispositivo
                    lDispositivo = new JLabel("Tipo de Programa");
                    lDispositivo.setBounds(50, 150, 100, 30);

                    cbDispositivo = new JComboBox(Dispositivo);
                    cbDispositivo.setBounds(150, 150, 200, 30);
                    f.add(lDispositivo);
                    f.add(cbDispositivo);
                }
                
            }
        });
        

        
        
        
        
        bProcesa = new JButton("Procesa");
        bProcesa.setBounds(100, 200, 100, 30);
        
        f.add(lFabricante);
        f.add(cbFabricante);
        f.add(lTPrograma);
        f.add(cbTPrograma);
        
        
        f.add(bProcesa);
        
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
