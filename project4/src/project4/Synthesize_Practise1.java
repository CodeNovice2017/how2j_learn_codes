package project4;

import java.util.Scanner;

public class Synthesize_Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ƽ�ָ��
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
		//ˮ�ɻ���
		int i,j;
		int a,b,c;
		for(int k = 100;k<1000;k++)
		{
			a = k/100;
			b = k/10%10;
			c = k%10;
			if(a*a*a+b*b*b+c*c*c == k)
			{
				System.out.println(k);
			}
		}
	}	
}