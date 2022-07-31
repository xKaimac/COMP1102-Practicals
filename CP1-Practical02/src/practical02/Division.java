package practical02;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer");
        int input = keyboard.nextInt();
        int mod = input;
        String rev = "";

        while (mod > 0) {
            rev = rev + String.valueOf(mod%10);
            mod = mod/10;
        }

        System.out.println(
                ((float) input/10) + "\n" +
                        (input%100) + "\n" +
                        (input/100) + "\n" +
                        Integer.valueOf(rev)
        );

    }
}