package s5_s1_ejercicios;

public class lContar {

    String mensaje;
    
    public lContar(String parrafo){
        mensaje = parrafo;
    }
    
    public int Caracteres(){
        int car= mensaje.length();
        return car;
    }
    
    public int Palabras(){
        String[] palabras=mensaje.split("\\s");
        int cPalabras = palabras.length;
        return cPalabras;
    }
    
}
