package Game;

import Game.Player.AwakePlayer;
import Game.Player.DreamPlayer;
import processing.core.PApplet;

public class Main extends PApplet {
    public AwakePlayer plrA;
    public DreamPlayer plrD;

    public void settings() {
        size(1000,1000);
        fullScreen();
    }

    public void setup() {
        plrA = new AwakePlayer(width/2, height/2 , 100, this, loadImage("Game/Assets/Character/Idle/CharFrameOneIdle.png", "png"));
    }


    public void draw() {
        background(0);
        plrA.displayPlayer(this);
        plrA.getCharPos().checkMax();
    }

    public void keyPressed() {

    }

    public void keyReleased() {

    }



    public static void main(String[] args) {
        PApplet.main("Game.Main");
    }

}
