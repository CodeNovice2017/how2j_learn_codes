package project2;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World");
	Hero garen = new Hero();
	garen.name = "����";
	garen.hp = 616.28f;
	garen.armor = 27.536f;
	garen.movespeed = 350;
	
	garen.getArmor();
	garen.keng();
	garen.addSpeed(50);
	
	Item blood = new Item();
	blood.name = "Ѫƿ";
	blood.price = 50;
	}

}
