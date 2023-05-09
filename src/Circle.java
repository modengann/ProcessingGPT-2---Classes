import processing.core.*;

public class Circle {

    private int radius;
    private int locX;
    private int locY;
    private PApplet parent;


    public Circle(int r, int lX, int lY, PApplet p){
        radius = r;
        locX = lX;
        locY = lY;
        parent = p;
    }

    public void display(){
        parent.ellipse(locX, locY,radius, radius);
    }

    public void moveX(int num){
        locX += num;
    }



    
}
