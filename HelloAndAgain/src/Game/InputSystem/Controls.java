package Game.InputSystem;

import processing.core.PApplet;

public class Controls extends PApplet {



    /*

        Controls:
        0 - w - Up
        1 - a - Left
        2 - s - Down
        3 - d - Right
        4 - q - Ability 1
        5 - e - Ability 2
        6 - r - Ability 3
        7 - f - Ultimate

     */


    boolean[] controls = new boolean[8];


    public Controls() {
        for(int i = 0; i < controls.length; i++){controls[i] = false;}
    }


    public void keyManager(char key, boolean released) {

    }



}
