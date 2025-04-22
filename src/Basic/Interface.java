package Basic;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with a key...");
    }

    public void stop() {
        System.out.println("Car is stopping using brakes.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a kick...");
    }

    public void stop() {
        System.out.println("Bike is stopping using hand brakes.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        System.out.println();

        myBike.start();
        myBike.stop();
    }
}