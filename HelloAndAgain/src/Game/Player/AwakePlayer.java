package Game.Player;



public class AwakePlayer extends Player{
    // This wont have anything additional besides certain objective
    public AwakePlayer(int startX, int startY, int HealthMax) {
        super(startX, startY, HealthMax);
        this.setEnableLeveling(true);
    }
}
