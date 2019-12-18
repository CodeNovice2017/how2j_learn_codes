package multiplethread;

import charactor.Hero;

public class TestThread {
    public static void main(String[] args){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //创建多线程的继承线程类的方法
//        KillThread kt1 = new KillThread(gareen,teemo);
//        kt1.start();
//        KillThread kt2 = new KillThread(bh,leesin);
//        kt2.start();
        //创建多线程的实现Runnable接口
//        Battle battle1 = new Battle(gareen,teemo);
//        new Thread(battle1).start();
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();
        //创建多线程的匿名类实现
        Thread t1 = new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        t2.start();
    }
}
