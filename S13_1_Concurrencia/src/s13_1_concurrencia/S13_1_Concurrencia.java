//Para utilizar hilos, utilizamos la clase Thread
//Para ejecutar los hilos, necesitamos el meotdo start()

package s13_1_concurrencia;

public class S13_1_Concurrencia extends Thread {

    private int id;

    public S13_1_Concurrencia(int id) {
        this.id = id;
    }
    
    public void run(){
        System.out.println("Estoy ejecutando el hilo: " + id);
    }
    
    public static void main(String[] args) {

        /*
        S13_1_Concurrencia h1 = new S13_1_Concurrencia(1);
        S13_1_Concurrencia h2 = new S13_1_Concurrencia(2);
        S13_1_Concurrencia h3 = new S13_1_Concurrencia(3);
        
        h1.start();
        h2.start();
        h3.start();
        */
        
        S13_1_Concurrencia[] vec = new S13_1_Concurrencia[100];
        
        for(int i = 0; i<vec.length;i++){
            vec[i] = new S13_1_Concurrencia(i+1);
            vec[i].start();
        }
        
        try{
                for(int i = 0; i <vec.length;i++){
                vec[i].join();
            }        
        } catch(Exception ex){System.out.println("Error: "+ex);}
        

        
        System.out.println("Hola, aqui estoy. Soy el hilo principal");

    }
    
}
