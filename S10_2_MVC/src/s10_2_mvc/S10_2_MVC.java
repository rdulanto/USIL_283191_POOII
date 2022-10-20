
package s10_2_mvc;

import Controlador.ProductoControlador;
import Modelo.Productos;
import Vista.ProductosVista;
import java.util.HashSet;

public class S10_2_MVC {
    public static void main(String[] args) {

        Productos modelo = DatosProductos();
        
        ProductosVista vista = new ProductosVista();
        
        ProductoControlador controlador = new ProductoControlador(vista, modelo);
        
        controlador.mostrarVista();
        
        //enviandole un valor al modelo a traves del controlador
        controlador.setNombreProducto("Laptop");
        
        
        System.out.println("Luego de enviarle un valor al modelo");
        
        controlador.mostrarVista();
        
        
        
    }
    
    
    private static Productos DatosProductos(){
    
        Productos prod = new Productos();
        prod.setNombreProductos("Tablet");
        prod.setCodProductos("A0111");
        prod.setPrecioProductos(250.50);
        
        return prod;
        
    }
    
}
