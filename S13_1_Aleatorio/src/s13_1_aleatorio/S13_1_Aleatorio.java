
package s13_1_aleatorio;

import java.util.Random;

public class S13_1_Aleatorio extends Thread {
    
    private static int tam = 10;
    private static int[] vec = new int[tam];
    
    private int ini, fin;

    public S13_1_Aleatorio(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
        
    }

    
    
    public void run(){
        for(int i =ini; i<fin; i++){
            vec[i] *=10;
        }
    }
    
    public static void main(String[] args) {
    
        Random ran = new Random();
        
        for (int i=0;i<vec.length;i++){
            vec[i] = ran.nextInt();
        }
        
        S13_1_Aleatorio h1 = new S13_1_Aleatorio(0,5);
        S13_1_Aleatorio h2 = new S13_1_Aleatorio(5,10);
        
        h1.start();
        h2.start();
        
        try{
            h1.join();
            h2.join();
        }catch(Exception ex){}
        
        for(int i=0; i<vec.length;i++){
            System.out.println(vec[i]+ ", ");
        }
        
    }
    
}
