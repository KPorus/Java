package Thread;
class Odd extends Thread {
    public void run() {
        System.out.println("Frist Thread");
        int i =0;
        while(i<=20){
            if(i%2!=0){
                System.out.println("Odd number: " + i);
            }
            i++;
        }
    }
}

class Even extends Thread {
    public void run() {
        System.out.println("Secound thread started");
        int i =0;
        while(i<=20){
            if(i%2==0){
                System.out.println("Even number: " + i);
            }
            i++;
        }
    }
}
public class OddEven {
    public static void main(String[] args){
        Odd t1 = new Odd();
        Even t2 = new Even();
        t1.start();
        t2.start();
    }
}
