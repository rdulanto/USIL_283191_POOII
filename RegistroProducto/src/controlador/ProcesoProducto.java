package controlador;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Producto;

public class ProcesoProducto {
    String ruta = "Registro\\DB_PRODUCTOS.txt";

    //LECTURA
    FileReader fr;
    BufferedReader br;

    //ESCRITURA
    FileWriter fw;

    //OBJETO
    Producto pro = new Producto();

    public ArrayList<Producto> array = new ArrayList();

    //METODO INSERTAR
    public void insertar(Producto pro) throws FileNotFoundException, IOException {
        fw = new FileWriter(ruta, true); //abrir el archivo
        String cadena = pro.getCodigo() + "-" + pro.getNombre() + "-" + pro.getDescripcion() + "-" + pro.getPrecio() + "-" + pro.getCantidad();
        fw.write(cadena); //guarda la informacion
        fw.write(10); //enter
        fw.close(); //cerrar
    }

    //METODO LEER
    public void leer() throws FileNotFoundException, IOException {
        array.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);

        //Leer la primera fila del archivo
        String cadena = br.readLine();
        String vec[];
        
        while (cadena != null) {            
            vec = cadena.split("-");
            pro = new Producto(vec[0],
                    vec[1],
                    vec[2],
                    Float.parseFloat(vec[3]), 
                    Integer.parseInt(vec[4]));
            array.add(pro);
            cadena = br.readLine();
        }
    }
}
