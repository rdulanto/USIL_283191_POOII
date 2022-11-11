
package s9_alumnos;

import javax.swing.*;


public class Interfaz {
    
    JFrame f;
    JTable jt;
    
    public Interfaz(){
        f = new JFrame("Interfaz de alumnos");
        
        String datos[][] = {{"101","Ricardo","Dulanto"},
                            {"102","Maria","Pastor"},
                            {"103","Carla","Lopez"}};
        
        String cabecera[] = {"Codigo","Nombre","Apellido"};
        
        jt = new JTable(datos, cabecera);
        
        jt.setBounds(30, 40, 200, 300);
        
        JScrollPane sp = new JScrollPane(jt);
        
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
        
        
    }
    
}
