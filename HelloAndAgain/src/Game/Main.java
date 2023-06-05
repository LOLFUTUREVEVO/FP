package Game;

import Game.InputSystem.Controls;
import Game.Player.AwakePlayer;
import Game.Player.DreamPlayer;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
    public AwakePlayer plrA;
    public DreamPlayer plrD;
    public Controls inputSystem;
    int frameC = 0;
    PImage crosshair;


    int tileSize = 20;



    public void settings() {
        size(1920,1080);
        fullScreen();
    }






    public void setup() {
        plrA = new AwakePlayer(width/2 - 32, height/2 - 32 , 100, this, loadImage("Game/Assets/Character/Idle/CharFrameOneIdle.png", "png") , loadImage("Game/Assets/Character/Idle/CharFrameTwoIdle.png", "png"));
        crosshair = loadImage("Game/Assets/Crosshair.png");


    }


    public void draw() {
        noCursor();
        background(255);
        plrA.displayPlayer(this);



        plrA.getCharPos().checkMax();
        image(crosshair, mouseX - 42,mouseY - 42);
        frameC++;





    }

    public void keyPressed() {

    }

    public void keyReleased() {
        switch(key) {
            case 'w':

        }
    }



    public static void main(String[] args) {
        PApplet.main("Game.Main");
    }

}
