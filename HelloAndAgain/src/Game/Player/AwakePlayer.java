package Game.Player;


import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

public class AwakePlayer extends Player {
    PImage image;


    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);
        image = new PImage();

    }



}
