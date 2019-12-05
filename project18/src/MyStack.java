import Character.*;
import java.util.LinkedList;
public class MyStack implements Stack {
    LinkedList<Hero> value = new LinkedList<>();
    @Override
    public void push(Hero h){
        this.value.add(h);
    }
    @Override
    public Hero pull(){
        Hero temp = this.value.getLast();
        this.value.removeLast();
        return temp;
    }
    @Override
    public Hero peek(){
        Hero temp = this.value.getLast();
        return temp;
    }
}
