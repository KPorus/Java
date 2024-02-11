class Rectangle{
    int length;
    Rectangle(){
        length = 15;
    }
}

class Triangle{
    int base;
    Triangle(){
        base = 10;
    }
}

class Test{
    void compare(Triangle t1, Rectangle re){
        if(t1.base > re.length){
            System.out.println("base is greater than lenght");
        }
        else if(t1.base < re.length){
            System.out.println("lenght is greater than base");
        }
        else{
            System.out.println("base is equal to lenght");
        }
    }
}
public class ClassTest{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t1 = new Triangle();
        Test t2 = new Test();
        t2.compare(t1, r);
    }
}