package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import charactor.*;

public class TestLambda {
    public static void main(String[] args){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for(int i = 0;i<10;i++){
            heros.add(new Hero("hero "+ i,r.nextInt(1000),r.nextInt(100)));
        }
        System.out.println("初始化后的集合:");
        System.out.println(heros);
        System.out.println("筛选后: ");
        //匿名类的正确写法
        HeroChecker checker = new HeroChecker(){
            @Override
            public boolean test(Hero h){
                return (h.hp>100&&h.damage<50);
            }
        };
        HeroChecker c1 = (Hero h)->{return (h.hp>100&&h.damage<50);};
        HeroChecker c2 = (Hero h)->h.hp>100&&h.damage<50;
        HeroChecker c3 = h->h.hp>100&&h.damage<50;
        filter(heros,checker);
        filter(heros,c3);
        filter(heros,h->h.hp>100&&h.damage<50);
        //lambda表达式的引用静态方法
        filter(heros,TestLambda::testHero);
        filter(heros,h->TestLambda.testHero(h));
        //lambda表达式的引用对象方法(想通过编译需要将将下面testHero方法改为非静态方法)
//        TestLambda testHero1 = new TestLambda();
//        filter(heros,testHero1::testHero);
        //引用容器中的对象方法
        filter(heros,h->h.matched());
        filter(heros,Hero::matched);
        //引用构造器的方法
        Supplier<List> s = new Supplier<List>(){
            public List get(){
                return new ArrayList();
            }
        };
        List list1 = getList(s);
        List list2 = getList(()->new ArrayList());
        List list3 = getList(ArrayList::new);
    }

    private static void filter(List<Hero> l,HeroChecker checker){
        for(Hero h:l){
            if(checker.test(h)) {
                System.out.println(h);
            }
        }
    }
    public static boolean testHero(Hero h){
        return h.hp>100&&h.damage<50;
    }
    public static List getList(Supplier<List> s){
        return s.get();
    }

}
