package Snake;

import Snake.Actor;
import org.newdawn.slick.*;

import java.util.LinkedList;

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


    }

    public boolean isHead() {
        return isHead;
    }

    public void move(GameContainer gameContainer, int delta, LinkedList<Snake> snakelist, Snake changePos){
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
                snakelist.getLast().setY(snakelist.getFirst().getY() - (float) delta /2);
                snakelist.getLast().setX(snakelist.getFirst().getX());
                snakelist.remove(changePos);
                snakelist.add(0,changePos);
            }
            if (movingDown) {
                snakelist.getLast().setY(snakelist.getFirst().getY() + (float) delta /2);
                snakelist.getLast().setX(snakelist.getFirst().getX());
                snakelist.remove(changePos);
                snakelist.add(0,changePos);
            }
            if (movingRight) {
                snakelist.getLast().setX(snakelist.getFirst().getX() + (float) delta /2);
                snakelist.getLast().setY(snakelist.getFirst().getY());
                snakelist.remove(changePos);
                snakelist.add(0,changePos);
            }
            if (movingLeft) {
                snakelist.getLast().setX(snakelist.getFirst().getX() - (float) delta /2);
                snakelist.getLast().setY(snakelist.getFirst().getY());
                snakelist.remove(changePos);
                snakelist.add(0,changePos);
            }
        }
    }

    public void setHead(boolean head) {
        isHead = head;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
