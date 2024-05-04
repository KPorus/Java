package Thread;
import java.util.Scanner;

class Pc {
    void produce() throws Exception {
        synchronized (this) {
            try {
                System.out.println("Producing");
                wait();
                System.out.println("Resuming processing");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void consume() throws Exception {
        synchronized (this) {
            try {
                System.out.println("Consuming");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                System.out.println("Getting notification key");
                sc.close();
                notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Pc pc = new Pc();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.produce();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }            
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}