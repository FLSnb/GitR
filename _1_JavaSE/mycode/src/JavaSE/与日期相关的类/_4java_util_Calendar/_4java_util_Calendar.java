package JavaSE.与日期相关的类._4java_util_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _4java_util_Calendar {
    public static void main(String[] args) {
        //Calendar是一个抽象类，无法创建对象
        //间接创建Calendar对象的两种方法
        Calendar cal1 = new GregorianCalendar();//多态，左父右子
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal1);
        System.out.println(cal2);

        //常用的Calendar方法
        //1、get类方法(获取)
        System.out.println(cal1.get(Calendar.YEAR));//年2023
        System.out.println(cal1.get(Calendar.MONTH));//月，从0开始，2月表示为1
        System.out.println(cal1.get(Calendar.DATE));//日
        System.out.println(cal1.getActualMaximum(Calendar.DATE));//该月的最大天数，28


        //2、set类方法(设置)
        cal1.set(Calendar.YEAR,2020);//直接将Calendar对象的值给改了
        System.out.println(cal1.get(Calendar.YEAR));
        //将字符串String类型转换为Calendar类型
           //首先用java.sql.Date中方法valueOf将字符串String类型转换为java.sql.Date类型
        java.sql.Date date = java.sql.Date.valueOf("2000-01-10");
           //再用Calendar中的set方法将Date转化为Calendar
        cal1.setTime(date);//将cal1的时间改为Date传入的时间
        System.out.println(cal1);

    }
}
