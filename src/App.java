import processing.core.*;

public class App extends PApplet {

    Circle c;
    public static void main(String[] args)  {
        PApplet.main("App");
    }


    public void settings(){
        size(800,600);
    }
    public void setup(){
        c = new Circle(150, 150, 150, this);
    }

    public void draw(){
        background(0);
        c.display();
    }

    public void keyPressed(){
        if(keyCode == LEFT){
            c.moveX(-5);
        }
    }
}
