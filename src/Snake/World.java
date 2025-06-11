package Snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class World implements Actor{
    private Image SnakeBackground;
    public boolean HitBoarder = false;

    public World()throws SlickException{
        SnakeBackground = new Image("C:\\SWP\\swp_3\\Games\\testdata\\SnakeBackground.png ");
        this.SnakeBackground = SnakeBackground.getScaledCopy(800,700);
    }

    public boolean checkIfHitBoarder(Snake Head){
        if (Head.getX()>=755|| Head.getX()<=0|| Head.getY()>=655|| Head.getY()<=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(SnakeBackground,0,0);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
