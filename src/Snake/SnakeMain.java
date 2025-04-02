package Snake;

import Rocket.Rocket;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class SnakeMain extends BasicGame {

    private List<Actor> snakeList;

    public SnakeMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.snakeList = new ArrayList<>();
        Snake snake = new Snake();
        snakeList.add(snake);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor : snakeList){
            actor.update(gameContainer, delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor : snakeList){
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
