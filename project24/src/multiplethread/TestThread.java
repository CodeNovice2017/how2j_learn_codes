package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;
import charactor.Hero;
import java.awt.GradientPaint;

public class TestThread {
    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            public void run(){
//                int seconds = 0;
//                while(true){
//                    try{
//                        Thread.sleep(1000);
//                    }catch(InterruptedException e){  //抛出中断异常
//                        e.printStackTrace();
//                    }
//                    System.out.printf("已经玩了LOL %d秒%n",seconds++);
//                }
//            }
//        };
//        t1.start();

        //多线程同步问题Concurrency问题
        //进行修改
//        final Object someObject = new Object();
//        final Hero gareen = new Hero();
//        gareen.name = "盖伦";
//        gareen.hp = 10000;
//
//        int n = 10000;
//        Thread[] addThreads = new Thread[n];
//        Thread[] reduceThreads = new Thread[n];
//
//        for(int i = 0 ; i < n;i++){
//            Thread t = new Thread() {
//                public void run() {
//                    synchronized(someObject) {
//                        gareen.recover();
//                    }
//                    try{
//                        Thread.sleep(100);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//            };
//            t.start();
//            addThreads[i] = t;
//        }
//        for(int i = 0 ; i < n;i++){
//            Thread t = new Thread() {
//                public void run() {
//                    synchronized(someObject) {
//                        gareen.hurt();
//                    }
//                    try{
//                        Thread.sleep(100);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//            };
//            t.start();
//            reduceThreads[i] = t;
//        }
//        for(Thread t : addThreads){
//            try{
//                t.join();
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//        for(Thread t: reduceThreads){
//            try{
//                t.join();
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n", n,n,gareen.hp);
//    }
        //死锁例程
//        final Hero ahri = new Hero();
//        ahri.name = "九尾妖狐";
//        final Hero annie = new Hero();
//        annie.name = "安妮";
//
//        Thread t1 = new Thread() {
//            public void run() {
//                //占有九尾妖狐
//                synchronized (ahri) {
//                    System.out.println("t1 已占有九尾妖狐");
//                    try {
//                        //停顿1000毫秒，另一个线程有足够的时间占有安妮
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//
//                    System.out.println("t1 试图占有安妮");
//                    System.out.println("t1 等待中 。。。。");
//                    synchronized (annie) {
//                        System.out.println("do something");
//                    }
//                }
//
//            }
//        };
//        t1.start();
//        Thread t2 = new Thread() {
//            public void run() {
//                //占有安妮
//                synchronized (annie) {
//                    System.out.println("t2 已占有安妮");
//                    try {
//
//                        //停顿1000毫秒，另一个线程有足够的时间占有暂用九尾妖狐
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                    System.out.println("t2 试图占有九尾妖狐");
//                    System.out.println("t2 等待中 。。。。");
//                    synchronized (ahri) {
//                        System.out.println("do something");
//                    }
//                }
//
//            }
//        };
//        t2.start();
//    }
        //死锁练习
//        final Hero anni = new Hero("安妮",1000);
//        final Hero huli = new Hero("狐狸",1000);
//        Thread t1 = new Thread(){
//            public void run(){
//                synchronized(anni){
//
//                }
//            }
//        };
        //交互例程
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;

        Thread t1 = new Thread(){
            public void run(){
                while(true){

                    //因为减血更快，所以盖伦的血量迟早会到达1
                    //使用while循环判断是否是1，如果是1就不停的循环
                    //直到加血线程回复了血量
                    while(gareen.hp==1){
                        continue;
                    }

                    gareen.hurt();
                    System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();
                    System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();
    }
}
