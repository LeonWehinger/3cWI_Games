package PraxisTest;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

    private List<Buecher> buecherList = new ArrayList<Buecher>();

    public void addMedia(Buecher buch){
        buecherList.add(buch);
    }
    public void getAllMedia(){
        for (Buecher buch: buecherList){
            System.out.println(buch.getId());
            System.out.println(buch.getTitle());
            System.out.println(buch.getPreis());
            System.out.println(buch.getBeschreibung());
        }
    }
    public void calculateTotalMediaValue(){
        double sum = 0;
        for (Buecher buch: buecherList){
            sum += buch.getPreis();
        }
        System.out.println(sum);
    }

}
