package Snake;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SnakeMain extends BasicGame {

    private List<Actor> allActors;
    private LinkedList<Snake> snakeList;
    private int timeSinceLastUpdate = 0;
    public Snake changePos;
    public Snake isHead;
    public float speed = 0.5f;

    public enum Direction {UP, DOWN, LEFT, RIGHT}

    private Direction direction = Direction.RIGHT;

    public SnakeMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.allActors = new ArrayList<>();
        this.snakeList = new LinkedList<>();
        float pos = 200;
        for (int i = 0; i < 1000; i++) {
            Snake snake = new Snake(pos - (i*speed), 100, "Schnieke");
            snakeList.add(snake);

        }

        changePos = snakeList.getLast();
        isHead = snakeList.getFirst();

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        changePos = snakeList.getLast();
        isHead = snakeList.getFirst();

        move(gameContainer, delta, snakeList);


//System.out.println(changePos.name);
        //  System.out.println(isHead.name);


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor : this.snakeList) {
            actor.render(graphics);
        }
    }

    public LinkedList<Snake> getSnakeList() {
        return snakeList;
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SnakeMain("Snake"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void move(GameContainer gameContainer, int delta, LinkedList<Snake> snakelist) throws SlickException {
        if (gameContainer.getInput().isKeyPressed(Input.KEY_W)) {
            this.direction = Direction.UP;
        }
        if (gameContainer.getInput().isKeyPressed(Input.KEY_D)) {
            this.direction = Direction.RIGHT;
        }
        if (gameContainer.getInput().isKeyPressed(Input.KEY_A)) {
            this.direction = Direction.LEFT;
        }
        if (gameContainer.getInput().isKeyPressed(Input.KEY_S)) {
            this.direction = Direction.DOWN;
        }

        Snake tail = snakelist.getLast();
        Snake head = snakelist.getFirst();
        float xNew = 0;
        float yNew = 0;

        if (direction == Direction.UP) {
            xNew = head.getX();
            yNew = head.getY() - this.speed;
        }

        if (direction == Direction.DOWN) {
            xNew = head.getX();
            yNew = head.getY() + this.speed;


        }
        if (direction == Direction.RIGHT) {

            xNew = head.getX() + this.speed;
            yNew = head.getY();


        }
        if (direction == Direction.LEFT) {
            xNew = head.getX() - speed;
            yNew = head.getY();


        }

        Snake newHead = new Snake(xNew, yNew, "x");
        snakelist.addFirst(newHead);
        snakelist.remove(tail);
    }

}
