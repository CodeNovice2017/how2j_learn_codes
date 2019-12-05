import java.util.ArrayList;
import character.Hero;

public class TestCollection {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args)
    {
        ArrayList heros = new ArrayList();
        for(int i = 0;i<5;i++)
        {
            heros.add(new Hero("hero"+i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(3,specialHero);
        System.out.println(heros.toString());
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));
        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        //System.out.println(heros.get(6));
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);

        Hero[] hero1 = new Hero[10];
        hero1 = (Hero[])(heros.toArray(new Hero[]{}));
        System.out.println(hero1[2]);

        Hero[] hero2 = (Hero[])heros.toArray(new Hero[]{});
        //test
        for(int i = 0;i<heros.size();i++) {
            if(heros.get(i).toString().equals("hero1"))
            {
                System.out.println("存在");
            }
        }

        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);


    }
}

