

package com.mycompany.s8_s1_files;

import java.util.*;
import java.io.*;

public class S8_S1_Files {

    public static void main(String[] args) {

        Scanner nombreArchivo = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa el nombre del archivo: ");
        nombre = nombreArchivo.nextLine();
        
        File archivo = new File(nombre);
        
        if(archivo.exists() && archivo.isFile())
        {
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("¿Admite lectura? " + archivo.canRead());
            System.out.println("¿Admite escritura? " + archivo.canWrite());
            System.out.println("Tamaño en bytes: " + archivo.length());
            System.out.println("Fecha de ultima actualizacion: " + new Date(archivo.lastModified()));
        }
        else {
            System.out.println("No existe el archivo en la ruta");
        }

    }
}
