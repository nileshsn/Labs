/*6. Extend the above TwoWheeler class with methods getType() and getName() 
which gives the information about the type and the name of the company.Create 
sub-classes Geared and NonGeared with method average() to print the average 
of a geared and non-geared two wheeler.*/

class Vehicle {
    int veNumber;
    int inNumber;
    String color;
    double fuel;

    void setInfo(int veNumber, int inNumber, String color) {
        this.veNumber = veNumber;
        this.inNumber = inNumber;
        this.color = color;
    }

    void getConsumption(double fuel) {
        this.fuel = fuel;
    }

    void displayConsumption() {
        System.out.println("Fuel consumption: " + fuel);
    }

    void displayInfo() {
        System.out.println("Vehicle " + veNumber);
        System.out.println("Insurance no: " + inNumber);
        System.out.println("Color " + color);
    }
}

class TwoWheeler extends Vehicle {
    double avg;
    double maint;

    void setSpecs(double avg, double maint) {
        this.avg = avg;
        this.maint = maint;
    }

    double getAverage() {
        return avg;
    }

    double getMaintenance() {
        return maint;
    }
}

class Geared extends TwoWheeler {
    String type;
    String name;

    Geared(String type, String name) {
        this.type = type;
        this.name = name;
    }

    String getType() {
        return type;
    }

    String getName() {
        return name;
    }
}

class NonGeared extends TwoWheeler {
    String type;
    String name;

    NonGeared(String type, String name) {
        this.type = type;
        this.name = name;
    }

    String getType() {
        return type;
    }

    String getName() {
        return name;
    }
}

public class Vehicle2 {
    public static void main(String args[]) {
        TwoWheeler two = new TwoWheeler();
        two.setInfo(1490, 123432, "Blue");
        two.getConsumption(5);
        two.setSpecs(55, 1200);
        double m = two.getMaintenance();
        double av = two.getAverage();
        System.out.println("\nFor two-wheelers");
        two.displayInfo();
        two.displayConsumption();
        System.out.println("Average: " + av);
        System.out.println("Maintenance: " + m);

        Geared g = new Geared("Geared", "Motorcycle");
        String type = g.getType();
        String name = g.getName();
        System.out.println("\nType: " + type + "\nName: " + name);

        NonGeared ng = new NonGeared("Non-geared", "Motorcycle");
        type = ng.getType();
        name = ng.getName();
        System.out.println("\nType: " + type + "\nName: " + name);
    }
}
