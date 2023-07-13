package JavaSE.与日期相关的类;

import java.sql.Date;

public class _2java_sql_Date {
    public static void main(String[] args) {
        //没有无参构造方法，形参中L表示long类型
        Date a = new Date(1675243270574L);
        System.out.println(a);//由形参推出所指年、月、日

        java.util.Date aa = new java.util.Date();
        System.out.println(aa);

        java.util.Date bb = new java.sql.Date(aa.getTime());//多态(左父右子)
        System.out.println(bb);
        java.sql.Date b = (java.sql.Date)bb;  //向下转型成功
        System.out.println(b);

        //java.sql.Date中方法valueOf将字符串String类型转换为java.sql.Date类型
        Date c = Date.valueOf("2023-2-1");
        System.out.println(c);
    }
}
