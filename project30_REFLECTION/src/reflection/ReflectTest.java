package reflection;
import charactor.Hero;
import java.lang.reflect.Constructor;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import charactor.ADHero;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws InterruptedException{
        String className = "charactor.Hero";
        try {
            //在一个JVM中，一种类，只会有一个类对象存在。所以以下三种方式取出来的类对象，都是一样的。
//            准确的讲是一个ClassLoader下，一种类，只会有一个类对象存在。通常一个JVM下，只会有一个ClassLoader。
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass(); //实例化对象以获取类对象
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        //练习：在类方法前，加上修饰符 synchronized，同步对象是什么呢？
//        Thread t1 = new Thread(){
//            public void run(){
//                ReflectTest.method1();
//            }
//        };
//        t1.setName("第一个线程");
//        t1.start();
//        Thread t2 = new Thread(){
//            public void run(){
//                ReflectTest.method2();
//            }
//        };
//        t2.setName("第二个线程");
//        t2.start();

        //与传统的通过new 来获取对象的方式不同
        //反射机制，会先拿到Hero的“类对象”,然后通过类对象获取“构造器对象”
        //再通过构造器对象创建一个对象
        Hero h1 = new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        try{
            String classname = "charactor.Hero";
            //获取类对象
            Class pClass1 = Class.forName(className);
            //构造器
            Constructor c = pClass1.getConstructor();
            //通过构造器实例化
            Hero h2 = (Hero) c.newInstance();
            h2.name = "gareen";
            System.out.println(h2);
        }catch(Exception e){
            e.printStackTrace();
        }
        //练习:通过配置文件获取对象
        File f1 = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\java.config");
        Hero h3 = getHero(f1);
        System.out.println(h3);

        //通过反射机制修改对象的属性
        Hero h = new Hero();
        h.name = "garen";
        try{
            Field fi1 = h1.getClass().getDeclaredField("name");
            fi1.set(h,"teemo");
            System.out.println(h.name);
        }catch(Exception e){
            e.printStackTrace();
        }
//        getField和getDeclaredField的区别
//                这两个方法都是用于获取字段
//        getField 只能获取public的，包括从父类继承来的字段。
//        getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。 (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))

        //调用方法
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            // 对h对象，调用这个方法
            m.invoke(h,"盖伦");
            System.out.println(h.getName());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void method1(){
        synchronized (ReflectTest.class){
            // 对于method1而言，同步对象是TestReflection.class，只有占用TestReflection.class才可以执行到这里
            System.out.println(Thread.currentThread().getName() + "进入method1方法");
            try{
                Thread.sleep(5000);
                System.out.println("运行5秒");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static synchronized void method2(){
        System.out.println(Thread.currentThread().getName() + "进入method2方法");
        try{
            System.out.println("运行5秒");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static Hero getHero(File f){
        ADHero katlin = null;
        try(FileReader fr = new FileReader(f);BufferedReader br = new BufferedReader(fr)){
            String line = br.readLine();
            String line2 = br.readLine();
            if(null != line){
                try{
                    Class pClass = Class.forName(line);
                    Constructor c = pClass.getConstructor();
                    katlin = (ADHero) c.newInstance();
                    Method m = katlin.getClass().getMethod("setName",String.class);
                    m.invoke(katlin,"凯特琳");

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return katlin;
    }
}
