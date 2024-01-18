import java.util.Scanner;

public class DecimalToBinary{
    public static int decimal;
    public static int binary;
    private static int convertDecimalToBinary(int decimal){
        // StringBuilder is a class of java.lang. It is mutable and its used to
        // append,insert,replace and delete characters
        // sequence
        StringBuilder binaryBuilder = new StringBuilder(); 
        while (decimal>0) {
            int remainder = decimal % 2;
            decimal=decimal/2;
            binaryBuilder.insert(0, remainder);
        }
        binary = Integer.parseInt(binaryBuilder.toString());
        return binary;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a decimal value: ");
            decimal = scanner.nextInt();
            int result = convertDecimalToBinary(decimal);
            System.out.println("Binary: " + result);
        } catch (Exception e) {
            scanner.close();
        }
    }
}