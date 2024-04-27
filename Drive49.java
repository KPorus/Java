public class Drive49 {
    public int total_capacity = 10;
    public int used;
    public int free;

    Drive49() {
        used = 0;
        free = total_capacity;
    }

    void upload(int file) {
        used += file;
        free -= file;
    }

    void print() {
        System.out.println("Total capacity: "+ total_capacity +"\n Used: " + used + "\n Free: " + free);
    }

    void update() {
        total_capacity += 10;
        free += 10;
    }

    public static void main(String[] args) {
        Drive49 user1 = new Drive49();
        user1.print();
        user1.upload(2);
        user1.print();
        user1.update();
        user1.print();
    }
}
