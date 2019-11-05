package charactor;
import property.*;


public abstract class LolHero
{
    private String name;
    int hp;
    float armor;
    int moveSpeed = 350;

    public static final int itemTotalNumber = 6;

    public LolHero(){
        System.out.println("Hero的构造方法");
    }
    public LolHero(String name){
        System.out.println("Hero有一个参数的构造方法");
        this.name = name;
    }
    public static void battleWin(){
        System.out.println("hero battle win!");
    }
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    public String toString(){
        return name;
    }
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public boolean equals(Object o)
    {
        if(o instanceof LolHero)
        {
            LolHero h = (LolHero)o;
            return this.hp == h.hp;
        }
        return false;
    }

    //抽象方法
    public abstract void attack();

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill>8)
            {
               System.out.println(name + "超神!");
            }
            else
                System.out.println(name + "尚未超神!");
        }
    }
}