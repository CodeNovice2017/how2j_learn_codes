package project2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World");
	Hero garen = new Hero();
	garen.name = "盖伦";
	garen.hp = 616.28f;
	garen.armor = 27.536f;
	garen.movespeed = 350;
	
	garen.getArmor();
	garen.keng();
	garen.addSpeed(50);
	
	Item blood = new Item();
	blood.name = "血瓶";
	blood.price = 50;
	
	int i = 5;
	String b = (Integer.toBinaryString(i));
	System.out.println(i+"的二进制表示是"+b);
	int j = -10;
	System.out.println(Integer.toBinaryString(j));
	i = j>>1; //带符号右移
	System.out.println(Integer.toBinaryString(i));
	
	//Scanner s = new Scanner(System.in);
	//int a = s.nextInt();
	//int c = s.nextInt();
	//System.out.println(a+" "+c);
	//BMI计算
	System.out.println("BMI程序运行:");
	Scanner you = new Scanner(System.in);
	System.out.println("请输入身高(m):");
	float length = you.nextFloat();
	System.out.println("请输入体重(kg):");
	float weight = you.nextFloat();
	float bmi = weight/(length*length);
	System.out.println("bmi "+bmi);
	int money = 1;
	for(int z = 1;z<=10;z++)
	{
		System.out.println("乞丐要"+money+"在第"+z+"天");
		money *= 2;
	}
	for(i=1;i<=100;i++)
	{
		if(i%3 == 0||i%5 == 0)
		{
			continue;
		}
		System.out.println(i);
	
	}
	}
}
