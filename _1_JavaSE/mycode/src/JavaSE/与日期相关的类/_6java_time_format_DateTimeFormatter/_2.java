package JavaSE.与日期相关的类._6java_time_format_DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class _2 {
    public static void main(String[] args) {
        //用ofPattern方法提供自己定义的格式样版
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String str = df.format(now);
        System.out.println(str);

        //String-->LocalDateTime
        //按照自己定义的格式样版，传入parse方法中
        TemporalAccessor a = df.parse("2023-02-02 12:11:16");
        System.out.println(a);
    }
}
