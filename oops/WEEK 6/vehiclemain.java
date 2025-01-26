// /*5. Write an application to create a super class Vehicle with information vehicle 
// number,insurance number,color and methods getConsumption() 
// displayConsumption(). Derive the sub-classes TwoWheeler and FourWheeler 
// with method maintenance() and average() to print the maintenance And average
// of vehicle.*/


class Vehicle {
    int veNumber;
    int inNumber;
    String color;
    double fuelConsum;

    void setInfo(int veNumber, int inNumber, String color) {
        this.veNumber = veNumber;
        this.inNumber = inNumber;
        this.color = color;
    }

    void getConsumption(double fuelConsum) {
        this.fuelConsum = fuelConsum;
    }

    void displayConsumption() {
        System.out.println("Fuel consumption: " + fuelConsum);
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

    double getMaintenance() {
        return maint;
    }

    double getAverage() {
        return avg;
    }
}

class FourWheeler extends Vehicle {
    double avg;
    double maint;

    void setSpecs(double avg, double maint) {
        this.avg = avg;
        this.maint = maint;
    }

    double getMaintenance() {
        return maint;
    }

    double getAverage() {
        return avg;
    }
}

public class vehiclemain {
    public static void main(String args[]) {
        TwoWheeler two = new TwoWheeler();
        two.setInfo(1490, 123432, "Blue");
        two.getConsumption(5);
        two.setSpecs(55, 1200);

        System.out.println("\nFor two-wheelers");
        two.displayInfo();
        two.displayConsumption();
        System.out.println("Maintenance: " + two.getMaintenance());
        System.out.println("Average: " + two.getAverage());
       
        FourWheeler four = new FourWheeler();
        four.setInfo(9000, 876646, "Silver");
        four.getConsumption(10);
        four.setSpecs(20, 5000);

        System.out.println("\nFor four-wheelers");
        four.displayInfo();
        four.displayConsumption();
        System.out.println("Maintenance: " + four.getMaintenance());
        System.out.println("Average: " + four.getAverage());
    }
}
































// class vehicle {
//     int vno;
//     int ino;
//     String color;
//     double fuel;

//     void setinfo(int vno, int ino, String color) {
//         this.vno = vno;
//         this.ino = ino;
//         this.color = color;
//     }

//     void getconsumption(double fuel) {
//         this.fuel = fuel;
//     }

//     void displayconsumption() {
//         System.out.println("fuel consumption:" + fuel);
//     }

//     void displayinfo() {
//         System.out.println("Vehicle " + vno);
//         System.out.println("Insurance no: " + ino);
//         System.out.println("color " + color);
//     }
// }

// class twowheeler extends vehicle {
//     double avg;
//     double mt;

//     void setspecs(double avg, double mt) {
//         this.avg = avg;
//         this.mt = mt;
//     }

//     double getmaintenance() {
//         return mt;
//     }

//     double getaverage() {
//         return avg;
//     }
// }

// class fourwheeler extends vehicle {
//     double avg;
//     double mt;

//     void setspecs(double avg, double mt) {
//         this.avg = avg;
//         this.mt = mt;
//     }

//     double getmaintenance() {
//         return mt;
//     }

//     double getaverage() {
//         return avg;
//     }
// }

// class vehiclemain {
//     public static void main(String args[]) {
//         twowheeler tw = new twowheeler();
//         tw.setinfo(1490, 123432, "Blue");
//         tw.getconsumption(5);
//         tw.setspecs(55, 1200);
//         double m = tw.getmaintenance();
//         double av = tw.getaverage();
//         System.out.println("*For two wheelers");
//         tw.displayinfo();
//         tw.displayconsumption();
//         System.out.println("maintenance: " + m);
//         System.out.println("average " + av);

//         fourwheeler fw = new fourwheeler();
//         fw.setinfo(9000, 876646, "Silver");
//         fw.getconsumption(10);
//         fw.setspecs(20, 5000);
//         m = fw.getmaintenance();
//         av = fw.getaverage();
//         System.out.println("*For four wheelers");
//         fw.displayinfo();
//         fw.displayconsumption();
//         System.out.println("maintenance: " + m);
//         System.out.println("average " + av);
//     }
// }
