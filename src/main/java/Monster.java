import java.util.HashMap;
import java.util.Objects;

public  class Monster {
    private Integer hp;
    private Integer xp =10;
    private Integer maxHP;
    private HashMap<String, Integer> item;


    public Monster(Integer maxHP, Integer xp, HashMap< String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.item = items;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("hp = ").append(hp).append("/").append(maxHP).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItem(), monster.getItem());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getHp());
        result = 31 * result + Objects.hashCode(getXp());
        result = 31 * result + Objects.hashCode(getMaxHP());
        result = 31 * result + Objects.hashCode(getItem());
        return result;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public void setItem(HashMap<String, Integer> item) {
        this.item = item;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItem() {
        return item;
    }
}
