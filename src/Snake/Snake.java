package Snake;

import Snake.Actor;
import org.newdawn.slick.*;

import java.util.LinkedList;

public class Snake implements Actor {
    private float x, y;
    private int currentKey;
    private boolean movingUp = false;
    private boolean movingDown = false;
    private boolean movingRight = true;
    private boolean movingLeft = false;
    private boolean printMovesBool = false;
    private int countdown = 1000;
    private static final float SPEED = 0.5f;
    public String name;


    public Snake(float x, float y, String name) throws SlickException {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Override
    public void render(Graphics graphics) {

        graphics.fillOval(x, y, 45, 45);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {


    }



    public void printMoves(Snake snake) {
        System.out.println(snake.name);
        System.out.println("Down:" + snake.isMovingDown());
        System.out.println("Up:" + snake.isMovingUp());
        System.out.println("Left:" + snake.isMovingLeft());
        System.out.println("Right:" + snake.isMovingRight());
        System.out.println("-----------");
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

    public boolean isMovingUp() {
        return movingUp;
    }

    public boolean isMovingDown() {
        return movingDown;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public boolean isMovingLeft() {
        return movingLeft;
    }
}
