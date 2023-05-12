package Game.Player;


import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

import static processing.awt.ShimAWT.loadImage;

public class AwakePlayer extends Player {
    public PImage frame1, frame2;

    private int lol = 0;
    PImage[] imgarr = new PImage[2];


    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax, PApplet main, PImage img, PImage f2) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);
        frame1 = new PImage();
        frame2 = new PImage();
        frame1 = img;
        frame2 = f2;


        imgarr[0] = frame1;
        imgarr[1] = f2;
    }
    public void displayPlayer(PApplet main) {

        main.image(imgarr[lol], super.getCharPos().getX(), super.getCharPos().getY());
    }
    public void AnimatorAwake() {
        if(lol == 0) {
            lol++;
        } else {
            lol--;
        }
    }


}
