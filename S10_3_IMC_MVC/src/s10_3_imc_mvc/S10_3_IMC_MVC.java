
package s10_3_imc_mvc;

import Controller.IMC_Controller;
import Model.IMC;
import View.IMC_View;

public class S10_3_IMC_MVC {

    public static void main(String[] args) {

        IMC model = obtenerDatos();
        
        IMC_View view = new IMC_View();
        
        IMC_Controller cont = new IMC_Controller(model, view);
        
        cont.mostrarVista();
        
        
    }
    
    private static IMC obtenerDatos(){
        IMC datos = new IMC();
        datos.setAltura(1.80);
        datos.setPeso(65);
        return datos;
        
    
    }
    
    
}
