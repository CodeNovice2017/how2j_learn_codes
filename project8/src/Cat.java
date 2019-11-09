public class Cat extends Animal implements pet{
    String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");//在一个构造方法中调用另一个构造方法通过this()

    };
    @Override
    public void eat(){
        System.out.println(this.name+"吃");
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void play(){
        System.out.println("猫正在玩");
    }

}
