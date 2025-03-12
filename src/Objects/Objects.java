package Objects;
import org.newdawn.slick.*;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Objects extends BasicGame {

    private List<Rect> rectList;


    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        Random random = new Random();
        this.rectList = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Rect rect = new Rect(100,100,random.nextDouble()+0.5, Rect.Direction.RIGHT);
            rectList.add(rect);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    for (Rect rect: this.rectList){
        rect.update(delta);
    }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        for (Rect rect:this.rectList){
            rect.render(graphics);
        }


    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
