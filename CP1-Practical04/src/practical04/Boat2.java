package practical04;

import java.util.concurrent.atomic.AtomicInteger;

public class Boat2 {
    private int regNum = -1;
    private String bClass = "unknown";
    private String name = "unknown";
    public static AtomicInteger count = new AtomicInteger(0);

    public Boat2(String the_name, String the_bClass, int the_regNum) {
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
    public Boat2(){
        count.getAndIncrement();
    }
}
