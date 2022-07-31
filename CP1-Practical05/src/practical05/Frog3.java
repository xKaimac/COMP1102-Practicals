package practical05;

import java.util.ArrayList;
import java.util.List;

public class Frog3 {
    private String name = "Name not set";
    private int id = -1; // -1 used to indicate it has not been set
    private int age = 0;
    private List<Frog3> frogs = new ArrayList<Frog3>();

    public Frog3(String theName, int theId, int theAge) {
        name = theName;
        id = theId;
        age = theAge;
        frogs.add(this);
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
        System.out.println("Frog's name is " + name);
        System.out.println("Id  is " + id);
    }
}
