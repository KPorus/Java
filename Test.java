// Expriment with super variables =================================
class Box{
    String color = "red";
    Box(String color)
    {
        this.color = color;
    }
    Box(){}
}
class BoxColor extends Box{
    String color = "blue";
    void show() {
        System.out.println(color + " " + super.color);
    }
    void addColor(String color) {
        this.color = color;
    }
    BoxColor(BoxColor color) {
        super(color.color);
    }
    BoxColor(){}
}
class Test{
    public static void main(String[] args){
        BoxColor b = new BoxColor();
        b.addColor("Black");
        BoxColor c = new BoxColor(b);
        b.show();
        c.show();
    }
}