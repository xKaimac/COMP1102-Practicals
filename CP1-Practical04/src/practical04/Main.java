package practical04;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static practical04.Boat4.printTotal;


public class Main {
//    //********************************************
//    //  Below is Task 1 code
//    //********************************************
//    public static void main(String[] args) {
//        System.out.println("Starting boat application");
//
//
//        Boat1 myBoat1 = new Boat1();
//
//
//        myBoat1.print();
//    }
//    //********************************************
    //  Below is Task 2 code
    //********************************************
//    public static void main(String[] args) {
//        System.out.println("Starting boat application");
//
//
//        Boat2 myBoat1 = new Boat2();
//        Boat2 myBoat2 = new Boat2("Harmony Blue",
//                "International 505",
//                6467);
//
//        myBoat1.print();
//        myBoat2.print();
//    }
    //********************************************
    //  Below is Task 3 code
    //********************************************

//    public static void main(String[] args) {
//        System.out.println("Starting boat application");
//
//        printTotal();
//
//        Boat3 myBoat1 = new Boat3();
//        Boat3 myBoat2 = new Boat3("Harmony Blue",
//                "International 505",
//                6467);
//
//        myBoat1.print();
//        myBoat2.print();
//
//        myBoat1.setName("Australia II");
//        myBoat1.print();
//
//        System.out.println(myBoat1.getName());
//        System.out.println(myBoat2.getName());
//    }

    //********************************************
    //  Below is Task 4 code
    //********************************************
    public static void main(String[] args) {
        System.out.println("Starting boat application");

        printTotal();

        Boat4 myBoat1 = new Boat4("B1",
                                "C",
                                1000,
                                null);
        Boat4 myBoat2 = new Boat4("B2",
                                "C",
                                1001,
                                myBoat1);
        Boat4 myBoat3 = new Boat4("B3",
                                "C",
                                1002,
                                myBoat2);
        Boat4 myBoat4 = new Boat4("B4",
                                "C",
                                1003,
                                myBoat3);
        Boat4 lastBoat = myBoat4;

        while (lastBoat != null) {
            lastBoat.print();
            lastBoat = lastBoat.previousBoat;
        }


        //myBoat1.setName("Australia II");
        //System.out.println(myBoat1.getName());
        //System.out.println(myBoat2.getName());
        System.out.println(printTotal());
    }
}
