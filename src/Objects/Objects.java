package Objects;

import org.newdawn.slick.*;

public class Objects extends BasicGame {

    private Rect rect;
    private Rect rect2;
    private Rect rect3;


    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.rect = new Rect(100, 100, 1.5, Rect.Direction.RIGHT);
        this.rect2 = new Rect(160, 100, 1.5, Rect.Direction.RIGHT);
        this.rect3 = new Rect(220, 100, 1.5, Rect.Direction.RIGHT);

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
