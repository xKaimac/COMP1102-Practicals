package practical05;

import java.util.ArrayList;
import java.util.List;

public class Frog2 {
    String name = "Name not set";
    int id = -1;   // -1 used to indicate it has not been set
    int age = 0;

    public Frog2() {
        // Constructor currently does nothing
        // not code in the body of the constructor
    }
    public void printAgeGroup() {
        if (age < 20) {
            System.out.println("Age group is young");
        } else if (age >= 21 && age <= 50) {
            System.out.println("Age group is juvenile");
        } else System.out.println("Age group is adult");
    }
    public void print() {
        System.out.println("**** Start of print method ****");
        System.out.println("Frogs name is " + name);
        System.out.println("Id is " + id);
    }
}
