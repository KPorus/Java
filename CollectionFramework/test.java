package CollectionFramework;

import java.util.*;

class Room {
    int length;
    int height;
    int width;

    Room() {
        length = 0;
        height = 0;
        width = 0;
    }

    Room(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    void display(Stack<Room> rooms) { 
        // for (Room room : rooms) {
        // System.out.println("Room width: " + room.width);
        // System.out.println("Room length: " + room.length);
        // System.out.println("Room height: " + room.height);
        // }
        for (; !rooms.isEmpty();) {
            Room room = rooms.pop();
            System.out.println("Height " + room.height + "\nwidth: " + room.width + "\nRoom length: " + room.length);
            // System.out.println("Room Last: "+ "width: "+rooms.pop().width + " height:"+
            // rooms.pop().height + "length:" + rooms.pop().length);
        }
    }
}

public class test {
    public static void main(String[] args) {
        Room room = new Room(2, 4, 5);
        Room room2 = new Room(3, 5, 6);
        Room room3 = new Room(200, 25, 10);

        Stack<Room> rooms = new Stack<Room>();
        rooms.push(room);
        rooms.add(room2);
        rooms.add(room3);

        Room temp = new Room();
        System.out.println(rooms.isEmpty());
        temp.display(rooms);
    }
}
