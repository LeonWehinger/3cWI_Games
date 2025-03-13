package Objects;

import org.newdawn.slick.*;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Objects extends BasicGame {

    private List<Forms> formList;


    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        Random random = new Random();
        this.formList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Rect rect = new Rect(100, 100, random.nextDouble() + 0.5, Rect.Direction.RIGHT);
            this.formList.add(rect);
        }
        for (int i = 0; i < 1000; i++) {
            Circle circle = new Circle(random.nextInt(800), 0, random.nextDouble() + 2.5);
            this.formList.add(circle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Forms forms : this.formList) {
            forms.update(delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        for (Forms forms : this.formList) {
            forms.render(graphics);
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
