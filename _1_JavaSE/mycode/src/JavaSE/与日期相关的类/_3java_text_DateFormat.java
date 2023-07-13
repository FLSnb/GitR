package JavaSE.与日期相关的类;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _3java_text_DateFormat {
    public static void main(String[] args) {
        //方法一：将字符串String类型转换为java.util.Date类型
          //首先用java.sql.Date中方法valueOf将字符串String类型转换为java.sql.Date类型
        java.sql.Date one = java.sql.Date.valueOf("2000-1-10");//有局限性，必须是以“年-月-日的形式”
          //然后用多态向上转型
        java.util.Date two = one;//多态，左父右子
        System.out.println(two);


        //方法二：引入java.text.DateFormat类
        /*public class SimpleDateFormat extends DateFormat
        ,DateFormat(父)是抽象类，无法创建对象，且是SimpleDateFormat(子)的父类*/
        DateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//多态，左父右子
                                            // 定义传入时间的格式yyyy-MM-dd HH:mm:ss
        try {//将字符串String类型通过parse方法转换为java.util.Date类型
            java.util.Date d = a.parse("2000-1-10 5:13:14");
            System.out.println(d);
        } catch (Exception e) {}

        //java.util.Date类型通过format方法转化为字符串String类型
        //调用DateFormat类中的方法format将当前时间转化为定义的时间格式(yyyy-MM-dd HH:mm:ss)
        String b = a.format(new Date());
        System.out.println(b);
    }
}
