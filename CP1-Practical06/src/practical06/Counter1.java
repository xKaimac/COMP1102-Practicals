package practical06;

public class Counter1 {
    // An instance variable to keep track of which number we are up to
    private int currentCount;

    // The constructor receives an int as a parameter and stores
    // it in currentCount
    public Counter1(int startValue) {
        currentCount = startValue;
    }

    // A method to print out the next n numbers
    public void countUp(int n) {
        System.out.println("*** Counting up " + n + " times");
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount++;
        }

    }

    public void countDown(int n) {
        System.out.println("*** Counting down " + n + " times");
        for (int step = 1; step <= n; step++) {
            if ((currentCount) > 1) {
                currentCount--;
                System.out.println("counter = " + currentCount);
            }
        }
    }
}