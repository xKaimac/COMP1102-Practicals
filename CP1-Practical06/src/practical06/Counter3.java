package practical06;

public class Counter3 {
    // An instance variable to keep track of which number we are up to
    private int currentCount;
    private int stepCounter;
    private int startInt;

    // The constructor receives an int as a parameter and stores
    // it in currentCount
    public Counter3(int startValue, int stepCount) {
        currentCount = startValue;
        stepCounter = stepCount;
        startInt = startValue;
        System.out.println("Creating Counter object with a starting value of " + currentCount + " and a step size of " + stepCounter);
    }
    public Counter3(int startValue) {
        currentCount = startValue;
        stepCounter = 1;
        startInt = startValue;
        System.out.println("Creating Counter object with a starting value of " + currentCount);
    }

    // A method to print out the next n numbers
    public void countUp(int n) {
        System.out.println("*** Counting up " + n + " times");
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount += stepCounter;
        }
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
}
