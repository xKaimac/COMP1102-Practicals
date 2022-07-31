package practical04;

import java.util.concurrent.atomic.AtomicInteger;

public class Boat1 {
    private int regNum = -1;
    private String bClass = "unknown";
    private String name = "unknown";

    public Boat1(String the_name, String the_bClass, int the_regNum) {
        regNum = the_regNum;
        name = the_name;
        bClass = the_bClass;
    }
    void print() {
        System.out.println("Boat " + name +
                ", Class = " + bClass +
                ", Registration # = KA" + regNum);
    }
    public Boat1(){}
}
