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
        plrA = new AwakePlayer(width/2, height/2 , 100, this, loadImage("HelloAndAgain/src/Game/Assets/AwakeCharacter.png", "png"));
    }


    public void draw() {
        background(255);
        plrA.displayPlayer(this);
    }




    public static void main(String[] args) {
        PApplet.main("Game.Main");
    }

}
