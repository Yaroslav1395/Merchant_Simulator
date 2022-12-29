package Event;

public enum EventRealize {
    BROKEN_WHEEL(0, new BrokenWheel()),
    DETERIORATED(1, new Deteriorated()),
    INN(2, new Inn()),
    MET_LOCAL(3, new MetLocal()),
    RAIN(4, new Rain()),
    RIVER(5, new River()),
    ROGUES(6, new Rogues()),
    SMOOTH_ROAD(7, new SmoothRoad()),
    TYPICAL_DAY(8, new TypicalDay());

    private final int eventId;
    private Eventable event;
    EventRealize(int eventId, Eventable event) {
        this.eventId = eventId;
        this.event = event;
    }

    public Eventable getEvent() {
        return event;
    }

    public static EventRealize getEventRealize(int value){
        for (EventRealize event: EventRealize.values()) {
            if(event.eventId == value){
                return event;
            }
        }
        throw new RuntimeException("Событие в перечислении не найдено");
    }
}
