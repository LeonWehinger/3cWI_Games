package Snake;

import Snake.Actor;
import org.newdawn.slick.*;

public class Snake implements Actor {
    private float x, y;
    private int currentKey;
    private boolean movingUp = false;
    private boolean movingDown = false;
    private boolean movingRight = false;
    private boolean movingLeft = false;
    private boolean isHead = false;


    public Snake(float x, float y) throws SlickException {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(x, y, 30, 30);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

        if (isHead){
            if (gameContainer.getInput().isKeyPressed(Input.KEY_W)) {
                this.movingUp = true;
                this.movingLeft = false;
                this.movingRight = false;
                this.movingDown = false;
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_D)) {
                this.movingRight = true;
                this.movingDown = false;
                this.movingUp = false;
                this.movingLeft = false;

            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_A)) {
                this.movingLeft = true;
                this.movingRight = false;
                this.movingDown = false;
                this.movingUp = false;
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_S)) {
                this.movingDown = true;
                this.movingUp = false;
                this.movingLeft = false;
                this.movingRight = false;

            }

            if (this.y >= 600) {
                this.y = 0;
            }

            if (this.y <= -30) {
                this.y = 600;
            }

            if (this.x >= 800) {
                this.x = 0;
            }

            if (this.x <= -30) {
                this.x = 800;
            }

            if (movingUp) {
                this.y -= (float) delta / 2;
            }
            if (movingDown) {
                this.y += (float) delta / 2;
            }
            if (movingRight) {
                this.x += (float) delta / 2;
            }
            if (movingLeft) {
                this.x -= (float) delta / 2;
            }
        }



    }

    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }
}
