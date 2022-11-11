
package s13_1_contador;

public class S13_1_Contador extends Thread{

    private static int cont = 0;
    
    public void run(){
        for(int i = 0; i<100; i++){
            cont++;
        }
    }    
    
    public static void main(String[] args) {
        
        S13_1_Contador[] vec = new S13_1_Contador[100];
        
        for(int i=0; i < vec.length; i++){
            vec[i] = new S13_1_Contador();
            vec[i].start();
        }
        
        try{
            for(int i=0; i < vec.length; i++){
                vec[i].join();
            }    
        }catch(Exception ex){System.out.println("Error: " + ex);}
        
        System.out.println("El contador: "+ cont);
        
    }
    
}
