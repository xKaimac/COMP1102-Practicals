package practical02;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an amount of cents in the range 0 to 100: ");
        int cents = keyboard.nextInt();
        int twentyCent = 0;
        int fiveCent = 0;
        int oneCent = 0;

        if (cents/20>0) {
            twentyCent = cents/20;
            cents = cents%20;
        } if (cents/5>0) {
            fiveCent = cents/5;
            cents = cents%5;
        } if (cents>0) {
            oneCent = cents;
        }

        System.out.println("Dispensing...\n" +
                twentyCent + " 20c coin(s)\n" +
                fiveCent + " 5c coin(s)\n" +
                oneCent + " 1c coin(s)");

    }
}
