package Game.Player.Attributes;

public class XP {
    // will always be 100 to start will increase by exponential
    private int requiredToLevelUp = 100, currentXP, currentLVL = 1, skillPoints;

    public XP() {
        currentXP = 0;
        skillPoints = 0;
    }
    public void CheckLvl() {
        if(currentXP >= requiredToLevelUp) {
            currentLVL++;
            currentXP -= requiredToLevelUp;
            increaseRequired();
            addSkillpoints();
            CheckLvl();
        }
    }
    public void increaseRequired() {
        requiredToLevelUp += requiredToLevelUp/2;
    }
    public void addSkillpoints() { skillPoints += 3;}
    public void increaseXP(int i) {
        currentXP += i;
        CheckLvl();
    }
    public int getRequiredToLevelUp() {
        return requiredToLevelUp;
    }
    public void setRequiredToLevelUp(int requiredToLevelUp) {
        this.requiredToLevelUp = requiredToLevelUp;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP = currentXP;
    }

    public int getCurrentLVL() {
        return currentLVL;
    }

    public void setCurrentLVL(int currentLVL) {
        this.currentLVL = currentLVL;
    }
}
