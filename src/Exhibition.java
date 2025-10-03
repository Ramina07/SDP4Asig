public class Exhibition extends Event {
    public Exhibition(Organizer organizer){
        super(organizer);
    }
    public void planEvent(){
        System.out.println("Planning exhibition.");
        organizer.organize();
    }
}
