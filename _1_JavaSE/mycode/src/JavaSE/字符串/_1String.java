package JavaSE.字符串;

import java.util.Arrays;

public class _1String {
    public static void main(String[] args) {
        String a = "abcCBA";//包装类的自动装箱

        //通过构造器创建String对象的方法
        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[]{'a','b','c'});
        //底层就是给value数组进行的赋值操作

        System.out.println(s2.length());      //本质是数组的长度
        System.out.println(s1.isEmpty());     //本质是判断数组是否为空

        System.out.println(s2.charAt(1));               //本质是返回数组下标为1的字符，数组下标从0开始
        System.out.println(a.substring(1)); //从下标1开始截取到最后，包括下标1的值
        System.out.println(a.substring(0,2));           //从下标0开始截取到下标2，包括0不包括2

        System.out.println(s3.equals(s2));    //判断两个字符串的值是否相等
        System.out.println(s3.compareTo(s2)); //判断两个字符串的值是否相等，返回值为int类型，为0时相等

        System.out.println(a.concat("FLS"));                  //将FLS拼接在字符串a之后
        System.out.println(a.replace('a','v')); //将字符串a中的字符a替换为字符v

        System.out.println(a.toUpperCase());                       //将字符串a中字符全部大写
        System.out.println(a.toLowerCase());                       //将字符串a中字符全部小写

        System.out.println("  a b c  ".trim());                    //去除首尾的空格

        System.out.println(String.valueOf(52.1314));            //将其它类型转化为String类型

        String s4 = "a-b-c-d-e";
        String[] s5 = s4.split("-");//数组接收返回值，split()中的形参为字符串而不是字符
        System.out.println(s5);
        System.out.println(Arrays.toString(s5));
    }
}
