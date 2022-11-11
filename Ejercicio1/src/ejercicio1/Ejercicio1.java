package ejercicio1;

public class Ejercicio1 extends Thread{

    private int id;
    
    public Ejercicio1(int id){this.id = id;}

    @Override
    public void run() {
        try {
            sleep(1000*id);
            System.out.println(1000*id);
        } catch (Exception e) {}
        System.out.println("hola mundo");
    }
    
    
    public static void main(String[] args) {
        Ejercicio1 t1 = new Ejercicio1(1);
        Ejercicio1 t2 = new Ejercicio1(2);
        Ejercicio1 t3 = new Ejercicio1(3);
        Ejercicio1 t4 = new Ejercicio1(4);
        Ejercicio1 t5 = new Ejercicio1(5);
        Ejercicio1 t6 = new Ejercicio1(6);
        
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        t6.run();
    }
    
}
