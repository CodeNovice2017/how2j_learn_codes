package project4;

import java.util.Scanner;

public class Synthesize_Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//黄金分割点
//		double ans;
//		double temp = 1;
//		int k=0,p=0;
//		for(int i = 1;i<=20;i++){
//			for(int j = 1;j<=20;j++){
//				if(i%2==0&&j%2==0)
//				{
//					continue;
//				}
//				double a = (double)i;
//				double b = (double)j;
//				ans = a/b;
//				if(Math.abs(ans-0.618)<Math.abs(temp-0.618))
//				{
//					temp = ans;
//					k = i;
//					p = j;
//				}
//			}
//		}
//		System.out.println(k+""+p);
//	}
		//水仙花数
//		int i,j;
//		int a,b,c;
//		for(int k = 100;k<1000;k++)
//		{
//			a = k/100;
//			b = k/10%10;
//			c = k%10;
//			if(a*a*a+b*b*b+c*c*c == k)
//			{
//				System.out.println(k);
//			}
//		}
		//数组排序
		int[] a;
		int temp;
		int min;
		a = new int[5];
		for(int i = 0;i<5;i++)
		{
			a[i] = (int)(Math.random() * 100); 
		}
		for(int j = 0;j<5;j++)
		{
			min = a[j];
			for(int k = j;k<4;k++)
			{
				if(a[k+1]<min)
				{
					temp = min;
					min = a[k+1];
					a[k+1] = temp;
				}
			}
			a[j] = min;
		}
		for(int i = 0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("数组排序完成!\n");
		//数组反转
		int[] b = new int[5];
		for(int i = 0;i<5;i++)
		{
			b[i] = (int)(Math.random()*100);
		}
		for(int i = 0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("翻转后的数组为:\n");
		for(int j = 0,k = b.length-1;k>0&&j<b.length;j++,k--)
		{
				if(k!=j)
				{
					temp = b[j];
					b[j] = b[k];
					b[k] = temp;
				}
		}
		for(int i = 0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		//数组选择排序
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个待排序数组大小:\n");
		int arraylength = s.nextInt();
		int[] a1 = new int[arraylength];
		for(int i = 0;i<arraylength;i++)
		{
			a1[i] = (int)(Math.random()*100);
		}
		for(int j = 0;j<arraylength;j++)
		{
			min = a1[j];
			for(int k = j;k<arraylength;k++)
			{
				if(a1[k]<min)
				{
					temp = min;
					min = a1[k];
					a1[k] = temp;
				}
			}
		}
		for(int i = 0;i<arraylength;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("选择排序后的数组为:\n");
	}	
}
