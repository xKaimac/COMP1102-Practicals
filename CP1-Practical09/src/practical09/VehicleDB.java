package practical09;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleDB extends Vehicle {
    Vehicle[] db;
    int count = 0;
    public VehicleDB() {
        db = new Vehicle[100];
    }
    public VehicleDB(int maxValue) {
        if (maxValue <=100) {
            db = new Vehicle[maxValue];
        }
    }
    public void addVehicle(Vehicle vehicle) {
        db[count] = vehicle;
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
