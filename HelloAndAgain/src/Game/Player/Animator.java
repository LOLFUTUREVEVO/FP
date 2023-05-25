package Game.Player;

import processing.core.PApplet;
import processing.core.PImage;

import java.io.File;

public class Animator {

    PImage[] animationTrack;
    PImage CurrentFrame;
    int currentFrameVal = 0;
    int counter;


    public Animator(int animLength, PApplet main, String PathName) {
        animationTrack = new PImage[animLength];
        CurrentFrame = animationTrack[0];

        File path = new File(PathName);

        File [] files = path.listFiles();
        for (int i = 0; i < files.length; i++){
            if (files[i].isFile()){ //this line weeds out other directories/folders
                System.out.println(files[i].getPath());
                animationTrack[i] = main.loadImage(files[i].getPath());
            }
        }

    }
    public void nextFrame() {
        if(counter > 10) {
            if( currentFrameVal >= animationTrack.length - 1) {
                currentFrameVal = 0;
            } else {
                currentFrameVal++;
            }
            counter = 0;
        }
        counter++;
        System.out.println("Next Frame: " + currentFrameVal);
    }
    //C:\Users\KarolKopciuch\OneDrive - NYCDOE\Desktop\Pixlab\FinalProject\HelloAndAgain\src\Game\Assets\Character\Idle\Unused\pixil-frame-0.png
    //Game/Assets/Character/Idle/Unused/

    public void updateFrame() {
        CurrentFrame = animationTrack[currentFrameVal];
    }

    public void testDraw(PApplet main) {
        main.image(animationTrack[0], 300, 300);
    }
    public PImage getCurrentFrame() {
        return CurrentFrame;
    }

}
