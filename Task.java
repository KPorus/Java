class Box{
    private int length;
    private int height;
    Box(){
        length = 5;
        height = 10;
        System.out.println("From Box default constructor lenght & height" + " "+length +" & "+ height);
    }
    Box(int length, int height){
        this.length = length;
        this.height = height;
        System.out.println("From Box parameterized constructor lenght & height" + " " + length + " & " + height);
    }
    Box(Box b){
        length = b.length;
        height = b.height;
        System.out.println("From Box copy constructor lenght & height" + " " + length + " & " + height);
    }
}
class BoxWeight extends Box{
    private int weight;
    BoxWeight(){
        weight = 15;
        System.out.println("From BoxWeight default constructor weight" + " "+weight);
    }
    
    BoxWeight(int weight){
        this.weight = weight;
        System.out.println("From Box parameterized constructor weight" + " " + weight);
    }
    
    BoxWeight(BoxWeight b1){
        weight = b1.weight;
        System.out.println("From Box copy constructor weight" + " " + weight);
    }
}

class BoxColor extends BoxWeight {
    private String color;

    BoxColor() {
        color = "red";
        System.out.println("From BoxWeight default constructor color" + " " + color);
    }

    BoxColor(String color) {
        this.color = color;
        System.out.println("From Box parameterized constructor color" + " " + color);
    }

    BoxColor(BoxColor b1) {
        color = b1.color;
        System.out.println("From Box copy constructor color" + " " + color);
    }
}
public class Task {
    public static void main(String[] args){
        Box box = new Box();
        Box box2 = new Box(10,20);
        Box box3 = new Box(box);

        BoxWeight b1 = new BoxWeight();
        BoxWeight b2 = new BoxWeight(14);
        BoxWeight b3 = new BoxWeight(b2);

        BoxColor c1 = new BoxColor();
        BoxColor c2 = new BoxColor("Blue");
        BoxColor c3 = new BoxColor(c2);

    }
}
