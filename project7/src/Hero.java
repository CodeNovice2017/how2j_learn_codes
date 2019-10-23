import charactor.*;
import property.*;

public class Hero {

    public String name = "new hero"; //声明属性时初始化
    int hp;
    int moveSpeed;
    float armor;
    float maxHp;
    public enum Season{
        SPRING,SUMMER,AUTUMN,WINTER
    }
    public enum HeroType{
        TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING
    }
    public static int itemCapacity = 8; //声明的时候初始化
    static
    {
        itemCapacity = 6; //静态初始化块初始化
    }
    {
        maxHp = 200; //初始化块 进行对象属性初始化
    }

    static String copyright; //类属性，静态

    public Hero(){}

    public Hero(String name,int hp, int moveSpeed, float armor)
    {
        this.name = name;
        this.hp = hp;
        this.moveSpeed = moveSpeed;
        this.armor = armor;
    }

    public void recoveryBlood(int xp)
    {
        this.hp = hp + xp;
        xp = 0;
    }

    public void attack(Hero hero,int damage) //对象方法 非静态方法
    {
        hero.hp = hero.hp - damage;
        if(hero.hp == 0||hero.hp < 0)
        {
            System.out.println(hero.name+"has been killed!");
        }
        else
            System.out.println(hero.name+"has been beat "+damage);
    }

    public void dieReal(){ //对象方法 非静态方法
        this.hp = 0;
    }


    public static void battleWin(){  //类方法 静态方法
        System.out.println("Battle win!");
    }

    public void revive(Hero hero)
    {
        hero = new Hero("提莫",383,340,30);
    }

    public void kill(Mortal m){
        m.die();
    }

    public static void main(String[] args)
    {
        Hero garen = new Hero("garen",550,360,50);
        garen.copyright = "版权由Riot G司所有";
        int bloodBottle = 50;
        garen.copyright = "Blizzard Entertainment Enterprise";
        garen.recoveryBlood(bloodBottle);
        System.out.println(bloodBottle); //方法内无法修改传入的参数

        //对象方法和类方法
        garen.dieReal();
        Hero.battleWin();

        //构造方法重载
        Hero teemo = new Hero("teemo",383,340,30);
        System.out.println(garen.hp);
        teemo.attack(garen,100);
        System.out.println(garen.hp);

        //验证方法传参
        teemo.hp -= 400;
        teemo.revive(teemo);
        System.out.println(teemo.hp);

        //import导入包
        ADHero kate = new ADHero();

        //静态属性(类属性)
        System.out.println(teemo.copyright);
        System.out.println(Hero.copyright);

        //饿汉式单例模式的测试

        //测试直接使用new确实不可以声明 GiantDragon item = new GiantDragon();
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        System.out.println(g1==g2);
        System.out.println(g2==g3);

        //懒汉式单例模式
        SmallDragon g4 = SmallDragon.getInstance();
        SmallDragon g5 = SmallDragon.getInstance();

        System.out.println(g4==g5);

        //枚举是一种特殊的类(仍然是类)
        Season season = Season.SPRING;
        switch(season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        for(Season s : Season.values())
        {
            System.out.println(s);
        }
        for(HeroType h : HeroType.values())
        {
            System.out.println(h);
        }

        //对象类型转换
        //可行情况
        ADHero ad = new ADHero();
        LolHero h1 = new LolHero();

        //未将子类转换为父类时，总是假
        System.out.println(h1 instanceof ADHero);

        h1 = ad;

        //子类转换为父类时，总是真
        System.out.println(h1 instanceof ADHero);

        ad = (ADHero)h1;
        //不行的情况
        LolHero h2 = new LolHero();
        ADHero ad2 = new ADHero();
        Support sup1 = new Support();
        h2 = sup1; //把辅助英雄当成英雄 把子类转父类
        System.out.println(h2); //输出h2的地址和sup1的地址是一样的
        System.out.println(sup1);
        //ad2 = (ADHero)h2; //把指向support对象的h2 转换为ad2引用的类型ADHero

        ADHero ad3 = new ADHero();
        APHero ap1 = new APHero();

        //ad3 = (ADHero)ap1; //无继承关系的类型进行相互转换一定会失败，所以会出现编译错误

        ADHero ad4 = new ADHero();

        System.out.println(ad4);

        AD adi = ad4; //ADHero类转换成AD接口 向上转型无需强制类型转换 并且一定能成功
        //说法是向上转换 ADHero类转换为AD接口
        //实际上是adi是AD类型的接口对象，即adi是AD的引用，指向的是ADHero，就是ADHero类型的对象ad4被AD类型的接口对象adi指向了，即子类转换父类的说话


        System.out.println(adi);
        System.out.println(ad4);

        System.out.println(adi instanceof ADHero);
        System.out.println(ad4 instanceof AD);
        System.out.println(ad4 instanceof ADHero);

        //方法的重写
        Item i = new Item();
        i.effect();

        LifePotion lp = new LifePotion();
        lp.effect();

        //操作符的多态
        int a3 = 5;
        String b3 = "5";
        String c3 = a3+b3;
        System.out.println(c3);

        //类的多态
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();

        //多态的联系
        Hero kate1 = new Hero();
        ADHero xia = new ADHero();
        APHero timo = new APHero();
        ADAPHero ez = new ADAPHero();

        kate1.kill(xia);
        kate1.kill(timo);
        kate1.kill(ez);

        //super
//        实例化一个ADHero(), 其构造方法会被调用
//        其父类的构造方法也会被调用 并且是父类构造方法先调用
//        子类构造方法会默认调用父类的 无参的构造方法
        new LolHero();
        new ADHero();

    }
}
