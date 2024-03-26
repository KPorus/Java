interface Electrified{
    int getChargeCapacity();
    double getCurrentCharge();
    void setCurrentCharge(double charge);
}
class Bicycle{
    double frameSize;
    int nGrear;
    int currentGrear;

    Bicycle(double frameSize, int nGrear, int currentGrear){
       frameSize = this.frameSize;
       nGrear = this.nGrear;
       currentGrear = this.currentGrear;
    }
    Bicycle(){}
}

class cargoBicycle extends Bicycle{
    double maxLoad;
    double currentLoad;
    cargoBicycle(double frameSize, double nGrear, double currentLoad){
        frameSize = this.frameSize;
        nGrear = this.nGrear;
        currentLoad = this.currentLoad;
    }
    cargoBicycle(){}
}

class ElectricCargoBicycle extends cargoBicycle implements Electrified {
    int betteryCapacity;
    double currentCharge;

    ElectricCargoBicycle(double frameSize, double nGrear, double maxLoad, int betteryCapacity) {
        frameSize = this.frameSize;
        nGrear = this.nGrear;
        maxLoad = this.maxLoad;
        betteryCapacity = this.betteryCapacity;
    }

    public int getChargeCapacity() {
        return betteryCapacity;
    };

    public double getCurrentCharge() {
        return currentCharge;
    };

    public void setCurrentCharge(double charge) {
        currentCharge = charge;
    };
}

class ElectricBicycle extends Bicycle implements Electrified {
    int betteryCapacity;
    double currentCharge;

    ElectricBicycle(double frameSize, double nGrear, int betteryCapacity) {
        frameSize = this.frameSize;
        nGrear = this.nGrear;
        betteryCapacity = this.betteryCapacity;
    }

    public int getChargeCapacity(){
        return betteryCapacity;
    };

    public double getCurrentCharge(){
        return currentCharge;
    };

    public void setCurrentCharge(double charge){
        currentCharge = charge;
    };
}

public class BicycleType {

    public static void main(String[] args) {

        // Create a regular bicycle
        Bicycle bicycle = new Bicycle(54.5, 21, 3);
        System.out.println("Regular Bicycle with frame size: " + bicycle.frameSize + ", gears: " + bicycle.nGrear
                + ", current gear: " + bicycle.currentGrear);

        // Create a cargo bicycle
        cargoBicycle cargoBike = new cargoBicycle(58, 18, 50.0);
        System.out.println("Cargo Bicycle with frame size: " + cargoBike.frameSize + ", gears: " + cargoBike.nGrear
                + ", max load: " + cargoBike.maxLoad);

        // Create an electric cargo bicycle
        ElectricCargoBicycle electricCargoBike = new ElectricCargoBicycle(62, 7, 100.0, 4000);
        System.out.println("Electric Cargo Bicycle with frame size: " + electricCargoBike.frameSize + ", gears: "
                + electricCargoBike.nGrear + ", max load: " + electricCargoBike.maxLoad + ", battery capacity: "
                + electricCargoBike.getChargeCapacity());
        electricCargoBike.setCurrentCharge(2500.0);
        System.out.println("Current charge of electric cargo bike: " + electricCargoBike.getCurrentCharge());

        // Create an electric bicycle
        ElectricBicycle electricBike = new ElectricBicycle(50, 24, 3500);
        System.out.println("Electric Bicycle with frame size: " + electricBike.frameSize + ", gears: "
                + electricBike.nGrear + ", battery capacity: " + electricBike.getChargeCapacity());

    }
}
