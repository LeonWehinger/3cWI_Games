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
        graphics.fillRect(x, y, 30, 30);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {


    }


    public void move(GameContainer gameContainer, int delta, LinkedList<Snake> snakelist, Snake changePos, Snake isHead) {


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
            changePos = snakelist.getLast();
            isHead = snakelist.getFirst();
            snakelist.getFirst().movingDown = false;
            snakelist.getFirst().movingRight = false;
            snakelist.getFirst().movingLeft = false;
            snakelist.getLast().setY(isHead.getY() - (float) SPEED);
            snakelist.getLast().setX(isHead.getX());
            snakelist.remove(changePos);
            snakelist.add(0, changePos);


        }
        if (movingDown) {
            changePos = snakelist.getLast();
            isHead = snakelist.getFirst();
            isHead.movingUp = false;
            isHead.movingRight = false;
            isHead.movingLeft = false;
            changePos.setY(isHead.getY() + (float) SPEED);
            changePos.setX(isHead.getX());
            snakelist.remove(changePos);
            snakelist.add(0, changePos);


        }
        if (movingRight) {
            changePos = snakelist.getLast();
            isHead = snakelist.getFirst();
            isHead.movingDown = false;
            isHead.movingUp = false;
            isHead.movingLeft = false;
            changePos.setX(isHead.getX() + (float) SPEED);
            changePos.setY(isHead.getY());
            snakelist.remove(changePos);
            snakelist.add(0, changePos);


        }
        if (movingLeft) {
            changePos = snakelist.getLast();
            isHead = snakelist.getFirst();
            isHead.movingDown = false;
            isHead.movingRight = false;
            isHead.movingUp = false;
            changePos.setX(isHead.getX() - (float) SPEED);
            changePos.setY(isHead.getY());
            snakelist.remove(changePos);
            snakelist.add(0, changePos);


        }


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
