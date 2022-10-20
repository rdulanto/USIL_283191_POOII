
//esta clase representa el controlador de Producto
package Controlador;

import Modelo.Productos;
import Vista.ProductosVista;

public class ProductoControlador {
    
    //Declaramos objetos que representan
    //la vista y el modelo
    
    private ProductosVista vista;
    private Productos modelo;
    
    //Creando metodo constructor
    public ProductoControlador(ProductosVista vista, Productos modelo){
    
        this.vista = vista;
        this.modelo = modelo;
        
    }
    
    //Generar Getter y Setter
    public void setNombreProducto(String NombreProducto){
        modelo.setNombreProductos(NombreProducto);
    }
    
    public String getNombreProducto(){
        return modelo.getNombreProductos();
    }
    
    public void setCodigoProducto(String CodigoProducto){
        modelo.setCodProductos(CodigoProducto);
    }
    
    public String getCodigoProducto(){
        return modelo.getCodProductos();
    }
    
    public void setPrecioProducto(Double PrecioProducto){
        modelo.setPrecioProductos(PrecioProducto);
    }
    
    public Double getPrecioProducto(){
        return modelo.getPrecioProductos();
    }
    
    
    //metodo para mostrar los datos
    public void mostrarVista(){
        vista.verDetalleProductos(modelo.getNombreProductos(), 
                modelo.getCodProductos(), 
                modelo.getPrecioProductos());
    }
    
    
}
