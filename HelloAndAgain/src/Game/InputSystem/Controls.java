package Game.InputSystem;

import processing.core.PApplet;

public class Controls extends PApplet {



    /*

        Controls:
        0 - w
        1 - a
        2 - s
        3 - d
        4 - q
        5 - e
        6 - r
        7 - f

     */


    boolean[] controls = new boolean[8];


    public Controls() {
        for(int i = 0; i < controls.length; i++){controls[i] = false;}
    }


    public void keyManager(char key, boolean released) {

    }



}
