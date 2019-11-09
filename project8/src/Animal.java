public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println(this.legs+"条腿走路");
    }
    public static void main(String[] args) {

    }
}
