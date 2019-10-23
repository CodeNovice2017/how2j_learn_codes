package charactor;

public class ADHero extends LolHero implements AD,Mortal{
    @Override //覆写 重写
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void die(){
        System.out.println("物理英雄死亡");
    }
    public static void battleWin(){
        System.out.println("ad hero battle win!");
    }

    public ADHero(){
        System.out.println("AD Hero的构造方法");
    }
}