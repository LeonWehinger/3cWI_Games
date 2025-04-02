package Snake;

import Snake.Actor;
import org.newdawn.slick.*;

public class Snake implements Actor {
    private float x, y;



    public Snake() throws SlickException {
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(x,y,30,30);
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
