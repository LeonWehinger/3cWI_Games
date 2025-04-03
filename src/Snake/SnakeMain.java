package Snake;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SnakeMain extends BasicGame {

    private List<Actor> allActors;
    private LinkedList<Actor> snakeList;
    private Snake snakeHead = null;
    private int timeSinceLastUpdate = 0;

    public SnakeMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.allActors = new ArrayList<>();
        this.snakeList = new LinkedList<>();
        Snake snake = new Snake(100,100);
        Snake snake1 = new Snake(70,100);
        snakeList.add(snake);
        snakeList.add(snake1);
        allActors.add(snake);
        allActors.add(snake1);

        if(snakeList.getFirst() instanceof Snake){

        }


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        for (Actor actor : snakeList){
                actor.update(gameContainer, delta);
            }





    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor : allActors){
            actor.render(graphics);
        }
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
}
