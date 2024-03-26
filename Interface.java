interface Test {
    int a = 10; // Constant field, implicitly public, static, and final

    void someMethod(); // Method signature
}

public class Interface implements Test {
    public static void main(String[] args) {
        // Print the value of 'a' from the interface
        System.out.println("Value of 'a' from the interface: " + Test.a);

        // Create an instance of Interface (or any class that implements Test)
        Interface myInstance = new Interface();

        // Call someMethod on the instance
        myInstance.someMethod();
    }

    @Override
    public void someMethod() {
        // Implementation of the method
        System.out.println("from someMethod");
    }
}
