import java.util.Scanner;
public class TestNumber {
    public static void main(String[] args)
    {
        //装箱拆箱
        byte b1 = 1;
        Byte by1 = new Byte(b1); //基本类型转类类型
        byte b2 = by1.byteValue();
        Byte by2 = b1;//不调用构造方法,基本类型转换为封装类型,装箱
        byte b3 = by1;//不调用构造方法,封装类型转换为基本类型,拆箱
        System.out.println(by2 instanceof Number);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        byte b4 = 4;

        //字符串转换
        int i = 5;
        String str1 = String.valueOf(i);
        Integer int1 = i;
        String str2 = int1.toString();

        String str3 = "999";
        int i1 = Integer.parseInt(str3);
        System.out.println(i1);

        double f1 = 3.14;
        String str4 = String.valueOf(f1);
        Double dou1 = f1;
        String str5 = dou1.toString();

        String str6 = "888";
        double dou2 = Double.parseDouble(str6);
        System.out.println(dou2);

        double result1 = Math.E;

        //找质数
        int test1;
        int n2 = 0;
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int x2 = 2;x2<Math.sqrt(x);x2++)
            {
                if(x%x2 == 0)
                {
                    n2 += 1;
                    System.out.println(x);
                    break;
                }
            }
        }
        int result2 = n-n2;
        System.out.println(result2);
    }
}
