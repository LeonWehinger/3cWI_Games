package Objects;

import org.newdawn.slick.*;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Objects extends BasicGame {

    private List<Forms> formList;
    private boolean aBoolean;


    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        Random random = new Random();
        this.formList = new ArrayList<>();

        for (int i = 0; aBoolean; i++) {
            Rect rect = new Rect(random.nextInt(800), random.nextInt(600), random.nextDouble() + 1, Rect.Direction.RIGHT);
            this.formList.add(rect);
        }
        for (int i = 0; i < 200; i++) {
            Circle circle = new Circle(random.nextInt(800), random.nextInt(600), random.nextDouble() + 2.5);
            this.formList.add(circle);
        }
        for (int i = 0; i < 200; i++) {
            Oval oval = new Oval(random.nextInt(800), random.nextInt(600), random.nextFloat() + 1.5f);
            this.formList.add(oval);
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
