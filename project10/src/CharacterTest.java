import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args){
//        Scanner str = new Scanner(System.in);
//        String str1 = str.nextLine();
//        char[] a = str1.toCharArray();
//
//        for(int i = 0;i<a.length;i++)
//        {
//            if(Character.isUpperCase(a[i])||Character.isDigit(a[i]))
//            {
//                System.out.println(a[i]);
//            }
//        }
//        //字符串相关
//        String name = "陈新";
//        String name2 = new String("陈新");
//        char[] c1 = new char[]{'陈','新'};
//        String name3 = new String(c1);
//        //练习
//        char cs[] = new char[5];
//        short start = '0';
//        short end = 'z'+1;
//        for(int i = 0;i<cs.length;i++)
//        {
//            while(true)
//            {
//                char c = (char)((Math.random()*(end - start)) + start); //生成end-1到start之间的随机数
//                if(Character.isLetter(c)||Character.isDigit(c))
//                {
//                    cs[i] = c;
//                    break;
//                }
//            }
//        }
//        String result = new String(cs);
//        System.out.println(result);
//        String str2 = "概论";
//        str2 = "";
//        str2 += 'a';
//        str2 += 'b';
//        System.out.println(str2);
//
//        //方法2
//        String pool = "";
//        for(int i1 = '0';i1<='9';i1++)
//        {
//            pool+=(char)i1;
//        }
//        for(int i1 = 'a';i1<='z';i1++)
//        {
//            pool+=(char)i1;
//        }
//        for(int i1 = 'A';i1<'Z';i1++)
//        {
//            pool+=(char)i1;
//        }
//        char cs1[] = new char[5];
//        for(int i = 0;i<cs1.length;i++)
//        {
//            int i2 = (int)(Math.random()*pool.length());
//            cs1[i] = pool.charAt(i2);
//        }
//        String result2 = new String(cs1);
//        System.out.println(result2);

        //字符串数组排序
        String cs3[] = new String[8];
        for(int i = 0;i<cs3.length;i++)
        {
            cs3[i] = StringRandom();
        }
        for(int i = 0;i<cs3.length;i++) {
            System.out.println(cs3[i]);
        }
        System.out.println("排序后%n");
        for(int i = 0;i<cs3.length;i++)
        {
            String s = "";
            char temp1 = 0,temp2 = 0;
            for(int j = i+1;j<cs3.length;j++) {
                boolean condition = false;
                        if(!condition) {
                            if (Character.isUpperCase(cs3[i].charAt(0)) && Character.isUpperCase(cs3[j].charAt(0))) {
                                temp1 = (char) (cs3[i].charAt(0) + 32);
                                temp2 = (char) (cs3[j].charAt(0) + 32);
                                if (temp1 > temp2) {
                                    s = cs3[i];
                                    cs3[i] = cs3[j];
                                    cs3[j] = s;
                                    condition = true;

                                }
                            } else if (Character.isUpperCase(cs3[i].charAt(0)) && Character.isLowerCase(cs3[j].charAt(0))) {
                                temp1 = (char) (cs3[i].charAt(0) + 32);
                                if (temp1 > cs3[j].charAt(0)) {
                                    s = cs3[i];
                                    cs3[i] = cs3[j];
                                    cs3[j] = s;
                                    condition = true;
                                }
                            } else if (Character.isUpperCase(cs3[j].charAt(0)) && Character.isLowerCase(cs3[i].charAt(0))) {
                                temp1 = (char) (cs3[j].charAt(0) + 32);
                                if (temp1 < cs3[i].charAt(0)) {
                                    s = cs3[i];
                                    cs3[i] = cs3[j];
                                    cs3[j] = s;
                                    condition = true;
                                }
                            } else {
                                if (cs3[i].charAt(0) > cs3[j].charAt(0)) {
                                    s = cs3[i];
                                    cs3[i] = cs3[j];
                                    cs3[j] = s;
                                    condition = true;
                                }
                            }
                        }
                }
            }
        for(int i = 0;i<cs3.length;i++) {
            System.out.println(cs3[i]);
        }

    }
    public static String StringRandom()
    {
        int start = '0';
        int end = 'z'+1;
        String str;
        char cs[] = new char[5];
        char c;
        for(int i = 0;i<cs.length;i++) {
            while (true) {
                c = (char) (Math.random() * (end - start) + start);
                if (Character.isDigit(c) || Character.isLetter(c))
                {
                    cs[i] = c;
                    break;
                }
            }
        }
        str = new String(cs);
        return str;
    }

}

