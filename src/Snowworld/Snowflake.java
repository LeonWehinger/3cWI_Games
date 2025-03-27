package Snowworld;

import org.newdawn.slick.Graphics;

public class Snowflake implements Actor{

    private float x;
    private float y;
    public enum Size {S,M,L}
    public Size size;
    private float speed;


    public Snowflake (float x, float y, Size size){
        this.x = x;
        this.y = y;
        this.size = size;
    }




    @Override
    public void update(int delta) {

        if (size == Size.L){
            this.y += (float) delta / 1.5;
            if (this.y >= 600){
                this.y = -400;
            }
        }

        if (size == Size.M){
            this.y += (float) delta / 2;
            if (this.y >= 600){
                this.y = -400;
            }
        }

        if (size == Size.S){
            this.y += (float) delta / 2.5;
            if (this.y >= 600){
                this.y = -400;
            }
        }




    }

    @Override
    public void render(Graphics graphics) {

        if (size == Size.L){
            graphics.fillOval(x,y,15,15);
        }
        if (size == Size.M){
            graphics.fillOval(x,y,10,10);
        }
        if (size == Size.S){
            graphics.fillOval(x,y,5,5);
        }

    }
}
