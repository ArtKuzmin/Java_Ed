public class TheatreOwner {
    public TheatreOwner() {

    }

    public TheatreOwner(String name, String theatreAdress) {
        this.name = name;
        this.theatreAdress = theatreAdress;
    }

    public TheatreOwner(String name, String theatreAdress, int numberOfHalls) {
        this.name = name;
        this.theatreAdress = theatreAdress;
        this.numberOfTheatre = numberOfHalls;
    }

    private String name;
    private String theatreAdress;
    private int numberOfTheatre;
    private static int averageTicketPrice;


}
