package charactor;

import reflection.ReflectTest;

public class Hero {
    //为了访问属性，把name修改为public。
    //对于private修饰的成员，需要使用setAccessible(true)才能访问和修改
    public String name;
    public float hp;
    public int damage;
    public int id;
    public static int itemCapacity = 8;
    static{
        itemCapacity = 6;
    }
    static String copyright;
    static{
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hero(){

    }
    public Hero(String string) {
        name =string;
    }
    public static synchronized String getCopyright(){
        return copyright;
    }
    public boolean isDead() {
        // TODO Auto-generated method stub
        return false;
    }
    public void attackHero(Hero h2) {
        System.out.println(this.name+ " 正在攻击 " + h2.getName());
    }

    @Override
    public String toString(){
        return "Hero [name=" + name + "]";
    }
}
