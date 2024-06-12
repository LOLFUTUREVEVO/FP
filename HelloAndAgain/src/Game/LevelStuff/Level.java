package Game.LevelStuff;

import processing.core.PApplet;
import processing.core.PImage;

public class Level {
    private int size;
    private int[][] board;
    private int currCellX, currCellY;
    public int winX,winY;
    // start - 1 , finish - 2, standard - 3

    public Level() {
        board = new int[5][5];
        int randX, randY;
        randX = (int)(Math.random() * (5 - 0) + 0);
        randY = (int)(Math.random() * (5 - 0) + 0);
        board[randX][randY] = 1;
        currCellX =randX;
        currCellY = randY;
        randX = (int)(Math.random() * (4 - 0) + 0);
        winX = randX;
        randY = (int)(Math.random() * (4 - 0) + 0);
        winY = randY;
        board[randX][randY] = 2;
        for(int i = 0; i < board.length;i++) {
            for(int j = 0; j < board[0].length;j++) {
                if(board[i][j] == 0) {
                    board[i][j] = 3;
                }
            }
        }
    }

    public void incXandY(int x, int y) {
        if(x > 0) {
            currCellX++;
            if(currCellX > board.length - 1) {
                currCellX = 0;
            }
        } else if(x < 0){
            currCellX--;
            if(currCellX < 0) {
                currCellX = board.length - 1;
            }

        }
        if(y > 0) {
            currCellY++;
            if(currCellY > board.length - 1) {
                currCellY = 0;
            }
        } else if(y < 0) {
            currCellY--;
            if(currCellY < 0) {
                currCellY = 0;
            }
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void displayRoom(PApplet main) {
        // Left and Right walls
        main.noStroke();
        main.fill(0,0,255);
        main.rect(0,0,200,360);

        main.fill(185, 196, 122);
        main.rect(0,360,200,720);

        main.fill(0,0,255);
        main.rect(0,720,200,1080);
        main.fill(0,0,255);
        main.rect(main.width - 200,0,1080,360);

        main.fill(185, 196, 122);
        main.rect(main.width - 200,360,1080,720);

        main.fill(0,0,255);
        main.rect(main.width - 200,720,1080,1080);
        // Top and Bottom walls
        main.fill(0,0,255);
        main.rect(0,0,640,170);
        main.fill(185, 196, 122);
        main.rect(640,0,main.width - 1280,170);
        main.fill(0,0,255);
        main.rect(1280,0,main.width,170);
        main.fill(0,0,255);
        main.rect(0,910,640,170);
        main.fill(185, 196, 122);
        main.rect(640,910,main.width - 1280,170);
        main.fill(0,0,255);
        main.rect(1280,910 ,main.width,170);
        //System.out.println(currCellX + ", " + currCellY);
    }
    public int getCurrCellX() {
        return currCellX;
    }
    public int getCurrCellY() {
        return currCellY;
    }
}
