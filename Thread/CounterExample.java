package Thread;

public class CounterExample {
    private static int counter = 0;
    private static final Object lock = new Object(); // Object for synchronization
    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new Thread(new IncrementTask());
        Thread thread2 = new Thread(new IncrementTask());
        
        // Starting threads
        thread1.start();
        thread2.start();

         // Wait for threads to finish
         try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print final counter value
        System.out.println("Final counter value: " + counter);
    }
    
    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                // Increment the counter
               synchronized(lock){
                counter++;
               }
            }
            System.out.println("Thread finished, counter: " + counter);
        }
    }
}
