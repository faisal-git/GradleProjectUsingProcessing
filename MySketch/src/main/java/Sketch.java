import processing.core.PApplet;
import java.util.ArrayList;

public class Sketch extends PApplet{
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    ArrayList<Shape> shapes;

    {
        shapes = new ArrayList<Shape>();
    }

    public static void main(String[] args) {

        PApplet.main("Sketch",args);
    }

    @Override
    public void settings() {

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        shapes.add(new Ball(0,HEIGHT/4,1,10));
        shapes.add(new Ball(0,(HEIGHT*2)/4,2,10));
        shapes.add(new Ball(0,(HEIGHT*3)/4,3,10));
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::move);
        for (Shape shape : shapes) {
            shape.draw(this);
        }

    }
}
