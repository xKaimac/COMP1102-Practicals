package practical08;


public class Recorder1 {

    int xPos, yPos;
    String eventType;
    String[] event = new String[5];

    int xevent = 0;  // keeps track of how many events have occurred

    Recorder1(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }

    public void recordEvent(String eventTime) {
        event[xevent] = eventTime;
        xevent++;
    }

    public void printEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");

        for (int i = 0; i < xevent; i++) {
            System.out.println("Event Number " + i + " was recorded at " + this.event[i]);
        }
    }
}
