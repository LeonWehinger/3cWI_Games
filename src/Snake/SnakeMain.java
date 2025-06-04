package Snake;

import org.newdawn.slick.*;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SnakeMain extends BasicGame {

    private List<Actor> allActors;
    private LinkedList<Snake> snakeList;
    private int timeSinceLastUpdate = 0;
    public Snake changePos;
    public Snake isHead;
    public float speed = 0.3f;
    public enum Direction {UP, DOWN, LEFT, RIGHT}
    private Direction direction = Direction.RIGHT;
    public Direction lastDirection = Direction.RIGHT;
    private World SnakeBackground;
    public enum WantsDirection {UP, DOWN, LEFT, RIGHT}
    private WantsDirection wantsDirection = WantsDirection.RIGHT;
    private int millisSinceStart = 0;
    private int newDelta = 0;
    private float positioner;

    public SnakeMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.allActors = new ArrayList<>();
        this.snakeList = new LinkedList<>();
        float pos = 200;
        for (int i = 0; i < 500; i++) {
            Snake snake = new Snake(pos -=speed, 100, "Schnieke");
            snakeList.add(snake);

        }

        SnakeBackground = new World();
        changePos = snakeList.getLast();
        isHead = snakeList.getFirst();

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.millisSinceStart += delta;
        positioner = speed* newDelta;
        newDelta = delta;
        if (this.millisSinceStart<3000) {

        }else {
            changePos = snakeList.getLast();
            isHead = snakeList.getFirst();
            move(gameContainer, delta, snakeList);
        }




//System.out.println(changePos.name);
        //  System.out.println(isHead.name);


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        SnakeBackground.render(graphics);
        for (Actor actor : this.snakeList) {
            actor.render(graphics);
        }
        int wartezeit = 3000;
        if (this.millisSinceStart<3000){
            wartezeit=3000-millisSinceStart;
            String output = "Zeit bis Start: " + wartezeit;
            graphics.drawString(output,300,400);
        }





    }

    public LinkedList<Snake> getSnakeList() {
        return snakeList;
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SnakeMain("Snake"));
            container.setDisplayMode(800, 700, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void move(GameContainer gameContainer, int delta, LinkedList<Snake> snakelist) throws SlickException {
        if (gameContainer.getInput().isKeyPressed(Input.KEY_W)&&(lastDirection==Direction.LEFT||lastDirection==Direction.RIGHT)) {

            this.wantsDirection = WantsDirection.UP;
            if (wantsDirection == WantsDirection.UP) {
                System.out.println("Er will rauf!!!!!!!");
            }
        }
            if (wantsDirection == WantsDirection.UP && isHead.getX()%50<=3){
                this.direction = Direction.UP;
                lastDirection = Direction.UP;
            }



        if (gameContainer.getInput().isKeyPressed(Input.KEY_D)&&(lastDirection == Direction.UP||lastDirection == Direction.DOWN)) {

            this.wantsDirection = WantsDirection.RIGHT;
            if (wantsDirection == WantsDirection.RIGHT){
                System.out.println("Er will nach rechts!!!!!!!");
            }
            }
            if (wantsDirection == WantsDirection.RIGHT&&isHead.getY()%50<=3) {
                this.direction = Direction.RIGHT;
                lastDirection = Direction.RIGHT;
            }

        if (gameContainer.getInput().isKeyPressed(Input.KEY_A)&&(lastDirection==Direction.UP||lastDirection==Direction.DOWN)) {

            this.wantsDirection = WantsDirection.LEFT;
            if (wantsDirection == WantsDirection.LEFT) {
                System.out.println("Er will nach links!!!!!!!");
            }
        }
            if (wantsDirection == WantsDirection.LEFT&&isHead.getY()%50<=3) {
                this.direction = Direction.LEFT;
                lastDirection = Direction.LEFT;
            }

        if (gameContainer.getInput().isKeyPressed(Input.KEY_S)&&(lastDirection==Direction.LEFT||lastDirection==Direction.RIGHT)) {

            this.wantsDirection = WantsDirection.DOWN;
            if (wantsDirection == WantsDirection.DOWN) {
                System.out.println("Er will runter!!!!!!!");
            }
        }
            if (wantsDirection == WantsDirection.DOWN&&isHead.getX()%50<=3) {
                this.direction = Direction.DOWN;
                lastDirection = Direction.DOWN;
            }


        Snake tail = snakelist.getLast();
        Snake head = snakelist.getFirst();
        float xNew = 0;
        float yNew = 0;

        if (direction == Direction.UP) {
            xNew = head.getX();
            yNew = head.getY() - this.speed*delta;
        }

        if (direction == Direction.DOWN) {
            xNew = head.getX();
            yNew = head.getY() + this.speed*delta;


        }
        if (direction == Direction.RIGHT) {

            xNew = head.getX() + this.speed*delta;
            yNew = head.getY();


        }
        if (direction == Direction.LEFT) {
            xNew = head.getX() - this.speed*delta;
            yNew = head.getY();


        }

        Snake newHead = new Snake(xNew, yNew, "x");
        snakelist.addFirst(newHead);
        snakelist.remove(tail);


    }

}
