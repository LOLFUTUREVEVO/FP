package Game.Player.Attributes;

public class Position {
    private int x,y;
    private int xVel,yVel;

    public Position(int startX, int startY){
        x = startX;
        y = startY;
        xVel = 0;
        yVel = 0;
    }

    public void UpdatePosition() {

    }


    public void incxVel(int a) {
        xVel += a;
    }
    public void incyVel(int a) {
        yVel += a;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxVel() {
        return xVel;
    }

    public void setxVel(int xVel) {
        this.xVel = xVel;
    }

    public int getyVel() {
        return yVel;
    }

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }
}
