package PraxisTest;

import java.util.ArrayList;
import java.util.List;

public class GUI2 implements GUI{

    List<LibraryManager> ManagerList = new ArrayList<LibraryManager>();

    @Override
    public void start() {

    }

    public void addManager(LibraryManager manager){
        ManagerList.add(manager);
    }


}
