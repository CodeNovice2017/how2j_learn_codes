import java.util.ArrayList;
import java.util.HashMap;
import Character.*;
import java.util.List;

public class TestHashMap {
    public static void main(String[] args){
        Hero[] ha = new Hero[3000000];
        for(int i=0;i<ha.length;i++){
            ha[i] = new Hero("Hero-"+Math.random()*(10000-1000));
        }
        List<Hero> lh = new ArrayList<>();
        HashMap<String,String> hm1 = new HashMap<>();
        for(int i=0;i<ha.length;i++) {
            hm1.put("hero"+i,ha[i].name);
        }
        for(Hero h:ha){
            lh.add(h);
        }
        int numbers =0;
        long t1 = System.currentTimeMillis();
        for(Hero h:lh){
            if(h.name.substring(5,9).equals("5555")){
                numbers++;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
