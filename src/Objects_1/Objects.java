package Objects_1;

import org.newdawn.slick.*;

public class Objects extends BasicGame {

    private float Ox;
    private float Oy;
    private float Cx;
    private float Cy;
    private float Rx;
    private float Ry;
    private int ovalDirection = 1;
    private int circleDirection = 2;
    private int rectDirection = 1;
    public static final int RIGHT = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int UP = 4;



    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.Ox = 100;
        this.Oy = 0;
        this.Cx = 0;
        this.Cy = 100;
        this.Rx = 150;
        this.Ry = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        //Oval

        if (ovalDirection == RIGHT) {
            this.Ox += (float) delta / 2.0;
            if (this.Ox > 650) {
                this.ovalDirection = LEFT;
            }
        }
        if (ovalDirection == LEFT) {
            this.Ox -= (float) delta / 2.0;
            if (this.Ox < 50) {
                this.ovalDirection = RIGHT;
            }
        }



        //Circle

        if (circleDirection == DOWN){
            this.Cy += (float) delta /2.5;
            if (this.Cy > 500){
                this.circleDirection = UP;
            }
        }
        if (circleDirection == UP){
            this.Cy -= (float) delta /2.5;
            if (this.Cy < 50){
                this.circleDirection = DOWN;
            }
        }



        //Rect

        if (rectDirection == RIGHT){
            this.Rx += (float) delta /2.0;
            if (this.Rx > 650){
                rectDirection = DOWN;
            }
        }
        if (rectDirection == DOWN){
            this.Ry += (float) delta /2.0;
            if (this.Ry > 450){
                rectDirection = LEFT;
            }
        }
        if (rectDirection == LEFT){
            this.Rx -= (float) delta /2.0;
            if (this.Rx < 100){
                rectDirection = UP;
            }
        }
        if (rectDirection == UP){
            this.Ry -= (float) delta /2.0;
            if (this.Ry < 100){
                rectDirection = RIGHT;
            }
        }














    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(Ox, Oy, 65, 50);
        graphics.drawOval(Cx, Cy, 50, 50);
        graphics.drawRect(Rx, Ry, 50, 50);


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
