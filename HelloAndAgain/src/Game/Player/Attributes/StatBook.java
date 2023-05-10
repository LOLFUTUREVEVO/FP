package Game.Player.Attributes;

public class StatBook {

    int Hp, Mp, Def, Pow, Spd, Luck;

    // The default stats for any given character, you can change these with the getters and setters \\
    public StatBook() {
        Hp = 1;
        Mp = 1;
        Def = 1;
        Pow = 1;
        Spd = 1;
        Luck = 1;
    }

    public StatBook(int hp, int mp, int def, int pow, int spd, int luck) {
        Hp = hp;
        Mp = mp;
        Def = def;
        Pow = pow;
        Spd = spd;
        Luck = luck;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMp() {
        return Mp;
    }

    public void setMp(int mp) {
        Mp = mp;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int def) {
        Def = def;
    }

    public int getPow() {
        return Pow;
    }

    public void setPow(int pow) {
        Pow = pow;
    }

    public int getSpd() {
        return Spd;
    }

    public void setSpd(int spd) {
        Spd = spd;
    }

    public int getLuck() {
        return Luck;
    }

    public void setLuck(int luck) {
        Luck = luck;
    }
}
