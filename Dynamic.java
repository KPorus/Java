class Animal{
    String type;
    void display_info(){
        System.out.println("Animal type: " + type);
    }
    Animal(){
        type = "small brid";
    }
}

class Bird extends Animal {
    String color;
    void display_info(){
        System.out.println("Bird type: " + type);
        System.out.println("Bird color: " + color);
    }
    Bird(){
        color = "green";
        type = "parrot";
    }
}

class Parrot extends Bird{
    String number;
    void display_info(){
        System.out.println("Parrot type: " + type);
        System.out.println("Parrot number: " + number);
        System.out.println("Parrot number: " + color);
    }
    Parrot(){
        number = "3";
        type = "parrot"; 
        color = "green";
    }
}
public class Dynamic {
    public static void main(String[] args) {
        Animal a = new Parrot();
        a.display_info();
        Animal b = new Bird();
        b.display_info();
    }
}
