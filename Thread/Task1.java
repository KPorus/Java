package Thread;
public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        // Creating threads
        Thread nameThread = new Thread(new NamePrinter());
        Thread idThread = new Thread(new IDPrinter());
        Thread cgpThread = new Thread(new CGPPrinter());

        // Starting threads
        nameThread.start();
        idThread.start();
        cgpThread.start();

        nameThread.join();
        idThread.join();
        cgpThread.join();
        System.out.println("Completed ");
    }

    // Thread to print name 5 times with 1s difference
    static class NamePrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Your Name");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Thread to print ID 10 times with 2s difference
    static class IDPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Your ID");
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Thread to print CGP 20 times with 5s difference
    static class CGPPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("Your CGP");
                try {
                    Thread.sleep(3000); // Sleep for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
