package PraxisTest;

public class TestMain {
    public static void main(String[] args) {

        LibraryManager l1 = new LibraryManager();
        Hoerbuch h1 = new Hoerbuch(1,"Der kleine Nejo",19.69,"er ist Nejolein");
        Roman r1 = new Roman(2,"Nejo stirbt", 24.69,"er ist tot","Krimmi");

        GUI1 gui1 = new GUI1();
        gui1.addManager(l1);
        gui1.start();

        h1.playSample();
        l1.addMedia(h1);
        l1.addMedia(r1);
        l1.calculateTotalMediaValue();
        l1.getAllMedia();;


    }
}
