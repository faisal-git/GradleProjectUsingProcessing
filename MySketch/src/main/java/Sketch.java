import processing.core.PApplet;
import java.util.ArrayList;

public class Sketch extends PApplet{
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int DIAMETER=10;
    public static final int X_COORDINATE = 0;
    public static final int SPEED_ALONG_X = 1;
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

        shapes.add(new Ball(X_COORDINATE,HEIGHT/4, SPEED_ALONG_X,DIAMETER));
        shapes.add(new Ball(X_COORDINATE,(HEIGHT*2)/4,2*SPEED_ALONG_X,DIAMETER));
        shapes.add(new Ball(X_COORDINATE,(HEIGHT*3)/4,3*SPEED_ALONG_X,DIAMETER));
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::move);
        for (Shape shape : shapes) {
            shape.draw(this);
        }

    }
}
