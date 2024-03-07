public abstract class Monsters {
    private String monsterName;
    private int monsterHealth;
    private int monsterDamage;

    public Monsters(String monsterName, int monsterHealth, int monsterDamage) {
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
        this.monsterDamage = monsterDamage;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }
}
