package practical03;

import java.util.Scanner;

public class Biscuits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number of biscuits: ");
        int input = scan.nextInt();
        int packets = input/12, boxes = 0, leftover = input%12;
        String leftoverStr;
        String boxStr;
        System.out.println(packets);
        // declare any variables here

        // prompt for the number of biscuits
        if (leftover == 1) {
            leftoverStr = String.valueOf(leftover) + " leftover biscuit.";
        } else if (leftover > 1) {
            leftoverStr = String.valueOf(leftover) + " leftover biscuits.";
        } else leftoverStr = "no leftover biscuits.";


        while (packets >= 30) {
            packets -= 30;
            boxes = boxes+1;
        }

        if (boxes == 1) {
            boxStr = String.valueOf(boxes);
        } else if (boxes > 1) {
            boxStr = String.valueOf(boxes) + " boxes";
        } else boxStr = "no boxes";

        System.out.println("There are " + (input/12) + " packets of biscuits: " + boxStr + " and " + leftoverStr);
    }

}
