
package Controller;

import Model.IMC;
import View.IMC_View;

public class IMC_Controller {

    private IMC model;
    private IMC_View view;
    
    public IMC_Controller(IMC model, IMC_View view){
        this.model = model;
        this.view = view;
    }
    
    public void setAltura(double altura){
        model.setAltura(altura);
    }
    
    public double getAltura(){
    
        return model.getAltura();
        
    }
    
    public void setPeso(double peso){
        model.setAltura(peso);
    }
    
    public double getPeso(){
    
        return model.getPeso();
        
    }
    
    public void mostrarVista(){
    
        view.mostrarResultado(model.getPeso(), model.getAltura(), model.calcIMC());
        
    }
            
    
}
