public class Concert extends Event{
    public Concert(Organizer organizer){
        super(organizer);
    }
    public void planEvent(){
        System.out.println("Planning concert.");
        organizer.organize();
    }
}

