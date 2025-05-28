package PraxisTest;

public class Hoerbuch extends Buecher{


    public Hoerbuch(int id, String title, double preis, String beschreibung) {
        super(id, title, preis, beschreibung);
    }

    public void playSample(){
        System.out.println("Hoerbuch wird abgespielt!");
    }
}
