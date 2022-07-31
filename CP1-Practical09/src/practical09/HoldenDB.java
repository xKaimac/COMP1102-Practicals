package practical09;

import java.util.ArrayList;

public class HoldenDB extends VehicleDB {
    Vehicle[] db;
    int count = 0;
    HoldenDB() {
        db = new Vehicle[50];
    }
    public void addCar(int capacity, String type, String model) {
        db[count] = new Car(capacity, "Holden", type, model);
        count++;
    }
    public void print() {
        System.out.println("=== Vehicle Data Base ===");
        for (int i  = 0; i < db.length; i++) {
            if (db[i] != null) {
                db[i].print();
            } else break;
        }
    }
}

