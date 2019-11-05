package charactor;

public class APHero extends LolHero implements AP,Mortal{
    @Override
    public void magicAttack() {
       System.out.println("进行魔法攻击");
    }

    @Override
    public void die(){
        System.out.println("魔法英雄死亡");
    }

    public void attack(){
        magicAttack();
    }
}
