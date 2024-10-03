package OOPS;

class thread1 extends Thread{
    public void statrt(){
        System.out.println("Thread 1 is calling");
    }
}
class thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 is calling");
    }
}
public class Multithreding {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.statrt();
        t2.run();

    }
}
