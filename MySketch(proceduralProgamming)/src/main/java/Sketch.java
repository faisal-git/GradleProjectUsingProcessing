import processing.core.PApplet;

public class Sketch extends PApplet{

    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int DiameterX = 10;
    public static final int DiameterY = 10;
    public static final int TOTALBALLS=4;
    // drawCount keeps tracks of how many times draw() is called
    int drawCount=0;
    int speedX,positionOnXaxis;
    float distanceFromTop;





    public static void main(String[] args) {

        PApplet.main("Sketch",args);
    }

    @Override
    public void settings() {
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
        int ball;
        for(ball= 1; ball<=TOTALBALLS; ball++){
            speedX=ball;
            positionOnXaxis=drawCount*speedX;
            distanceFromTop=(HEIGHT*ball)/5;
            ellipse(positionOnXaxis, distanceFromTop,DiameterX, DiameterY);

        }
        drawCount++;

    }
}
