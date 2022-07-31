package practical07;

import com.sun.security.jgss.InquireSecContextPermission;

import java.util.Arrays;

public class IntList2 {
    private int[] array = new int[4];
    private int listLength = 0;

    public void printList() {
        if (listLength == 0) {
            System.out.println("List is empty");
        } else System.out.println("Printing list...");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println("Element " + i + " = " + array[i]);
            } else break;
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
    public boolean contains(int n) {
        boolean boo = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                boo = true;
                break;
            }
        } return boo;
    }
    public void delete(int n) {
        boolean boo = false;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                boo = true;
                index = i;
                break;
            }
        } if (boo) {
            System.out.println(n + " deleted");
            for (int p = index; p < array.length-1; p++) {
                array[index] = array[p+1];
                index++;
//                System.out.println(array[index]);
            } listLength--;
        } else System.out.println("Deletion of " + n + " failed");
    }
}