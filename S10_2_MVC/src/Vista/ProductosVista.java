//Esta clase lo que representa es la interaccion con el usuario
package Vista;

public class ProductosVista {
    
    
    public void verDetalleProductos(String nombreProducto, 
            String codProducto, Double precioProducto){
    
        System.out.println("Detalle de Productos");
        System.out.println("El Producto es: " + nombreProducto);
        System.out.println("El Codigo: " + codProducto);
        System.out.println("Precio: " + precioProducto);
    }
    
}
