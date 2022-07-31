package practical08;

import java.util.Arrays;

public class Recorder5 {
    private int xPos, yPos;
    private String eventType;
    private final int EVENT_MAX = 10;
    private EventInformation3[] event = new EventInformation3[EVENT_MAX];

    int xevent = 0;  // keeps track of how many events have occurred


    Recorder5(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }

    public void recordEvent(String time, int datum) {
        String[] check = time.split(":");
        boolean boo = false;
        for (int i = 0; i < check.length; i++) {
            if (!check[i].matches("[0-9]+") || check[i].length() > 2) {
                boo = true;
                break;
            }
        }
            if (check.length > 2 || boo) {
                System.out.println("Invalid time format: " + time + ", Ignoring event");
            } else if (Integer.parseInt(check[0]) > 23 || Integer.parseInt(check[1]) > 59) {
                System.out.println("Invalid hour in time: " + time + ", Ignoring event");
            } else if (xevent > 0 && event[xevent-1] != null && Integer.parseInt(time.replace(":", "")) < Integer.parseInt(event[xevent-1].getEventTime().replace(":", ""))) {
                System.out.println("Record out of sequence: " + time + ", ignoring event");
            } else if (event.length <= EVENT_MAX) {
                event[xevent] = new EventInformation3(time, datum);
                xevent++;
            } else {
                System.out.println("Event log overflow - terminating");
                System.exit(1);
            }
        }


        public void printEvents () {
            System.out.println("Record of " + eventType
                    + " events at [" + xPos + "," + yPos + "]");

            for (int i = 0; i < xevent; i++) {
                System.out.println("Event Number " + i + " was recorded at " + this.event[i].getEventTime() + " with datum = " + this.event[i].getEventDatum());
            }
        }
    }

