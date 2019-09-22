package project3;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;++j)
			{
				System.out.println(i+":"+j);
				if(j%2==0)
					break; //break 会结束这层循环,所以每次j的值都不会增加,++j也不会
			}
		}
	}

}
