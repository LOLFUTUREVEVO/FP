package Game.Player;

import Game.Player.Attributes.Health;
import Game.Player.Attributes.StatBook;
import Game.Player.Attributes.XP;
import Game.Player.Attributes.Position;

public class Player {
    private Health healthBar;
    private XP lvlSystem;
    private Position charPos;
    private StatBook stats;

    public Player(int startX, int startY, int HealthMax) {
        healthBar = new Health(HealthMax, HealthMax);
        lvlSystem = new XP();
        charPos = new Position(startX, startY);
        stats = new StatBook();
        lvlSystem.setCurrentXP(0);
    }

    public Health getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(Health healthBar) {
        this.healthBar = healthBar;
    }

    public XP getLvlSystem() {
        return lvlSystem;
    }

    public void setLvlSystem(XP lvlSystem) {
        this.lvlSystem = lvlSystem;
    }

    public Position getCharPos() {
        return charPos;
    }

    public void setCharPos(Position charPos) {
        this.charPos = charPos;
    }


}
