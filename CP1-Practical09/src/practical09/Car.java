package practical09;

public class Car extends Vehicle {
    String type;
    String model;
    public Car(int capacity, String make, String type, String model) {
        super(capacity, make);
        this.type = type;
        this.model = model;
    }
    public void print() {
        super.print();
        System.out.println("  type = " + type +
                        "\n  model = " + model);
    }

    @Override
    public void setCapacity(int capacity) {
        System.out.println("Cannot change capacity of a car");
    }
    // ... extra code here ...

}
