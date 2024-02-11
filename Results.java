import java.util.Scanner;

class Marks {
    private static int rollNumberCounter = 1;

    private int rollNumber;
    private String name;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    Marks(String name, int physicsMarks, int chemistryMarks, int mathMarks) {
        this.rollNumber = rollNumberCounter++;
        this.name = name;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("Chemistry Marks: " + chemistryMarks);
        System.out.println("Mathematics Marks: " + mathMarks);
    }
}

class Physics extends Marks {
    Physics(String name, int physicsMarks) {
        super(name, physicsMarks, 0, 0);
    }
}

class Chemistry extends Marks {
    Chemistry(String name, int chemistryMarks) {
        super(name, 0, chemistryMarks, 0);
    }
}

class Mathematics extends Marks {
    Mathematics(String name, int mathMarks) {
        super(name, 0, 0, mathMarks);
    }
}

public class Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = scanner.nextInt();

        Marks[] students = new Marks[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Physics Marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Chemistry Marks: ");
            int chemistryMarks = scanner.nextInt();
            System.out.print("Mathematics Marks: ");
            int mathMarks = scanner.nextInt();

            students[i] = new Marks(name, physicsMarks, chemistryMarks, mathMarks);
        }

        for (Marks student : students) {
            student.displayDetails();
            System.out.println("------------");
        }

        scanner.close();
    }
}
