package bean;

/*
JavaBean的标准
1. 提供无参public的构造方法(默认提供)
2. 每个属性，都有public的getter和setter
3. 如果属性是boolean,那么就对应is和setter方法
 */
public class Hero {
    public int id;
    public String name;
    public float hp;
    public int damage;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
