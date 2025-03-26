package Objects;

import org.newdawn.slick.Graphics;

public class Oval implements Forms {

    private float x, y;
    private float speed;


    public Oval(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    @Override
    public void update(int delta) {
        this.x += (float) delta / speed;
        this.y += (float) delta / (speed + 1);

        if (this.y > 600) {
            this.y = 0;
        }
        if (this.x > 800) {
            this.x = 0;
        }
    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(x, y, 20, 10);
    }

}
