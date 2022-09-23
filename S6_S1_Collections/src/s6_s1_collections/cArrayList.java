
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
        
        for(int i=0; i<frutas.size();i++){
            System.out.println("La fruta ahora es: " + frutas.get(i));
        }
        
        
        int mFruta = frutas.size()-1;
                //System.out.println(mFruta);
        for(int i=mFruta; i>=0;i--){
            System.out.println("La fruta ahora es: " + frutas.get(i));
        }
        
        
        //utilizando la clase Alumnos
        
        Alumno al1 = new Alumno(1001, "Carlos", 22);
        Alumno al2 = new Alumno(1002, "Roxana", 23);
        Alumno al3 = new Alumno(1003, "Leyla", 21);
        Alumno al4 = new Alumno(1004, "Jose", 20);
        
        ArrayList<Alumno> arrAlum = new ArrayList<Alumno>();
        arrAlum.add(al1);
        arrAlum.add(al2);
        arrAlum.add(al3);
        arrAlum.add(al4);
        
        Iterator itr = arrAlum.iterator();
        
        while(itr.hasNext()){
            Alumno al = (Alumno)itr.next();
            System.out.println("El alumno " + al.nombre + " con codigo " + 
                    al.codigo + " tiene " + al.edad + " años.");
        }
        
    }
    
    
}
