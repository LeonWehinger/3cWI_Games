package PraxisTest;

public abstract class Buecher {
    private int id;
    private String Title;
    private double Preis;
    private String Beschreibung;


    public Buecher(int id, String title, double preis, String beschreibung) {
        this.id = id;
        this.Title = title;
        this.Preis = preis;
        this.Beschreibung = beschreibung;
    }

    public String getTitle(){
        return Title;
    }

    public double getPreis(){
        return Preis;
    }
    public int getId(){
        return id;
    }
    public String getBeschreibung(){
        return Beschreibung;
    }
}