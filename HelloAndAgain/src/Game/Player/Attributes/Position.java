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


}
