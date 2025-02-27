package at.wle.games.firstGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {

    private float x;
    private float y;



    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x=0;
        this.y=0;



    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.x+=(float) delta/4.0;
        this.y+=(float) delta/4.0;

        if (this.x>800){
            this.x=0;
            this.y=0;
        }




    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.setColor(Color.blue);
        graphics.fillRect(150,300,450,50);
        graphics.setColor(Color.white);
        graphics.drawString("Hi Nejolein!",this.x,this.y);
        graphics.drawRect(200,100,50,100);
        graphics.drawRect(500,100,50,100);




    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
