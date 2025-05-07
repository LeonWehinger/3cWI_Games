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

    public SnakeMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.allActors = new ArrayList<>();
        this.snakeList = new LinkedList<>();
        float pos = 200;
        for (int i = 0; i < 5; i++) {
            Snake snake = new Snake(pos-=2,100,"Schnieke");
            snakeList.add(snake);
            allActors.add(snake);
        }

        changePos = snakeList.getLast();
        isHead = snakeList.getFirst();

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {



        changePos = snakeList.getLast();
        isHead = snakeList.getFirst();

        changePos.move(gameContainer,delta,snakeList,changePos,isHead);





//System.out.println(changePos.name);
      //  System.out.println(isHead.name);


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor : allActors){
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

}
