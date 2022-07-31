package practical03;// CalculateBMI.java - calculate the BMI and then categorise
// it based on tablular values
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bmi;
        String weightClass;

        System.out.print("Enter your weight in Kilograms: ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height in Metres: ");
        double height= scan.nextDouble();

        DecimalFormat df = new DecimalFormat("#.#");

        bmi = weight/(height*height);

        if (bmi < 18.5) {
            weightClass = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightClass = "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            weightClass = "Overweight";
        } else weightClass = "Obese";

        System.out.println("Your BMI is " + df.format(bmi) + ", Which means you are in the " + weightClass + " range.");
    }
}