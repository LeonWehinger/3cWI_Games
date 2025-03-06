package Objects;
import org.newdawn.slick.*;

import javax.swing.plaf.LabelUI;
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

        for (int i = 0; i < 20; i++){
            Rect rect = new Rect(100,100,random.nextInt(4)+1, Rect.Direction.RIGHT);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.rect.update(delta);
        this.rect2.update(delta);
        this.rect3.update(delta);


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        this.rect.render(graphics);
        this.rect2.render(graphics);
        this.rect3.render(graphics);


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
