package practical06;

public class Counter5 {
    // An instance variable to keep track of which number we are up to
    private int currentCount;
    private int stepCounter;
    private int max = currentCount;
    private int startInt;

    // The constructor receives an int as a parameter and stores
    // it in currentCount
    public Counter5(int startValue, int stepCount) {
        currentCount = startValue;
        stepCounter = stepCount;
        startInt = startValue;
        System.out.println("Creating Counter object with a starting value of 1 and a step size of 3");
    }
    public Counter5(int startValue) {
        currentCount = startValue;
        stepCounter = 1;
        startInt = startValue;
        System.out.println("Creating Counter object with a starting value of 1 and a step size of 3");
    }

    // A method to print out the next n numbers
    public void countUp(int n, char op) {
        System.out.println("*** Counting up " + n + " times, operation is " + op);

        if (op == '*') {
            for (int step = 1; step <= n; step++) {
                if (max < currentCount) {
                    max = currentCount;
                }
                System.out.println("counter = " + currentCount);
                currentCount *= stepCounter;
            }
        } else if (op == '-') {
            for (int step = 1; step <= n; step++) {
                if (max < currentCount) {
                    max = currentCount;
                }
                System.out.println("counter = " + currentCount);
                currentCount -= stepCounter;
            }
        } else if (op == '+') {
            for (int step = 1; step <= n; step++) {
                if (max < currentCount) {
                    max = currentCount;
                }
                System.out.println("counter = " + currentCount);
                currentCount += stepCounter;
            }
        } else System.out.println("counter = " + currentCount +
                "\nInvalid operation: " + op);
    }
    public void countDown(int n) {
        System.out.println("*** Counting down " + n + " times");
        for (int step = 1; step <= n; step++) {
            if ((currentCount-stepCounter) >= 0) {
                currentCount -= stepCounter;
                System.out.println("counter = " + currentCount);
            }
        }
    }
    public void printMax() {
        System.out.println("Max = " + max);
    }
    public void reset() {
        System.out.println("Reset returned " + currentCount);
        currentCount = startInt;
    }
}
