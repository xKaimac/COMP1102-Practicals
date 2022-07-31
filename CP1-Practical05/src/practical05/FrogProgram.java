package practical05;


public class FrogProgram {
    //************************************************
    //Below is task 1 code
    //************************************************
//    public static void main(String[] args) {
//        Frog2 myFrog = new Frog2();
//
//        myFrog.age = 22;
//        myFrog.name = "Fred";
//        myFrog.id = 1000;
//        myFrog.print();
//        myFrog.printAgeGroup();
//    }
    //************************************************
    //Below is task 2 code
    //************************************************
//    public static void main(String[] args) {
//        Frog3 myFrog = new Frog3("Fred", 1000, 22);
//
//        Frog3 myFrog2 = new Frog3("Fran", 1001, 75);
//
//        myFrog.print();
//        myFrog.printAgeGroup();
//        myFrog2.print();
//        myFrog2.printAgeGroup();
//    }
    //************************************************
    //Below is task 3 code
    //************************************************
//    public static void main(String[] args) {
//        Frog4 myFrog = new Frog4("Fred", 1000, 22);
//
//        Frog4 myFrog2 = new Frog4("Fran", 1001, 75);
//
//        myFrog.print();
//        myFrog.printAgeGroup();
//        myFrog2.print();
//        myFrog2.printAgeGroup();
//        myFrog.reversedName();
//        myFrog2.reversedName();
//    }
    //************************************************
    //Below is task 5 code ---- It skips task 4?
    //************************************************
    public static void main(String[] args) {
        Frog5 myFrog = new Frog5("Fred", 1000, 22);

        Frog5 myFrog2 = new Frog5("Fran", 1001, 75);

        myFrog.print();
        myFrog.printAgeGroup();
        myFrog2.print();
        myFrog2.printAgeGroup();
        myFrog.reversedName();
        myFrog2.reversedName();
        Frog5 f  = myFrog.greaterAge(myFrog2);
        f.print();
    }
}

