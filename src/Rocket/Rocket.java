package Rocket;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket implements Actor {
    private float x, y;
    private Image rocketImage;


    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/rocket.png");
        this.rocketImage = tmp.getScaledCopy(350, 350);
        this.x = 220;
        this.y = 150;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(x, y);
    }

    @Override
    public void update(int delta) {

        this.y -= (float) delta / 2;
        if (this.y <= -200) {
            this.y = 650;
        }
    }
}
