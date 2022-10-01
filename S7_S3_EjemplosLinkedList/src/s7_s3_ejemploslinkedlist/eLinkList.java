
package s7_s3_ejemploslinkedlist;

import java.util.*;
public class eLinkList {
    
    LinkedList<String> alumnos = new LinkedList<String>();
    public eLinkList(){
        //agregar elementos
        alumnos.add("Ricardo");
        alumnos.add("Paola");
        alumnos.add("Ernesto");
        alumnos.add("Sebastian");
        alumnos.add("Fabiana");
    
        
        Iterator<String> itrL = alumnos.iterator();
        
        while(itrL.hasNext()){
            
            System.out.println("El alumno es " + itrL.next());
        }
        
        alumnos.add(1, "Carola");
        
        System.out.println("Agregando un elemento en la posición 1");
        
        Iterator<String> itrL1 = alumnos.iterator();
        while(itrL1.hasNext()){
            
            System.out.println("El alumno es " + itrL1.next());
        }
        
        //agregando una siguiente lista de alumnos
        LinkedList<String> alumnos2 = new LinkedList<String>();
        alumnos2.add("Miguel");
        alumnos2.add("Ana");
        
        alumnos2.addAll(alumnos);
        
        
        System.out.println("Recorriendo la lista de elemento de alumnos2");
        Iterator<String> itrL2 = alumnos2.iterator();
        while(itrL2.hasNext()){
            
            System.out.println("El alumno es " + itrL2.next());
        }
        
        //agregar un elemento al iniciar alumnos2
        alumnos2.addFirst("Pepe");
        
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        //agregar elemento al finalizar alumnos2
        alumnos2.addLast("Andrea");
        alumnos2.addLast("Ricardo");
        
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.remove("Ricardo");
        
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.removeLast();
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.removeLast();
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        
        alumnos2.remove();        
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.addLast("Carola");
        alumnos2.addLast("Miguel");
        
        alumnos2.add(3, "Miguel");
        
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.removeFirstOccurrence("Miguel");
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.removeLastOccurrence("Miguel");
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);
        
        alumnos2.removeLastOccurrence("Miguel");
        System.out.println("la Lista de elementos de alumnos2" + alumnos2);


        
    }
    
    
    
}
