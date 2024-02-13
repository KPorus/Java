class Box{
    private int lenght;
    private int height;
    private int width;
    
    Box() {
        lenght = 0;
        height = 0;
        width = 0;
    }
    Box(int lenght, int height, int width){
        this.lenght = lenght;
        this.height = height;
        this.width = width;
    }
}

class BoxWeight extends Box{
    private int weight;
    BoxWeight(){
        weight = 0;
    }
    BoxWeight(int lenght,int height,int width, int weight){
        super(lenght, height, width);
        this.weight = weight;
    }
}

class BoxColor extends BoxWeight{
    private String color;
    
    BoxColor(){
        color = "Red";
    }

    BoxColor(int lenght,int height,int width, int weight, String color){
        super(lenght, height, width, weight);
        this.color = color;
    }
};

class Shipment extends BoxColor{
    private int cost;
}

class Received extends Shipment{
    private String boxArrived;
}
public class Boxes {
    public static void main(String[] args) {
        
    }
}
