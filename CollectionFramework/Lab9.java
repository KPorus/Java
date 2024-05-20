// package CollectionFramework;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Vector;

// class  Room {
//     int length;
//     int height;
//     int width;

//     Room(){
//         length = 0;
//         height = 0;
//         width = 0;
//     }

//     Room(int length, int height, int width){
//         this.length = length;
//         this.height = height;
//         this.width = width;
//     }

//     void display(ArrayList<Room> rooms){
//         for(Room room : rooms){
//             System.out.println("Room width: " + room.width);
//             System.out.println("Room length: " + room.length);
//             System.out.println("Room height: " + room.height);
//         }
//     }
// }
// public class Lab9{
//     public static void main(String[] args) {
//         Room room = new Room(2,4,5);
//         Room room2 = new Room(3,5,6);
//         Room room3 = new Room(200,25,10);

//         ArrayList<Room> rooms = new ArrayList<Room>();
//         rooms.add(room);
//         rooms.add(room2);
//         rooms.add(room3);

//         List<Room> rooms2 = new Vector<Room>();
//         rooms2.add(room);
//         rooms2.add(room2);
//         rooms2.add(room3);

//         Room temp = new Room();
//         temp.display(rooms);
//     }
// }
