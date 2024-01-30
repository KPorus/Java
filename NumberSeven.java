import java.util.Scanner;

class Football{
    int radius;
    int weight;
    void display(){
        System.out.println("Radius: " + radius+" Weight: " + weight);
    }

    Football(){
        radius = 1;
        weight = 2;
    }
    Football(int radius, int weight){
        this.radius = radius;
        this.weight = weight;
    }
}
public class NumberSeven {
    public static void main(String[] args) {
        Football foot = new Football();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius & weight: ");
        try {
            int r = scanner.nextInt();
            int w = scanner.nextInt();
            Football foot2 = new Football(r,w);
            foot.display();
            foot2.display();
        } catch (Exception e) {
            scanner.close();
        }
    }
}
