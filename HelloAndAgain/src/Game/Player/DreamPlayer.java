package Game.Player;

public class DreamPlayer extends Player{

    public DreamPlayer(int startX, int startY, int HealthMax) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(false);
    }


}
