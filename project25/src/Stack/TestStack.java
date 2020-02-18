package Stack;

import charactor.*;
import Stack.*;
import multiplethread.ConsumerThread;
import multiplethread.ProducerThread;
import multiplethread.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import java.util.function.Consumer;

public class TestStack {
    public static void main(String[] args){
//        ThreadPool pool = new ThreadPool();
//        int sleep = 1000;
//        while(true){
//            pool.add(new Runnable(){
//                @Override
//                public void run(){
//                    System.out.println("执行任务");
//                    try{
//                        Thread.sleep(1000);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//            });
//            try{
//                Thread.sleep(sleep);
//                sleep = sleep>100?sleep-100:sleep;
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,15,60,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        threadPool.execute(new Runnable(){
            public void run(){
                System.out.println("任务1");
            }
        });
    }
}
