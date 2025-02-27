package Objects_1;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Objects extends BasicGame {

    private float Ox;
    private float Oy;
    private float Cx;
    private float Cy;



    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.Ox=100;
        this.Oy=0;
        this.Cx=0;
        this.Cy=100;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.Ox += (float) delta/2.0;

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(Ox,Oy,65,50);
        graphics.drawOval(Cx,Cy,50,50);



    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
