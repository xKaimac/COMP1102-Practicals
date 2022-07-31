package practical03;

import java.util.Scanner;

public class SimpleCalculator {
    // 1. Get the input number
    // 2. generate a random number, use Math.random()
    // 3. get the calculation type
    // 4. if the number is not valid output a message
    // 5. else perform the calculation
    // 6. display the results

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputNumber;
        int randomNumber = 0;
        int menuNumber;

        System.out.print("Enter an integer (in the range 0 - 10 inclusive): ");
        inputNumber = scan.nextInt();

        while (inputNumber < 0 || inputNumber > 10) {
            System.out.println("Invalid entry");
            System.out.print("Enter an integer (in the range 0 - 10 inclusive): ");
            inputNumber = scan.nextInt();
        }

        randomNumber = (int) (Math.random() * 11);

        // this can only be 1 - addition, 2 - subtraction,
        // or 3 - multiplication
        System.out.print("Enter 1 for Addition, 2 for Subtraction, "
                + "3 for Multiplication: ");
        menuNumber = scan.nextInt();
        switch (menuNumber) {
            case 1 -> System.out.println(randomNumber + " + " + inputNumber + " = "
                    + (randomNumber + inputNumber));
            case 2 -> System.out.println(randomNumber + " - " + inputNumber + " = "
                    + (randomNumber - inputNumber));
            case 3 -> System.out.println(randomNumber + " * " + inputNumber + " = "
                    + (randomNumber * inputNumber));
            default -> System.out.println("Invalid menu choice");
        }
    }
}
