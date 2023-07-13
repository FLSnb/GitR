package JavaSE.与日期相关的类._6java_time_format_DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //创建LocalDateTime类的对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now+","+now.getClass());

        //通过DateTimeFormatter类中的方法format将LocalDateTime类型转化为String类型
        String str = formatter.format(now);
        System.out.println(str+","+str.getClass());

        //String-->LocalDateTime
        String strDateTime = "2023-05-18 10:30:50";
        LocalDateTime localDateTime = LocalDateTime.parse(strDateTime, formatter);
        System.out.println(localDateTime+","+localDateTime.getClass());
    }
}
