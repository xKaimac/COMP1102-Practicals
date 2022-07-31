package practical07;

import com.sun.security.jgss.InquireSecContextPermission;

import java.util.Arrays;

public class IntList1 {
    private int[] array = {0, 0, 0, 0};
    private int listLength = 0;

    public void intList1(int[]theArray) {
        array = theArray;
    }
    public void printList() {
        if (Arrays.equals(array, new int[]{0, 0, 0, 0})) {
            System.out.println("List is empty");
        } else System.out.println("Printing list...");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println("Element " + i + " = " + array[i]);
            }
        }
    }
    public void insertAtEndOfList(int n) {
        if (listLength < array.length) {
            array[listLength] = n;
            listLength++;
            System.out.println(n + " inserted");
        } else System.out.println("Insertion of " + n + " failed");
    }
    public String getElementAt(int n) {
        if (n > listLength || n < 0) {
            return "Invalid index " + n + "\n0";
        } else return Integer.toString(array[n]);
    }
}
