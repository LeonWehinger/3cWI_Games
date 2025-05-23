package Objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Forms {
    private float x, y;
    private double speed;
    private float radius = 10;


    public Circle(float x, float y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta) {

        this.y += delta / this.speed;
        radius += 0.01;
        if (this.y >= 600) {
            this.y = 0;
        }


    }

    public void render(Graphics graphics) {

        graphics.drawOval(this.x, this.y, radius, radius);
    }


}

