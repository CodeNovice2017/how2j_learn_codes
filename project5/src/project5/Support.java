package project5;

public class Support extends Hero
{
	
	public void heal()
	{
		System.out.println(name + "进行了一次加血,但不知道加给了谁");
	}
	public void heal(Hero h)
	{
		h.hp += 100;
		System.out.println(name + "对" + h.name + "加了100血:");
	}
	public void heal(Hero h,int hp)
	{
		h.hp += hp;
		System.out.println(name + "对" + h.name + "加了" + hp + "滴血:" );
		
	}
}
