package project5;

public class ADHero extends Hero
{
	public void attack()
	{
		System.out.println(name + "������һ�ι���,����ȷ��������˭");
	}
	public void attack(Hero h1)
	{
		System.out.println(name + "��" + h1.name + "������һ�ι���");
	}
	public void attack(Hero... heros)
	{
		for(int i = 0; i< heros.length; i++)
		{
			System.out.println(name + "������" + heros[i].name);
		}
	}
	public void attack(Hero h1,Hero h2)
	{
		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹���");
	}
}
