import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import Character.*;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        names.add("gareen");
        System.out.println(names);
        names.add("gareen");
        System.out.println(names);

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        System.out.println(numbers);
        for(Iterator<Integer> it1 = numbers.iterator();it1.hasNext();) {
            Integer i = (Integer) it1.next();
            System.out.println(i);
        }
        for(Integer i:numbers){
            System.out.println(i);
        }
        //Practice HashSet
        HashSet<Integer> numbers2 = new HashSet<>();
        for(int i=0;i<50;i++)
        {
            int j = (int)(Math.random()*10000);
            numbers2.add(j);
        }
        for(Iterator<Integer> it = numbers2.iterator();it.hasNext();)
        {
            Integer i = it.next();
            System.out.println(i);
        }
        //Test ArrayList LinkedList
        List<Integer> al1 = new ArrayList<>();
        List<Integer> ll1 = new LinkedList<>();
        insertLast(al1,"ArrayList");
        insertLast(ll1,"LinkedList");
        //Practice HashMap
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("adc","物理英雄");
        hm1.put("apc","魔法英雄");
        hm1.put("t","坦克");
        System.out.println(hm1);
        Set<String> key1 = hm1.keySet();
        HashMap<String,String> hm2 = new HashMap<>();
        for(String s:key1){
            hm2.put(hm1.get(s),s);
        }
        System.out.println(hm2);
        //Practice HashSet和TreeSet
        LinkedHashSet<Integer> ls1 = new LinkedHashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        TreeSet<Integer> ts1 = new TreeSet<>();


        String str1 = Double.toString(Math.PI);
        char[] cs = str1.toCharArray();
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        for(char i:cs){
            if(i!='.') {
                int j = Integer.parseInt(String.valueOf(i));
                lhs1.add(j);
            }
        }
        System.out.println(lhs1);
        //Comparator比较器的使用
        Random r = new Random();
        List<Hero> heros = new ArrayList<>();

        for(int i = 0 ;i<10;i++){
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+i,r.nextInt(100),r.nextInt(100)));
        }
        System.out.println("初始化后的集合: ");
        System.out.println(heros);

        Comparator<Hero> c = new Comparator<Hero>(){
            @Override
            public int compare(Hero h1,Hero h2){
                if(h1.hp>=h2.hp)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(heros,c);
        System.out.println(heros);

    }
    private static void insertLast(List<Integer> l,String type){
        int  total = 1000*1000;
        final int number = 5;
        long start = System.currentTimeMillis();
        for(int i = 0;i<total;i++){
            l.add(0);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最后面插入%d条数据,总共耗时%d毫秒%n",type,total,end-start);
    }
    //这个类方法是错误的 会报错 具体理解留到学了多线程安全之后
    private static void reverseHashMap(HashMap<String,String> l){
        Set<String> keyH = l.keySet();
        for(String s:keyH){
            String temp = l.get(s);
            l.put(temp,s);
        }
    }

}
