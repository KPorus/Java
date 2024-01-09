class Vehicle{
    public String brand;
    public int year;
    void display()
    {
        System.out.println("Vehicle brand: "+ brand + " year: "+ year);
    }
}

class Car extends Vehicle{
    protected int numDoors;
    public Car(String brand, int year, int numDoors)
    {
        this.brand = brand;
        this.year = year;
        this.numDoors = numDoors;
    }

    @Override
    void display(){
        System.out.println("Car brand: "+ brand + " year: "+ year+ " numDoors: "+ numDoors);
    }
}

class Bicycle extends Vehicle{
    protected int quantity;
    public Bicycle(String brand, int year, int quantity)
    {
        this.brand = brand;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    void display(){
        System.out.println("Bicycle brand: "+ brand + " year: "+ year+" quantity: " + quantity);
    }
}
public class VehicleClass{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Bicycle myBicycle = new Bicycle("Trek", 2021, 5);

        myCar.display();
        myBicycle.display();

        
    }
}