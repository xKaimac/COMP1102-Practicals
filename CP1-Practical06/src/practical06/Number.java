package practical06;

public class Number {
//**************************************************
//Below is code for task 1
//**************************************************
//    public static void main(String[] args) {
//        System.out.println("Starting Application...");
//
//        Counter1 c = new Counter1(1);
//        c.countUp(2);
//        c.countUp(3);
//        c.countDown(4);
//        c.countUp(2);
    //}
////**********************************®****************
////Below is code for task 2
////**************************************************
//    public static void main(String[] args) {
//        System.out.println("Starting Application...");
//
//        Counter2 c = new Counter2(1);
//        c.countUp(2);
//        c.countUp(3);
//        c.countDown(4);
//        c.countUp(2);
//        c.countDown(6);
//        c.countUp(2);
//    }
//**************************************************
//Below is code for task 3
//**************************************************
//    public static void main(String[] args) {
//        System.out.println("Starting Application...");
//
//        Counter3 c = new Counter3(1,3);
//        c.countUp(5);
//        Counter3 c1 = new Counter3(5);
//        c1.countUp(2);
//    }

//**************************************************
//Below is code for task 4
//**************************************************
//    public static void main(String[] args) {
//        System.out.println("Starting Application...");
//
//        Counter4 c = new Counter4(1,3);
//        c.countUp(5, '*');
//        Counter4 c1 = new Counter4(5);
//        c1.countUp(2, '-');
//        c1.countUp(2, '?');
//
//    }
//**************************************************
//Below is code for task 5
//**************************************************
    public static void main(String[] args) {
        System.out.println("Starting Application...");

        Counter5 c = new Counter5(1, 3);

        c.countUp(5, '*');
        c.printMax();
        c.reset();
        c.countUp(2, '+');
        c.printMax();
    }

}

