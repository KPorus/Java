interface Greet{
    void greet();
}
interface Welcome extends Greet{
    default void greet()
    {
        System.out.println("From welcome class");
    }
}

interface Final extends Welcome{
    String msg = "Hello";
    default void greet() {
        System.out.println("Called from Final class");
    }
}
public class DiamonProblem2 implements Welcome, Final{
    public void greet()
    {
        System.out.println("After overriding");
        System.out.println("from Final class"+msg);
    }
    public static void main(String[] args)
    {
        DiamonProblem2 ob = new DiamonProblem2();
        ob.greet();
    }
}
