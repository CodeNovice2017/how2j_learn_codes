package multiplethread;

import Stack.*;

public class ConsumerThread extends Thread{
    private MyStack<Character> stack;
    public ConsumerThread(MyStack<Character> stack,String name){
        super(name);
        this.stack = stack;
    }
    public void run(){
        while(true) {
            char c = stack.pull();
            System.out.println(this.getName()+"弹出:"+c);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
