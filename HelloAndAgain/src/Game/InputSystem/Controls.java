package Game.InputSystem;

import processing.core.PApplet;

public class Controls extends PApplet {



    /*

        Controls:
        0 - w - Up
        1 - a - Left
        2 - s - Down
        3 - d - Right


     */


    boolean[] controls = new boolean[4];


    public Controls() {
        for(int i = 0; i < controls.length; i++){controls[i] = false;}
    }


    public void keyManager(char key, boolean released) {
        switch (key) {
            case 'w':
                controls[0] = released;
                break;
            case 'a':
                controls[1] = released;
                break;
            case 's':
                controls[2] = released;
                break;
            case 'd':
                controls[3] = released;
                break;
        }
    }

    public boolean[] checkHeld() {
        return controls;
    }



}
