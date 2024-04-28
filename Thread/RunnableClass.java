package Thread;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Frist Thread");
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        System.out.println("Secound thread started");
    }
}
public class RunnableClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable2());
        t1.start();
        t2.start();   
    }
}
