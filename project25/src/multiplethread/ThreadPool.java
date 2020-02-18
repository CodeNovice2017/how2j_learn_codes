package multiplethread;

import java.util.LinkedList;

public class ThreadPool {
    //线程池的大小
    int threadPoolSize;
    //任务容器
    LinkedList<Runnable> tasks = new LinkedList<Runnable>();
    //试图消费任务的线程
    public ThreadPool(){
        threadPoolSize = 10;
        //启动十个任务消费者线程
        synchronized(tasks){
            for(int i=0;i<threadPoolSize;i++){
                new TaskConsumeThread("任务消费者线程 " + i).start();
            }
        }
    }
    public void add(Runnable r){
        synchronized(tasks){
            tasks.add(r);
            //唤醒等待的任务消费者线程
            tasks.notifyAll();
        }
    }
    //创建一个非静态内部类
    class TaskConsumeThread extends Thread{
        //含参构造函数
        public TaskConsumeThread(String name){
            super(name);
        }
        Runnable task;
        public void run() {
            System.out.println("启动: " + this.getName());
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    tasks.notifyAll();
                }
                System.out.println(this.getName() +"获取到任务,并执行");
                task.run();
            }
        }
    }
}
