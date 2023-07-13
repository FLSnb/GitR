package JavaSE.与日期相关的类;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class _5java_time_xxx {
    public static void main(String[] args) {
        //完成实例化(创建对象)
        //方法1：利用now()获取当前信息
        LocalDate a = LocalDate.now();//年-月-日
        System.out.println(a);
        LocalTime b = LocalTime.now();//时：分：秒.毫秒
        System.out.println(b);
        LocalDateTime c = LocalDateTime.now();//年-月-日 T 时：分：秒.毫秒
        System.out.println(c);

        //方法2：利用of方法，设置指定日期、时间
        LocalDate d = LocalDate.of(2023,2,1);
        System.out.println(d);
        LocalTime e = LocalTime.of(23,59);
        System.out.println(e);

        //get方法(获取)
        System.out.println(c.getYear());//2023
        System.out.println(c.getMonth());//february
        System.out.println(c.getMonthValue());//2
        System.out.println(c.getDayOfMonth());//1
        System.out.println(c.getDayOfWeek());//wednesday
        System.out.println(c.getHour());//23

        //with方法(设置、更改)，不再叫set方法
             //必须创建新的对象更改新的对象值，不再像Calendar可以用set方法直接把旧的对象直接改了
        LocalDateTime f = c.withMonth(12);//不可变性
        System.out.println(c+","+f);

    }
}
