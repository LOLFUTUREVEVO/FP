package Game.Player.Attributes;

public class Health {
    private int healthval, healthMax;

    public Health(int maxVal, int setVal) {
        healthval = setVal;
        healthMax = maxVal;
    }

    public void takeDamage(int i) {
        healthval -= i;
        if(healthval < 0 ) {
            healthval = 0;
        }
    }

    public void heal(int i) {
        healthval += i;
        if(healthval > healthMax ) {
            healthval = healthMax;
        }
    }

    public void setHealthMax(int b) {
        healthMax = b;
    }

    public void setHealthval(int c) {
        healthval = c;
    }

    public int getHealthval() {
        return healthval;
    }

    public int getHealthMax() {
        return healthMax;
    }
}
