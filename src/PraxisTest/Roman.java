package PraxisTest;

public class Roman extends Buecher{

    private String Genre;

    public Roman(int id, String title, double preis, String beschreibung, String genre) {
        super(id, title, preis, beschreibung);
        Genre = genre;
    }

    public String Genre(){
        return Genre;
    }
}
