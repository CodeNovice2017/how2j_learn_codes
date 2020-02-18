package charactor;

public class Hero{
    public String name;
    public float hp;
    public int damage;

    public Hero(){

    }

    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //回血
    public synchronized void recover(){
        hp=hp+1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        // 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
        this.notify();
    }

    //掉血
    public synchronized void hurt(){
        if(hp == 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hp = hp - 1;
        }
    }

    public void attackHero(Hero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

}