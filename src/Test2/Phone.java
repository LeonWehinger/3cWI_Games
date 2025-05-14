package Test2;

public class Phone implements Product{
    private int Id;
    private float Price;
    private String Title;
    private String Beschreibung;


    @Override
    public int getId() {
        return 0;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getBeschreibung() {
        return "";
    }

    public void Calling(){
        System.out.println("I am calling!");
    }
}
