package Thread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of processes
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        // Input the CPU times
        int[] cpuTimes = new int[numProcesses];
        System.out.print("Enter the CPU times: ");
        for (int i = 0; i < numProcesses; i++) {
            cpuTimes[i] = scanner.nextInt();
        }

        // Set the time quantum
        System.out.print("Enter the time quantum: ");
        int timeQuantum = scanner.nextInt();

        // Initialize necessary variables
        int[] remainingTimes = new int[numProcesses];
        // System.out.println("Remaining times: "+ remainingTimes.length);
        System.arraycopy(cpuTimes, 0, remainingTimes, 0, numProcesses);
        int[] waitingTimes = new int[numProcesses];
        int[] turnaroundTimes = new int[numProcesses];
        // System.out.println("waiting times: "+ waitingTimes);
        // System.out.println("turnover times: "+ turnaroundTimes);
        int time = 0;  // Current time
        Queue<Integer> queue = new LinkedList<>();

        // Initialize the queue with all processes in FCFS order
        for (int i = 0; i < numProcesses; i++) {
            queue.add(i);
        }

        // Simulate the round-robin scheduling
        while (!queue.isEmpty()) {
            int process = queue.poll();
            if (remainingTimes[process] > timeQuantum) {
                time += timeQuantum;
                remainingTimes[process] -= timeQuantum;
                queue.add(process);
            } else {
                time += remainingTimes[process];
                remainingTimes[process] = 0;
                turnaroundTimes[process] = time;
            }
        }

        // Calculate waiting times
        for (int i = 0; i < numProcesses; i++) {
            waitingTimes[i] = turnaroundTimes[i] - cpuTimes[i];
        }

        // Calculate average waiting and turnaround times
        double averageWaitingTime = 0;
        double averageTurnaroundTime = 0;
        for (int i = 0; i < numProcesses; i++) {
            averageWaitingTime += waitingTimes[i];
            averageTurnaroundTime += turnaroundTimes[i];
        }
        averageWaitingTime /= numProcesses;
        averageTurnaroundTime /= numProcesses;

        // Display the results
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + (i + 1) + ": Waiting Time: " + waitingTimes[i] + " Turnaround Time: " + turnaroundTimes[i]);
        }

        System.out.printf("Average Waiting Time: %.2f\n", averageWaitingTime);
        System.out.printf("Average Turnaround Time: %.2f\n", averageTurnaroundTime);

        scanner.close();
    }
}
