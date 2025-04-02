package Rocket;

import Snowworld.Snowworld;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class RocketMain extends BasicGame {

    private List<Actor> rocketList;

    public RocketMain(String title) {
        super(title);
    }

    @Override


    public void init(GameContainer gameContainer) throws SlickException {
        this.rocketList = new ArrayList<>();
        Rocket rocket = new Rocket();
        rocketList.add(rocket);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor : rocketList) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : rocketList) {
            actor.render(graphics);
        }
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RocketMain("Rocket"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
