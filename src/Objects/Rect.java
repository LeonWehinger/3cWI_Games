package Objects;

import org.newdawn.slick.Graphics;

public class Rect implements Forms {


    private float x;
    private float y;
    private double speed;

    public enum Direction {RIGHT, LEFT}

    public Direction direction;


    public Rect(int x, int y, double speed, Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }


    public void update(int delta) {

        if (direction == Direction.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x >= 800) {
                this.x = 0;
            }
        }
        if (direction == Direction.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x <= 0) {
                this.x = 800;
            }
        }


    }


    public void render(Graphics graphics) {

        graphics.drawRect(this.x, this.y, 10, 10);
    }


}
