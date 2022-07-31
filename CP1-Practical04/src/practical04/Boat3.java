package practical04;

import java.util.concurrent.atomic.AtomicInteger;

public class Boat3 {
    public Boat3 previousBoat;
    private int regNum = -1;
    private String bClass = "unknown";
    private String name = "unknown";
    private final int yardstick = 95;
    public static AtomicInteger count = new AtomicInteger(0);

    public Boat3(String the_name, String the_bClass, int the_regNum) {
        regNum = the_regNum;
        name = the_name;
        bClass = the_bClass;
        count.getAndIncrement();
    }
    void print() {
        System.out.println("Boat " + name +
                ", Class = " + bClass +
                ", Registration # = KA" + regNum);
    }
    public Boat3(){
        count.getAndIncrement();
    }
    void setName(String inName) {
        name = inName;
    }
    public String getName() {
        return name;
    }
}
