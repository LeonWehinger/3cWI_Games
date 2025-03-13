package Objects;

import org.newdawn.slick.Graphics;

public class Rect implements Forms {

    enum Direction {RIGHT, LEFT, DOWN, UP}

    ;
    private float x;
    private float y;
    private double speed;
    private Direction direction;


    public Rect(int x, int y, double speed, Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }


    public void update(int delta) {


        if (direction == Direction.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 650) {
                direction = Direction.DOWN;
            }
        }
        if (direction == Direction.DOWN) {
            this.y += (float) delta / this.speed;
            if (this.y > 450) {
                direction = Direction.LEFT;
            }
        }
        if (direction == Direction.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x < 100) {
                direction = Direction.UP;
            }
        }
        if (direction == Direction.UP) {
            this.y -= (float) delta / this.speed;
            if (this.y < 100) {
                direction = Direction.RIGHT;
            }
        }


    }


    public void render(Graphics graphics) {

        graphics.drawRect(this.x, this.y, 50, 50);
    }


}
