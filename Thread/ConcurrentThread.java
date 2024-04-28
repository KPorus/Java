package Thread;
//Calling thread by extending Thread class
class MyThread extends Thread{
    public void run(){
        int i =0;
        while (i<100) {
            System.out.println("Frist Thread is running");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("Second Thread is running");
            i++;
        }
    }
}
public class ConcurrentThread {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
