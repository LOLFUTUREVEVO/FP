package Game.Player;


import processing.core.PApplet;
import processing.core.PImage;

public class AwakePlayer extends Player {
    public PImage frame1, frame2;

    private int lol = 0;
    PImage[] IdleAnim = new PImage[2];
    PImage[] WalkingAnim = new PImage[5];


    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax, PApplet main, PImage img, PImage f2) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);

        frame1 = img;
        frame2 = f2;


        IdleAnim[0] = frame1;
        IdleAnim[1] = f2;
    }
    public void displayPlayer(PApplet main) {

        main.image(IdleAnim[lol], super.getCharPos().getX(), super.getCharPos().getY());
    }
    public void AnimatorAwake() {
        if(lol == 0) {
            lol++;
        } else {
            lol--;
        }
    }


}
