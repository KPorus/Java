package File;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next(); // for taking a word
        String message = scanner.nextLine();// for taking a string line;
        System.out.println(line);
        System.out.println(message);
    }
}
