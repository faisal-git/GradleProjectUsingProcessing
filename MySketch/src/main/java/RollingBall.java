public class RollingBall {
     int speedAlongX;
     float distanceFromTop;
     int positionOnXaxis=0;
    public static final int Diameter = 10;
    /*public RollingBall(){
        speedAlongX=0;
        distanceFromTop=0;
    }*/
    public RollingBall(int speedAlongX, float distanceFromTop) {
        this.speedAlongX = speedAlongX;
        this.distanceFromTop = distanceFromTop;
    }
}
