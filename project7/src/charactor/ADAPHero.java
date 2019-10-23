package charactor;

public class ADAPHero extends LolHero implements AP,AD,Mortal{
    @Override
    public void physicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die(){
        System.out.println("物理魔法英雄死亡");
    }
}
