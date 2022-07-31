package practical09;

public class Vehicle {  // base class

    int capacity;
    String make;

    public Vehicle(int capacity, String make) {
        this.capacity = capacity;
        this.make = make;
    }

    public Vehicle() {

    }


    void print() {
        System.out.println("Vehicle Info:" +
                        "\n  capacity = " + capacity + "cc" +
                        "\n  make = " + make);

    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
