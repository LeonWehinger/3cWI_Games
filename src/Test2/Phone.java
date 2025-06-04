package Test2;

public class Phone implements Product{
    private int Id;
    private double Price;
    private String Title;
    private String Beschreibung;

    public Phone(int id, double price, String beschreibung, String title) {
        Id = id;
        Price = price;
        Beschreibung = beschreibung;
        Title = title;
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

    public void Calling(){
        System.out.println("I am calling!");
    }
}
