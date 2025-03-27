package Snowworld;

import Objects.Objects;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snowworld extends BasicGame {


    private List<Actor> snowflakeList;

    public Snowworld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        Random random = new Random();
        this.snowflakeList = new ArrayList<>();


        for (int i = 0; i < 200; i ++){
            Snowflake snowflake = new Snowflake(random.nextInt(800), random.nextInt(1000)-500, Snowflake.Size.L );
            snowflakeList.add(snowflake);
        }
        for (int i = 0; i < 200; i ++){
            Snowflake snowflake = new Snowflake(random.nextInt(800), random.nextInt(1000)-500, Snowflake.Size.M );
            snowflakeList.add(snowflake);
        }
        for (int i = 0; i < 200; i ++){
            Snowflake snowflake = new Snowflake(random.nextInt(800), random.nextInt(1000)-500, Snowflake.Size.S );
            snowflakeList.add(snowflake);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor : snowflakeList){
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor : snowflakeList){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowworld"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
