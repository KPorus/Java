interface Movable{
    void MoveUp(int y);
    void MoveDown(int y);
    void MoveLeft(int x);
    void MoveRight(int x);
}

class MovablePoint implements Movable{
    int x;
    int y;
    int x_speed;
    int y_speed;
    public void MoveUp(int y_speed){
        y +=y_speed;
    };

    public void MoveDown(int y_speed){
        y -=y_speed;
    };

    public void MoveLeft(int x_speed){
        x +=x_speed;
    };

    public void MoveRight(int x_speed){
        x -=x_speed;
    };
    MovablePoint(int x_speed, int y_speed){
        x = 0;
        y = 0;
        this.x_speed = x_speed;
        this.y_speed = y_speed;
        x += this.x_speed;
        y += this.y_speed;
    }
    void display_info(){
        System.out.println("X point: " + x + " y point: " + y);
    }
}

class MovableCircle implements Movable{
    double radius;
    int x, y;
    public void MoveUp(int y_speed) {
        y += y_speed;
        radius = Math.sqrt(x*x + y*y);
    };

    public void MoveDown(int y_speed) {
        y -= y_speed;
        radius = Math.sqrt(x * x + y * y);
    };

    public void MoveLeft(int x_speed) {
        x -= x_speed;
        radius = Math.sqrt(x * x + y * y);
    };

    public void MoveRight(int x_speed) {
        x += x_speed;
        radius = Math.sqrt(x * x + y * y);
    };
    MovableCircle(int x_speed, int y_speed){
        final MovablePoint m = new MovablePoint(x_speed, y_speed);
        x = m.x;
        y = m.y;
    }

    void display_info() {
        System.out.println("Radius: " + radius);
    }

}
public class Moveable {
    public static void main(String[] args){
        MovableCircle m = new MovableCircle(5,10);
        m.MoveDown(5);
        m.display_info();

    }
}
