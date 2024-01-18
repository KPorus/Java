public class DecimalString {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.2;
        String c = "Hello";
        System.out.println(a + b + c);
    }
}

// Output will be: 30.2Hello.
// Causes: First, 'a + b' is calculated, resulting in a double.
// After that, it's concatenated with the string 'c'.
// When a number is added to a string using '+', the final result becomes a
// string.
// So, 'a + b' gives us 30.2, and after 'a + b + c', it gives 30.2Hello.
