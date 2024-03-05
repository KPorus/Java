abstract class test{
    protected int a;
    abstract void greet(int a); // abstruct mehtod
    void greet2(){
        System.out.println("From abstruct non abstruct");
    }; // not abstract mehtod
}

class test2 extends test{
    void greet(int a)
    {
        this.a= a;
        System.out.println("Hello"+""+this.a);
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        // dynamic mehtod dispatch
        test obj = new test2();
        obj.greet(10);
        obj.greet2();
    }
}
