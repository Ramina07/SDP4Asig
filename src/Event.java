abstract class Event {
    protected Organizer organizer;

    protected Event(Organizer organizer) {
        this.organizer = organizer;
    }

    public abstract void planEvent();
}
