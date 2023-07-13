package JavaSE.与日期相关的类._4java_util_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //第一步、String--->Calendar
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入所需查看时间，例如格式：2000-01-10  请在此处输入-→  ");
        String strDate = sc.next();
        java.sql.Date date = java.sql.Date.valueOf(strDate);//String-->Date
        Calendar cal = Calendar.getInstance();//间接创建Calendar对象
        cal.setTime(date);//Date-->Calendar

        //第二步、打印表格第一行，日-->六
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //第三步、获取有关信息
        int maxDay = cal.getActualMaximum(Calendar.DATE);//获取该月的最大天数
        int nowDay = cal.get(Calendar.DATE);//获取当前的日数
        //难点★★★
        cal.set(Calendar.DATE,1);//将日期改为本月第1天
        int num = cal.get(Calendar.DAY_OF_WEEK);//获取本月第1天是一个星期的第几天(从周日开始)

        //第四步、从1号遍历到最大天数
        int count = 0;//计数器
        int day = num -1;//空出1号所指星期几的前面几天
        for(int j=1;j<=day;j++){
            count++;
            System.out.print("\t");//1号前面的几天空白输出
        }
        for(int i = 1; i<=maxDay; i++){
            count++;
            if(i==nowDay){
                System.out.print(i+"*"+"\t");
            }
            else{
                System.out.print(i+"\t");
            }
            if(count%7==0){
                System.out.println();//利用计数器，确保日历每行最多显示7天
            }
        }
    }
}
