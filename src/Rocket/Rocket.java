package Rocket;

import org.newdawn.slick.*;

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
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_W)) {
            if (this.y >= -50) {
                this.y -= (float) delta / 2;
            }
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_D)) {
            this.x += (float) delta / 2;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_A)) {
            this.x -= (float) delta / 2;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_S)) {
            if (this.y <= 390) {
                this.y += (float) delta / 2;
            }

        }

        if (this.x >= 650) {
            this.x = -250;
        }

        if (this.x <= -260) {
            this.x = 640;
        }


    }
}
