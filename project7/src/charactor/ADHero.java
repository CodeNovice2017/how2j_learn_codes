package charactor;
import property.*;

public class ADHero extends LolHero implements AD,Mortal{

    int moveSpeed = 400;

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
    public ADHero(String name){ //子类显式调用父类带参构造方法
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public void attack(){
        physicAttack();
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public void userItem(Item i){
        System.out.println("adhero useitem");
        super.useItem(i);
    }
}