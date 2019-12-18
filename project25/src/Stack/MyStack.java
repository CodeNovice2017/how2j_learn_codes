package Stack;

import charactor.*;
import java.util.LinkedList;

public class MyStack<T>{

    LinkedList<T> s = new LinkedList<T>();
    public synchronized void push(T t){
        while (s.size() >= 200) { //这里用while不断循环
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify(); //这里先通知后入栈(不知道顺序有什么影响)
        s.addLast(t);
    }
    public synchronized T pull(){
        while(s.size() == 0) { //也是用while
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        return s.removeLast();
    }
    public T peek() {
        return s.peek();  //peek不需要线程同步
    }
}
