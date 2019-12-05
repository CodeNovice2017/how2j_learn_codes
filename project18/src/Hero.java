import java.util.LinkedList;

public class Hero {
    public Hero RightHero;
    public Hero LeftHero;
    public Hero Roots;
    public int hp;

    public Hero() {
    }

    public Hero(int hp) {
        this.hp = hp;
    }

    public void add(Hero h) {
        if (Roots == null) {
            Roots = h;
        } else {
            if ((Integer) this.hp > (Integer) h.hp) {
                if (this.LeftHero == null) {
                    this.LeftHero = new Hero();
                    this.LeftHero.hp = h.hp;
                }
                this.LeftHero.add(h);
            } else {
                if (this.RightHero == null) {
                    this.RightHero = new Hero();
                    this.RightHero.hp = h.hp;
                    //千万不能忘了每次重新声明对象后,肯定要重新给赋值hp,因为How2J的答案是区分了HeroNode和Hero的
                    // ,HeroNode二叉树仅仅只是容器,里面存放的Hero都是实例化后的,都有各自的hp值,而我自己写的是二叉树节点就直接包括了hp的.

                }
                this.RightHero.add(h);
            }
        }
    }

    public void HpMidTravel(Hero h) {
        if (h == null) {
            return;
        }
        HpMidTravel(h.LeftHero);
        System.out.println(h.hp);
        HpMidTravel(h.RightHero);
    }
}
