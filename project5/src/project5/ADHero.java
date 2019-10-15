package project5;

public class ADHero extends Hero
{
	public void attack()
	{
		System.out.println(name + "进行了一次攻击,但不确定打中了谁");
	}
	public void attack(Hero h1)
	{
		System.out.println(name + "对" + h1.name + "进行了一次攻击");
	}
	public void attack(Hero... heros)
	{
		for(int i = 0; i< heros.length; i++)
		{
			System.out.println(name + "攻击了" + heros[i].name);
		}
	}
	public void attack(Hero h1,Hero h2)
	{
		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击");
	}
}
