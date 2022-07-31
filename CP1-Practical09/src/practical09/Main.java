package practical09;

public class Main {

    public static void main(String[] args) {
        HoldenDB db = new HoldenDB();
        db.addCar(1200, "sedan", "Barina");
        db.addCar(3800, "wagon", "Commodore");
        db.print();
        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
        Vehicle v1 = new Vehicle(1500, "Mazda");
        v1.setCapacity(1600);
        v1.print();
        car1.setCapacity(1600);
        car1.print();
    }
}
