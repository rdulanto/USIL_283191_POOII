
package s6_s1_collections;

import java.util.*;

public class cArrayList {
    
    public cArrayList(){
    
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Fresa");
        frutas.add("Mango");
        frutas.add("Papaya");
        frutas.add("Arandano");
        
        for(String fruta:frutas)
            System.out.println(fruta);
        
        System.out.println("Mostrando el 2do elemento(fruta): " + frutas.get(1));
        
        //manipular el elemento
        frutas.set(2, "Uva");
        
        //Ordenando la lista
        Collections.sort(frutas);
        
        for(String fruta:frutas)
            System.out.println(fruta);
        
        //Recorriendo la lista de manera inversa
        /*
        ListIterator<String> lst = frutas.listIterator(frutas.size());
        
        while(lst.hasPrevious()){
            String miFruta = lst.previous();
            System.out.println("La fruta es: " + miFruta);
        }
        */
        
        
    }
    
    
}
