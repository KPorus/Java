
class test {
    void one() {
        System.out.println("test class");
    }
    
    void three() {
        System.out.println("test class");
    }
}

class test2 extends test {
    void one() {
        System.out.println("test2");
    }

    void two() {
        System.out.println("test2 two");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        test ob = new test2();
        ob.one();
        ob.three();
        //ob.two();
    }
}
