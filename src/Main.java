public class Main{
    public static void main(String[] args){
        Event exhibition = new Exhibition(new PhysicalLocationOrganizer());
        exhibition.planEvent();

        Event concert = new Concert(new OnlineOrganizer());
        concert.planEvent();
    }
}