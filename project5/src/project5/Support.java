package project5;

public class Support extends Hero
{
	
	public void heal()
	{
		System.out.println(name + "������һ�μ�Ѫ,����֪���Ӹ���˭");
	}
	public void heal(Hero h)
	{
		h.hp += 100;
		System.out.println(name + "��" + h.name + "����100Ѫ:");
	}
	public void heal(Hero h,int hp)
	{
		h.hp += hp;
		System.out.println(name + "��" + h.name + "����" + hp + "��Ѫ:" );
		
	}
}
