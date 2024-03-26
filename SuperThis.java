class Parent {
    private int a;
    private int b;
    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }
}

class Child extends Parent {
    private int c;

    // Add a constructor for Child and call the super constructor
    Child(int a, int b, int c) {
        super(a, b);
        this.c = c;
        int sum = a + b + this.c;
        System.out.println("Sum of three variables: " + sum);
    }
}

public class SuperThis {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child(2, 4, 3);
    }
}
