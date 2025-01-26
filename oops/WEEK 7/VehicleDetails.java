/*4. Create an Interface Vehicle with method getColor(),getNumber(), 
getConsumption() calculate the fuel consumed , name and color for TwoWheeler
and Four Wheeler By implementing interface Vehicle.*/
import java.util.Scanner;

interface Vehicle {
    void getColor(String c);

    void getNumber(int n);

    void getConsumption(int l, int fuelCost);
}

class TwoWheeler implements Vehicle {
    public void getColor(String c) {
        System.out.println("Color of TwoWheeler is: " + c);
    }

    public void getNumber(int n) {
        System.out.println("Number of TwoWheeler is: " + n);
    }

    public void getConsumption(int l, int fuelCost) {
        System.out.println("Consumption of TwoWheeler is: " + (l * fuelCost));
    }
}

class FourWheeler implements Vehicle {
    public void getColor(String c) {
        System.out.println("Color of FourWheeler is: " + c);
    }

    public void getNumber(int n) {
        System.out.println("Number of FourWheeler is: " + n);
    }

    public void getConsumption(int l, int fuelCost) {
        System.out.println("Consumption of FourWheeler is: " + (l * fuelCost));
    }
}

public class VehicleDetails {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter color of TwoWheeler:");
        String colorTW = in.nextLine();
        System.out.println("Enter number of TwoWheeler:");
        int numberTW = in.nextInt();
        System.out.println("Enter number of litres of fuel consumed by TwoWheeler:");
        int litresTW = in.nextInt();
        System.out.println("Enter cost of fuel per litre consumed by TwoWheeler:");
        int fuelCostTW = in.nextInt();

        System.out.println("Enter color of FourWheeler:");
        String colorFW = in.next();
        System.out.println("Enter number of FourWheeler:");
        int numberFW = in.nextInt();
        System.out.println("Enter number of litres of fuel consumed by FourWheeler:");
        int litresFW = in.nextInt();
        System.out.println("Enter cost of fuel per litre consumed by FourWheeler:");
        int fuelCostFW = in.nextInt();

        Vehicle two = new TwoWheeler();
        Vehicle four = new FourWheeler();

        two.getColor(colorTW);
        two.getNumber(numberTW);
        two.getConsumption(litresTW, fuelCostTW);

        four.getColor(colorFW);
        four.getNumber(numberFW);
        four.getConsumption(litresFW, fuelCostFW);
    }
}
