package Game.Abilities;

public abstract class Ability {

    private int dmg, cost, cooldown;


    public Ability() {
        dmg = 1;
        cost = 1;
        cooldown = 1;
    }


    public Ability(int dmg, int cost, int cooldown) {
        this.dmg = dmg;
        this.cost = cost;
        this.cooldown = cooldown;
    }

    public void activate() {

    }


}
