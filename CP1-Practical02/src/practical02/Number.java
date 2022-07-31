package practical02;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        int num1;

        System.out.println("Enter a line:");
        message = scan.nextLine();

        System.out.println("Enter another line:");
        message = message+scan.nextLine();
        num1 = Integer.parseInt(message);


        System.out.println("Number: " + (num1+1));

    }
}
