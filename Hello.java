// two data type: primitive and non-primitive
// primative data types predifined in java such as: int, long, float, double
// non-primative data types defined by programmer in java. such as: String, Arrays, Classes
public class Hello {
  final public static int num = 3; // static rule
  final public static String firstName = "Fardin ";
  final public static String lastName = "Khan";
  final public static char[] myName = { 'F', 'a', 'r', 'd' }; // char array
  final public int num1 = 3; // instance rule

  static void myMethod() {
    System.out.println("Called inside the method.");
  }

  public static void main(String[] args) {
    String name = "Hello";
    Hello instance = new Hello(); // create instance
    System.out.println("Hello World"); // println is " print line" which provide new line
    System.out.print("Hello "); // print doesn't provide new line
    System.out.print("world\n");
    System.out.println(num);
    System.out.println(instance.num1 + 1); // using instance
    System.out.println(name.toUpperCase()); // upercase function
    System.out.println(name.toLowerCase()); // lowercase function
    if (name.length() > 0) {
      System.out.println(name.substring(0, name.length() - 2)); // substring return a value in between begining index to                                                                // end index
    }
    System.out.println(name + " " + firstName.concat(lastName) + " " + num + "\n" + " \"Vikings\" "); // concat the
                                                                                                      // string
    for (int i = 0; i < 10; i++) {
      System.out.println("Random number up to 10 " + (int) (Math.random() * 11)); // printing random number upto 0 to 10
      System.out.println("Random number up to 100 " + (int) (Math.random() * 101)); // printing random number upto 0 to
                                                                                    // 100
    }
    // using do while loop
    int i = myName.length;
    System.out.println(i);
    do {
      i--; // Decrement i before accessing the array
      if (i >= 0) {
        System.out.println(myName[i]);
      }
    } while (i > 0);
    
    // calling method
    myMethod();
  }

}
