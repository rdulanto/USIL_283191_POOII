
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
        
        
        //elimniar el elemento
        frutas.remove("Arandano");
        System.out.println("Se elimino Arandano");
        
        frutas.remove(0);
        System.out.println("Se elimino el primer elemento");
        for(String fruta:frutas)
            System.out.println(fruta);
        
        
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        
        for(Integer numero:numeros)
            System.out.println(numero);
        
        numeros.remove((Integer)1);
        System.out.println("Eliminando numeros");
        for(Integer numero:numeros)
            System.out.println(numero);
        
        
        ArrayList<Integer> misNumeros = new ArrayList<>();
        misNumeros.add(4);
        misNumeros.add(5);
        misNumeros.add(6);
        
        //Agregando elementos de numeros
        misNumeros.addAll(numeros);
        
        Collections.sort(misNumeros);
        
        System.out.println("Mostrando la nueva lista de misNumeros");
        for(Integer numero:misNumeros)
            System.out.println(numero);
        
        //eliminado los elementos que pertenecen a numeros
        misNumeros.removeAll(numeros);
        
        
        System.out.println("eliminado los elementos que pertenecen a numeros");
        for(Integer numero:misNumeros)
            System.out.println(numero);
        
        //misNumeros.removeIf(str -> {str.contains(4);});
        
        misNumeros.clear(); 
        System.out.println("Eliminando todos los elementos de la lista");
        for(Integer numero:misNumeros)
            System.out.println(numero);
        
        
        System.out.println("¿La lista esta vacia? " + 
                misNumeros.isEmpty());
        /*
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
         */
    }
    
    
}
