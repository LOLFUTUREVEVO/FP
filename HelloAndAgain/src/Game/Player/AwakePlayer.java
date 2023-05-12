package Game.Player;


import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

import static processing.awt.ShimAWT.loadImage;

public class AwakePlayer extends Player {
    PImage image;


    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax, PApplet main, PImage img) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);
        image = new PImage();
        image = img;
        img.resize(128,128);
    }
    public void displayPlayer(PApplet main) {
        main.image(image, super.getCharPos().getX(), super.getCharPos().getY());
    }



}
