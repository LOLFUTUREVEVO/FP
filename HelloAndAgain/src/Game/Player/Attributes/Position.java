package Game.Player.Attributes;

public class Position {
    private int x,y;
    private int xVel,yVel;
    private int maxXVel, maxyVel;
    public Position(int startX, int startY, int mxv, int myv){
        x = startX;
        y = startY;
        xVel = 0;
        yVel = 0;
        maxXVel = mxv;
        maxyVel = myv;
    }

    public void UpdatePosition() {
        x += xVel;
        y += yVel;
    }


    public void incxVel(int a) {
        xVel += a;
    }
    public void incyVel(int a) {
        yVel += a;
    }

    public void checkMax() {
        if(xVel > maxXVel) {
            xVel = maxXVel;
        }
        if(yVel > maxyVel) {
            yVel = maxyVel;
        }
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
