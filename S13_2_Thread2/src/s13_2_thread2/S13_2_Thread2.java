
package s13_2_thread2;

public class S13_2_Thread2 extends Thread{

    String autoN;

    public S13_2_Thread2(String name) {
        this.autoN = name;
    }
    
    public void run(){
        for(int i = 1; i<=50; i++){
        
            //System.out.println(i+ "km");
        
        }
        System.out.println("Llego a la meta: " + autoN);
    }
    
    public static void main(String[] args) {

        S13_2_Thread2 a1 = new S13_2_Thread2("auto1");
        S13_2_Thread2 a2 = new S13_2_Thread2("auto2");
        S13_2_Thread2 a3 = new S13_2_Thread2("auto3");
        S13_2_Thread2 a4 = new S13_2_Thread2("auto4");
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        
        try{
            
            a1.join();
            a2.join();
            a3.join();
            a4.join();

        }catch(Exception ex){}
        
        System.out.println("Termino la carrera..");

    }
    
}
