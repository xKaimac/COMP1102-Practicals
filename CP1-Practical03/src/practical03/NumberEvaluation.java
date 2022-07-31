package practical03;

import java.util.Scanner;

/**
 * @author moon0016
 */
public class NumberEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        String output = "The number is ";

        System.out.print("Enter a number: ");

        if (input == 0) {
            output = output + "Zero";
        } else if (input > 0) {
            output = output + "Positive";
        } else output = output + "Negative";

        if (input%2 == 0 || input == 0) {
            output = output + ". The number is also even";
        } else output= output + ". The number is also odd";

        System.out.println(output);
    }

}
