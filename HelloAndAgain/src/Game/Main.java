package Game;

import Game.InputSystem.Controls;
import Game.LevelStuff.Level;
import Game.Player.AwakePlayer;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.Timer;

public class Main extends PApplet {
    public AwakePlayer plrA;
    public Level mainPlace;
    public Controls inputSystem;
    int frameC = 0;
    PImage crosshair;

    int startCellX, startCellY;
    int tileSize = 20;



    public void settings() {
        size(1920,1080);
        fullScreen();
    }






    public void setup() {
        plrA = new AwakePlayer(width/2 - 32, height/2 - 32 , 100, this, loadImage("Game/Assets/Character/Idle/CharFrameOneIdle.png", "png") , loadImage("Game/Assets/Character/Idle/CharFrameTwoIdle.png", "png"));
        crosshair = loadImage("Game/Assets/Crosshair.png");
        mainPlace= new Level();
        startCellX = mainPlace.getCurrCellX();
        startCellY = mainPlace.getCurrCellY();
        inputSystem = new Controls();

    }

    boolean won = false;
    int milis = 0;

    public void draw() {
        if(!won) {

            milis+=3;
            //System.out.println("Milis: " + milis);
            boolean[] inputs;
            background(50);
            if (mainPlace.getCurrCellY() == mainPlace.winY && mainPlace.getCurrCellX() == mainPlace.winX) {
                background(0, 255, 0);
                textSize(50);
                fill(0);
                text("YOU WON!!!!", width / 2 - 500, height / 2 - 250, width / 2 + 100, height / 2 + 100);
                String timeStat = "Time : " + milis / 1000 + "s";
                text(timeStat, width / 2 - 500, height / 2 - 150 , width / 2 + 100, height / 2 + 100);
                won = true;
            }
            fill(255);
            if (mainPlace.getCurrCellX() == startCellX && mainPlace.getCurrCellY() == startCellY) {
                textSize(50);
                text("Find Your way out, you'll know when you see the victory screen", width / 2 - 500, height / 2 - 250, width / 2 + 100, height / 2 + 100);
            }


            plrA.displayPlayer(this);

            mainPlace.displayRoom(this);


            plrA.getCharPos().checkMax();
            plrA.getCharPos().UpdatePosition();


            inputs = inputSystem.checkHeld();
            if (inputs[0] == true && inputs[2] == true) {
                plrA.getCharPos().setyVel(0);
            } else if (inputs[0] == true) {
                plrA.getCharPos().setyVel(-5);
            } else if (inputs[2] == true) {
                plrA.getCharPos().setyVel(5);
            } else {
                plrA.getCharPos().setyVel(0);
            }

            if (inputs[1] == true && inputs[3] == true) {
                plrA.getCharPos().setxVel(0);
            } else if (inputs[1] == true) {
                plrA.getCharPos().setxVel(-5);
            } else if (inputs[3] == true) {
                plrA.getCharPos().setxVel(5);
            } else {
                plrA.getCharPos().setxVel(0);
            }

            if (plrA.getCharPos().getX() > 640 && plrA.getCharPos().getX() < width - 640 && plrA.getCharPos().getY() < 200) {
                mainPlace.incXandY(0, -1);
                plrA.getCharPos().setY(height - 350);
                System.out.println(mainPlace.winX + ", " + mainPlace.winY);
                System.out.println(mainPlace.getCurrCellX() + ", " + mainPlace.getCurrCellY());
            } else if (plrA.getCharPos().getX() > 640 && plrA.getCharPos().getX() < width - 640 && plrA.getCharPos().getY() > height - 200) {
                mainPlace.incXandY(0, 1);
                plrA.getCharPos().setY(350);
                System.out.println(mainPlace.winX + ", " + mainPlace.winY);
                System.out.println(mainPlace.getCurrCellX() + ", " + mainPlace.getCurrCellY());
            } else if (plrA.getCharPos().getY() > 360 && plrA.getCharPos().getY() < height - 360 && plrA.getCharPos().getX() < 200) {
                mainPlace.incXandY(-1, 0);
                plrA.getCharPos().setX(width - 350);
                System.out.println(mainPlace.winX + ", " + mainPlace.winY);
                System.out.println(mainPlace.getCurrCellX() + ", " + mainPlace.getCurrCellY());
            } else if (plrA.getCharPos().getY() > 360 && plrA.getCharPos().getY() < height - 360 && plrA.getCharPos().getX() > width - 200) {
                mainPlace.incXandY(1, 0);
                plrA.getCharPos().setX(300);
                System.out.println(mainPlace.winX + ", " + mainPlace.winY);
                System.out.println(mainPlace.getCurrCellX() + ", " + mainPlace.getCurrCellY());
            }



        }





    }

    public void keyPressed() {
        inputSystem.keyManager(key, true);
    }

    public void keyReleased() {
        inputSystem.keyManager(key, false);
    }



    public static void main(String[] args) {
        PApplet.main("Game.Main");
    }

}
