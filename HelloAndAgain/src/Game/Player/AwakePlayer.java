package Game.Player;


import processing.core.PApplet;
import processing.core.PImage;

public class AwakePlayer extends Player {
    public PImage frame1, frame2;

    private int lol = 0;
    PImage[] IdleAnim = new PImage[2];
    PImage[] WalkingAnim = new PImage[5];
    public Animator IdleAnimator;
    public Animator WalkingAnimator;

    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax, PApplet main, PImage img, PImage f2) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);
        String Idle = System.getProperty("user.dir");
        Idle += "\\HelloAndAgain\\src\\Game\\Assets\\Character\\Idle\\Unused";
        String Walking = System.getProperty("user.dir");
        Walking += "\\HelloAndAgain\\src\\Game\\Assets\\Character\\Walking";
        IdleAnimator = new Animator(5, main, Idle,10);
        IdleAnimator.updateFrame();
        WalkingAnimator = new Animator(9, main, Walking,3);
        WalkingAnimator.updateFrame();

    }
    public void displayPlayer(PApplet main) {

        if(getCharPos().getxVel()  == 0 && getCharPos().getyVel() == 0) {
            main.image(IdleAnimator.getCurrentFrame(), super.getCharPos().getX(), super.getCharPos().getY());
            IdleAnimator.nextFrame();
            IdleAnimator.updateFrame();
        } else {
            main.image(WalkingAnimator.getCurrentFrame(), super.getCharPos().getX(), super.getCharPos().getY());
            WalkingAnimator.nextFrame();
            WalkingAnimator.updateFrame();
        }



    }



}
