package practical08;

public class Recorder4 {
    private int xPos, yPos;
    private String eventType;
    private final int EVENT_MAX = 10;
    private EventInformation2[] event = new EventInformation2[EVENT_MAX];

    int xevent = 0;  // keeps track of how many events have occurred


    Recorder4(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }

    public void recordEvent(String time, int datum) {
        if (event.length <= EVENT_MAX) {
            event[xevent] = new EventInformation2(time, datum);
            xevent++;
        } else {
            System.out.println("Event log overflow - terminating");
            System.exit(1);
        }
    }

    public void printEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");

        for (int i = 0; i < xevent; i++) {
            System.out.println("Event Number " + i + " was recorded at " + this.event[i].getEventTime() + " with datum = " + this.event[i].getEventDatum());
        }
    }
}