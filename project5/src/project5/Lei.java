package project5;

public class Lei {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon infinityEdge = new Weapon();
		
		infinityEdge.damage = 65;
		infinityEdge.name = "无尽之刃";
		infinityEdge.price = 3600;
		
		Armor clothArmor = new Armor();
		Armor hauberk = new Armor();
		
		hauberk.name = "锁子甲";
		hauberk.ac = 40;
		hauberk.price = 500;
		
		clothArmor.name = "布甲";
		clothArmor.price = 300;
		clothArmor.ac = 15;

		ADHero bh = new ADHero();
		bh.name = "赏金猎人";

		Hero h1 = new Hero();
		h1.name = "盖伦";
		h1.hp = 550;
		Hero h2 = new Hero();
		h2.name = "提莫";
		
		bh.attack(h1);
		bh.attack(h1,h2);
		Support h3 = new Support();
		h3.name = "众星之子";
		h3.heal(h1,50);
		System.out.println(h1.name+h1.hp);
		
		//直接打印对象会显示该对象在主存中的虚拟地址
		System.out.println("该对象在主存中的虚拟地址是: "+h1);
		//间接调用showAddressInMemory,打印该对象的this,显示相同的虚拟地址
		h1.showAddressInMemory();
	}

}
