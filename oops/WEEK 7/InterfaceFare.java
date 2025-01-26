/*5. Create an Interface Fare with method getAmount() to get the amount paid for
fare Calculate the fare paid by bus and train implementing interface Fare. 
of travelling. */  //here fare = ticket price.
import java.util.*;

interface Fare {
    void getAmount(int km, int farePerKm);
}

class Bus implements Fare {
    public void getAmount(int km, int farePerKm) {
        System.out.println("Amount paid for traveling by Bus: " + (km * farePerKm));
    }
}

class Train implements Fare {
    public void getAmount(int km, int farePerKm) {
        System.out.println("Amount paid for traveling by Train: " + (km * farePerKm));
    }
}

class InterfaceFare {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter No.of Kilometers traveled by bus:");
        int busKm = in.nextInt();

        System.out.println("Enter No.of Kilometers traveled by Train:");
        int trainKm = in.nextInt();

        System.out.println("Enter fare for Kilometer traveled by bus:");
        int busFare = in.nextInt();

        System.out.println("Enter fare for Kilometer traveled by Train:");
        int trainFare = in.nextInt();

        Fare bus = new Bus();
        Fare train = new Train();

        bus.getAmount(busKm, busFare);
        train.getAmount(trainKm, trainFare);
    }
}
