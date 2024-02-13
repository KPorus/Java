import java.util.Scanner;

interface GeometricObject{
    void getArea();
    void getPerimeter();
}

class Circle implements GeometricObject{
    Scanner scanner = new Scanner(System.in);
    double radius;
    public void getArea(){
        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();
        double area = 3.1416 *radius * radius;
        System.out.println("Circle Area: " + area);
    }
    public void getPerimeter(){
        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();
        double perimeter = 3.1416 * 2 * radius;
        System.out.println(" Circle Area: " + perimeter);
    }
}


class Rectangle implements GeometricObject {
    Scanner scanner = new Scanner(System.in);
    double x,y;
    
    public void getArea() {
        System.out.println("Enter length: ");
        x = scanner.nextDouble();
        System.out.println("Enter width: ");
        y = scanner.nextDouble();
        double area = x * y;
        System.out.println("Rectangle Area: " + area);
    }
    
    public void getPerimeter() {
        System.out.println("Enter radius: ");
        x = scanner.nextDouble();
        double perimeter = 2* ( x + y);
        System.out.println(" Rectangle perimeter: " + perimeter);
    }
}

public class Geometric {
    public static void main(String[] args) {
        //Geometric g;
        GeometricObject c = new Circle();
        //g = c;
        c.getArea();
        c.getPerimeter();
        GeometricObject r = new Rectangle();
        r.getArea();
        r.getPerimeter();

    }
}
