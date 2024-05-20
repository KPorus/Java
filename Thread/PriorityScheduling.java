package Thread;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Process {
    int id;
    int cpuTime;
    int priority;
    int waitingTime;
    int turnaroundTime;

    Process(int id, int cpuTime, int priority) {
        this.id = id;
        this.cpuTime = cpuTime;
        this.priority = priority;
    }
}

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of processes
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        Process[] processes = new Process[numProcesses];

        // Input the CPU times
        System.out.println("Enter the CPU times:");
        for (int i = 0; i < numProcesses; i++) {
            int cpuTime = scanner.nextInt();
            processes[i] = new Process(i + 1, cpuTime, 0); // temporary priority of 0
        }

        // Input the priorities
        System.out.println("Enter the priorities:");
        for (int i = 0; i < numProcesses; i++) {
            processes[i].priority = scanner.nextInt();
        }

        // Sort processes based on priority (higher priority first), then by arrival order if equal
        Arrays.sort(processes, Comparator.comparingInt((Process p) -> p.priority).thenComparingInt(p -> p.id));

        // Calculate waiting and turnaround times
        int currentTime = 0;
        for (Process process : processes) {
            process.waitingTime = currentTime;
            process.turnaroundTime = currentTime + process.cpuTime;
            currentTime += process.cpuTime;
        }

        // Calculate average waiting and turnaround times
        double averageWaitingTime = 0;
        double averageTurnaroundTime = 0;
        for (Process process : processes) {
            averageWaitingTime += process.waitingTime;
            averageTurnaroundTime += process.turnaroundTime;
        }
        averageWaitingTime /= numProcesses;
        averageTurnaroundTime /= numProcesses;

        // Display the results
        for (Process process : processes) {
            System.out.println("Process " + process.id + ": Waiting Time: " + process.waitingTime + " Turnaround Time: " + process.turnaroundTime);
        }

        System.out.printf("Average Waiting Time: %.2f\n", averageWaitingTime);
        System.out.printf("Average Turnaround Time: %.2f\n", averageTurnaroundTime);

        scanner.close();
    }
}
