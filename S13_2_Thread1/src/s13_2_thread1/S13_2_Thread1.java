
package s13_2_thread1;

public class S13_2_Thread1 extends Thread{

    public void run(){
    
        for(int i= 1; i<=100; i++){
        
            System.out.println(" "+i + " ");
            
            try{
                sleep(1000);
            }catch(Exception ex){}
            
        
        }
    
    }
    
    public static void main(String[] args) {

        S13_2_Thread1 h1 = new S13_2_Thread1();
        h1.start();
        
    }
    
}
