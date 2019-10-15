import charactor.*;
import property.Weapon;

public class Hero {

    String name;
    int hp;
    int moveSpeed;
    float armor;
    public Hero(){};
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
    public void attack(Hero hero,int damage)
    {
        hero.hp = hero.hp - damage;
        if(hero.hp == 0||hero.hp < 0)
        {
            System.out.println(hero.name+"has been killed!");
        }
        else
            System.out.println(hero.name+"has been beat "+damage);
    }
    public void revive(Hero hero)
    {
        hero = new Hero("提莫",383,340,30);
    }
    public static void main(String[] args)
    {
        Hero garen = new Hero("garen",550,360,50);
        int bloodBottle = 50;
        garen.recoveryBlood(bloodBottle);
        System.out.println(bloodBottle); //方法内无法修改传入的参数
        Hero teemo = new Hero("teemo",383,340,30);
        System.out.println(garen.hp);
        teemo.attack(garen,100);
        System.out.println(garen.hp);
        teemo.hp -= 400;
        teemo.revive(teemo);
        System.out.println(teemo.hp);
        ADHero kate = new ADHero();
    }
}
