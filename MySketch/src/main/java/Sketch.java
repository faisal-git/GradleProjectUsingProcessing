import processing.core.PApplet;

public class Sketch extends PApplet{

    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int TOTAL_BALLS=4;
    RollingBall Balls[]=new RollingBall[TOTAL_BALLS];

    public static void main(String[] args) {
        PApplet.main("Sketch",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        createBalls();
    }

    @Override
    public void draw() {
        for(int ball=1;ball<=TOTAL_BALLS;ball++){
            drawCircle(Balls[ball - 1]);
            Balls[ball-1].positionOnXaxis+=Balls[ball-1].speedAlongX;
        }

    }
    private void createBalls() {

        for(int ball=1;ball<=TOTAL_BALLS;ball++){
            int speedOfBall=ball;
            float distanceFromTop=(HEIGHT*ball)/5;
            Balls[ball-1]=new RollingBall(speedOfBall,distanceFromTop);
        }
    }

    private void drawCircle(RollingBall ball) {
        ellipse(ball.positionOnXaxis, ball.distanceFromTop, ball.Diameter,ball.Diameter);
    }
}
