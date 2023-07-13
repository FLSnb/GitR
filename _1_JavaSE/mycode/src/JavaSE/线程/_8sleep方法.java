package JavaSE.线程;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _8sleep方法 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(3000);//让线程进入阻塞状态3000毫秒(3秒)
        System.out.println(".................................");

        DateFormat df = new SimpleDateFormat("HH:mm:ss");//定义时间格式
        for(int i=1;i<=5;i++){
            Date d = new Date();//获取当前时间
            System.out.println(df.format(d));
            Thread.sleep(3000);//间隔3s输出一下时间
        }
    }
}
