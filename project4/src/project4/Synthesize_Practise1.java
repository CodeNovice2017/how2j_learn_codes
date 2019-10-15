package project4;

import java.util.Scanner;
import java.util.Arrays;


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
//		int[] a;
//		int temp;
//		int min;
//		a = new int[5];
//		for(int i = 0;i<5;i++)
//		{
//			a[i] = (int)(Math.random() * 100); 
//		}
//		for(int j = 0;j<5;j++)
//		{
//			min = a[j];
//			for(int k = j;k<4;k++)
//			{
//				if(a[k+1]<min)
//				{
//					temp = min;
//					min = a[k+1];
//					a[k+1] = temp;
//				}
//			}
//			a[j] = min;
//		}
//		for(int i = 0;i<5;i++)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println("数组排序完成!\n");
//		//数组反转
//		int[] b = new int[5];
//		for(int i = 0;i<5;i++)
//		{
//			b[i] = (int)(Math.random()*100);
//		}
//		for(int i = 0;i<5;i++)
//		{
//			System.out.println(b[i]);
//		}
//		System.out.println("翻转后的数组为:\n");
//		for(int j = 0,k = b.length-1;k>0&&j<b.length;j++,k--)
//		{
//				if(k!=j)
//				{
//					temp = b[j];
//					b[j] = b[k];
//					b[k] = temp;
//				}
//		}
//		for(int i = 0;i<5;i++)
//		{
//			System.out.println(b[i]);
//		}
//		//数组选择排序
//		Scanner s = new Scanner(System.in);
//		System.out.println("请输入一个待排序数组大小:\n");
//		int arraylength = s.nextInt();
//		int[] a1 = new int[arraylength];
//		for(int i = 0;i<arraylength;i++)
//		{
//			a1[i] = (int)(Math.random()*100);
//		}
//		for(int j = 0;j<arraylength;j++)
//		{
//			min = a1[j];
//			for(int k = j;k<arraylength;k++)
//			{
//				if(a1[k]<min)
//				{
//					temp = min;
//					min = a1[k];
//					a1[k] = temp;
//				}
//			}
//		}
//		for(int i = 0;i<arraylength;i++)
//		{
//			System.out.println(a1[i]);
//		}
//		System.out.println("选择排序后的数组为:\n");
		//冒泡排序
//		int temp;
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] a = new int[n];
//		for(int i = 0;i<a.length;i++)
//		{
//			a[i] = (int)(Math.random()*100);
//		}
//		for(int j = a.length;j>0;j--)
//		{
//			for(int i = 1;i<j;i++)
//			{
//				if(a[i-1]>a[i])
//				{
//					temp = a[i];
//					a[i] = a[i-1];
//					a[i-1] = temp;
//				}
//			}
//		}
//		for(int k = 0;k<a.length;k++)
//		{
//			System.out.println(a[k]);
//		}
		//合并数组
//		int[][] a1 = new int[5][5];
//		for(int i = 0;i<5;i++)
//		{
//			for(int j = 0;j<5;j++)
//			{
//				a1[i][j] = (int)(Math.random()*100);
//			}
//		}
//		int min = a1[0][0];
//		int k=0,p=0;
//		for(int i = 0;i<5;i++)
//		{
//			for(int j = 0;j<5;j++)
//			{
//				if(a1[i][j] < min)
//				{
//					min = a1[i][j];
//					k = i;
//					p = j;
//				}
//			}
//		}
//		System.out.println(min+" "+k+" "+p);
//	int a[] = new int[] {18,62,68,82,65,9};
//	int b[] = Arrays.copyOfRange(a,0,3);
//	for(int i = 0;i<b.length;i++)
//	{
//		System.out.println(a[i]);
//	}
//	String content = Arrays.toString(a);
//	System.out.println(content);
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
//	System.out.println(Arrays.binarySearch(a,62));
//	System.out.println(Arrays.equals(a,b));
//	int a2[] = new int[10];
//	Arrays.fill(a2,5);
//	System.out.println(Arrays.toString(a2));
	
	//Practise
	int b2[][] = new int[5][8];
	for(int i = 0;i<5;i++)
	{
		for(int j = 0;j<8;j++)
		{
			b2[i][j] = (int)(Math.random()*100);
		}
	}
	String contentb2 = Arrays.toString(b2);
	System.out.println("未排序前:"+contentb2);
	for(int z = 0;z<5;z++)
	{
		Arrays.sort(b2[z]);
	}
	contentb2 = Arrays.toString(b2);
	System.out.println("已排序后:"+contentb2);
	}
}
