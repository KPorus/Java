import java.util.Scanner;

class Test{
    String value;
    // default constructor
    Test()
    {
        System.out.println("Default constructor");
    }

    //parameterized constructor
    Test(String value)
    {
        System.out.println(value);
    }
    // contructor overloading
    Test(String value, int time){
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        System.out.println(value + ""+time);
        scanner.close();
    }
    // copy contructor
    Test(Test o){
        System.out.println(o.value);
    }
}
public class Constructor {
    public static void main(String [] args)
    {
        Test ob = new Test();
        ob.value = "Copy constructor";
        Test ob1 = new Test("Parameterized constructor");
        Test ob3 = new Test("Parameterized constructor",0);
        Test ob2 = new Test(ob);
    }
}
