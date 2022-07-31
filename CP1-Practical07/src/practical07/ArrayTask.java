package practical07;

public class ArrayTask {

    public static void main(String[] args) {
//************************
// Below is the code for task 1
//************************
//        int[] intList = {5, 20, 32, 7, 9};
//        for (int i = intList.length-1; i >= 0; i--) {
//            System.out.println("intList[" + i + "]: " + intList[i]);
//        }

//************************
// Below is the code for task 2
//************************
//        int[] intList = {5, 20, 32, 7, 9};
//        int sum = 0;
//        for (int i = intList.length-1; i >= 0; i--) {
//            System.out.println("intList[" + i + "]: " + intList[i]);
//            sum += intList[i];
//        }
//        System.out.println("Sum = " + sum);

//************************
// Below is the code for task 3
//************************
        int[] intList = {5, 20, 32, 7, 9};
        int[] copy = {0, 0, 0, 0, 0};
        int copySum = 0;
        for (int i = 0; i < intList.length; i++) {
            copy[i] = intList[i];
            copySum += intList[i];
        }
        int sum = 0;
        for (int i = intList.length-1; i >= 0; i--) {
            intList[i]++;
            System.out.println("intList[" + i + "]: " + intList[i]);
            sum += intList[i];
        }
        System.out.println("Sum of intList = " + sum);
        System.out.println("Sum of copy = " + copySum);

//************************
// Below is the code for task 4 - IntList1
//************************
//        IntList1 list1 = new IntList1();
//        list1.printList();
//        list1.insertAtEndOfList(42);
//        list1.printList();
//        list1.insertAtEndOfList(2);
//        list1.printList();
//        System.out.println(list1.getElementAt(3));
//        System.out.println(list1.getElementAt(-1));
//        System.out.println(list1.getElementAt(1));
//        list1.insertAtEndOfList(7);
//        list1.insertAtEndOfList(9);
//        list1.printList();
//        list1.insertAtEndOfList(100);

//************************
// Below is the code for task 5 - IntList2
//************************
//        IntList2 list1 = new IntList2();
//        list1.printList();
//        list1.insertAtEndOfList(42);
//        list1.insertAtEndOfList(2);
//        list1.insertAtEndOfList(7);
//        list1.printList();
//        if(list1.contains(2)) {
//            System.out.println("Contains 2");
//        }
//        if(list1.contains(54)) {
//            System.out.println("Contains 54");
//        }
//        list1.delete(99);
//        list1.delete(2);
//        list1.printList();
//        list1.insertAtEndOfList(2);
//        list1.printList();
    }
}
