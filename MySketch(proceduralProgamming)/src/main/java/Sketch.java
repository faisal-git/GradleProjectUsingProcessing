import processing.core.PApplet;

public class Sketch extends PApplet{

    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int DiameterX = 10;
    public static final int DiameterY = 10;
    public static final int maxSpeed = 4;
    int 


    public static void main(String[] args) {

        PApplet.main("Sketch",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        for(int speedX = 1; speedX<= maxSpeed; speedX++){
            ellipse(speedX*speedAlongXaxis, (HEIGHT*speedX) / 5, DiameterX, DiameterY);

        }
        speedAlongXaxis++;

    }
}
