package practical04;

import java.util.concurrent.atomic.AtomicInteger;

public class Boat4 {
    public Boat4 previousBoat;
    private int regNum = -1;
    private String bClass = "unknown";
    private String name = "unknown";
    private final int yardstick = 95;
    public static int count = 0;
    private int sequence = 0;

    public Boat4(String name, String bClass, int regNum, Boat4 previousBoat) {
        this.regNum = regNum;
        this.name = name;
        this.bClass = bClass;
        count++;
        sequence = count;
        this.previousBoat = previousBoat;
    }
    void print() {
        System.out.println("Boat " + name +
                ", Class = " + bClass +
                ", Registration # = KA" + regNum +
                "\nSequence number = " + sequence);
    }
    public Boat4(){
        count++;
        sequence = count;
    }
    void setName(String inName) {
        name = inName;
    }
    public String getName() {
        return name;
    }
    static String printTotal() {
        return "Total number of boats created = " + count;
    }

}
