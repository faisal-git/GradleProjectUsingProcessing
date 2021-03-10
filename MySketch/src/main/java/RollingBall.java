
import processing.core.PApplet;

interface Shape{
    public void move();
    public void draw(PApplet PApplet);
}


class Ball implements Shape {
    int xCoordiante;
    int yCoordinate;
    int speedAlongX;
    int diameter;
    Ball(int xCoordiante,int yCoordinate,int speedAlongX,int diameter){
        this.xCoordiante=xCoordiante;
        this.yCoordinate=yCoordinate;
        this.speedAlongX=speedAlongX;
        this.diameter=diameter;
    }

    @Override
    public void move() {
        xCoordiante+=speedAlongX;

    }

    @Override
    public void draw(PApplet PApplet) {
        drawCircle(PApplet);
    }

    private void drawCircle(PApplet PApplet) {
        PApplet.ellipse(xCoordiante, yCoordinate, diameter, diameter);
    }


}




