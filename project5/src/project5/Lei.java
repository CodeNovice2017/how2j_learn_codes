package project5;

public class Lei {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon infinityEdge = new Weapon();
		
		infinityEdge.damage = 65;
		infinityEdge.name = "�޾�֮��";
		infinityEdge.price = 3600;
		
		Armor clothArmor = new Armor();
		Armor hauberk = new Armor();
		
		hauberk.name = "���Ӽ�";
		hauberk.ac = 40;
		hauberk.price = 500;
		
		clothArmor.name = "����";
		clothArmor.price = 300;
		clothArmor.ac = 15;

		ADHero bh = new ADHero();
		bh.name = "�ͽ�����";

		Hero h1 = new Hero();
		h1.name = "����";
		h1.hp = 550;
		Hero h2 = new Hero();
		h2.name = "��Ī";
		
		bh.attack(h1);
		bh.attack(h1,h2);
		Support h3 = new Support();
		h3.name = "����֮��";
		h3.heal(h1,50);
		System.out.println(h1.name+h1.hp);
		
		//ֱ�Ӵ�ӡ�������ʾ�ö����������е������ַ
		System.out.println("�ö����������е������ַ��: "+h1);
		//��ӵ���showAddressInMemory,��ӡ�ö����this,��ʾ��ͬ�������ַ
		h1.showAddressInMemory();
	}

}