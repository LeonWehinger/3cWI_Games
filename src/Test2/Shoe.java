package Test2;

import java.awt.*;

public class Shoe implements Product{
    private int Id;
    private double Price;
    private String Title;
    private String Beschreibung;
    private String Color;

    public Shoe(int id, String color, String beschreibung, String title, double price) {
        Id = id;
        Color = color;
        Beschreibung = beschreibung;
        Title = title;
        Price = price;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public double getPrice() {
        return this.Price;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getBeschreibung() {
        return this.Beschreibung;
    }
}
