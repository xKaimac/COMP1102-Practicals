package practical08;

public class EventInformation3 {
    private String eventTime;
    private int eventDatum;

    EventInformation3(String the_eventTime, int the_eventDatum) {
        eventTime = the_eventTime;
        eventDatum = the_eventDatum;
    }
    public int getEventDatum() {
        return this.eventDatum;
    }
    public String getEventTime() {
        return this.eventTime;
    }
}