import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class TestArrayList {
    public static void main(String[] args) {
//        ArrayList<LOL> lol = new ArrayList<>();
//        List<Hero> heros = new ArrayList<Hero>();
//        for (int i = 0; i < 5; i++) {
//            heros.add(new Hero("hero" + i));
//        }
//        System.out.println("--------使用while的iterator-------");
//        Iterator<Hero> it = heros.iterator();
//        while (it.hasNext()) {
//            Hero h = it.next();
//            System.out.println(h);
//        }
//        System.out.println("--------使用for的iterator-------");
//        for (Iterator<Hero> it2 = heros.iterator(); it2.hasNext(); ) {
//            Hero hero = (Hero) it2.next();
//            System.out.println(hero);
//        }
//        System.out.println("--------增强型for循环-------");
//        for (Hero h : heros) {
//            System.out.println(h);
//        }
//        //test
//        System.out.println("--------测试-------");
//        List<Hero> h2 = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            h2.add(new Hero("hero" + i));
//        }
//        for (Iterator it3 = h2.iterator(); it3.hasNext(); ) {
//            Hero temp1 = (Hero) it3.next();
//            int cs;
//            if (temp1.name.length() == 6) {
//                cs = (int) 10 * temp1.name.charAt(4);
//                cs += (int) temp1.name.charAt(5);
//            } else {
//                cs = (int) temp1.name.charAt(4);
//            }
//            if (cs % 8 == 0 && cs != 0) {
//                System.out.println(temp1.name);
//            }
//        }
//        LinkedList<Hero> ll = new LinkedList<>();
//        ll.addLast(new Hero("hero7"));
//        ll.addLast(new Hero("hero8"));
//        ll.addLast(new Hero("hero9"));
//        System.out.println(ll);
//        ll.addFirst(new Hero("hero10"));
//        System.out.println(ll);
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        System.out.println(ll.removeFirst());
//
//        //Queue
//        Queue<Hero> q = new LinkedList<>();
//        //加在队列的最后面
//        System.out.print("初始化队列：\t");
//        q.offer(new Hero("Hero1"));
//        q.offer(new Hero("Hero2"));
//        q.offer(new Hero("Hero3"));
//        q.offer(new Hero("Hero4"));
//        System.out.println(q);
//        Hero h = q.poll();
//        System.out.println(h);
//        System.out.println(q);
//        h = q.peek();
//        System.out.println(q);
//
//        MyStack mys = new MyStack();
//        Hero h3 = new Hero("hero timo");
//        Hero h4 = new Hero("hero gareen");
//        mys.push(h3);
//        mys.push(h4);
//        System.out.println(mys.peek());

        //二叉树
        int[] randoms = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node roots = new Node();
        for (int numbers : randoms) {
            roots.add(numbers);
        }
        roots.MidTravel(roots);
        Hero[] ha1= new Hero[10];
        for(int i=0;i<ha1.length;i++){
            ha1[i] = new Hero(300+i);
        }
        Hero rooths = new Hero(500);
        for(Hero temp : ha1){
            rooths.add(temp);
        }
        rooths.HpMidTravel(rooths);
    }
}
