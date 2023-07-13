package JavaSE.与日期相关的类;

import java.util.Date;

public class _1java_util_Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);//省略了d.toString()
        System.out.println(d.toLocaleString());//显示看着最舒服的时间

        System.out.println(d.getTime());//自1970年1月1日以来，经历的毫秒数
        System.out.println(System.currentTimeMillis());//自1970年1月1日以来，经历的毫秒数
        /*  上面两种情况下,一般使用下面这种方式,因为下面方式可以不用额外导包
            可用于计时作用，可以吧该方法放在两个地方，求时间差以作计时功能 */
    }
}
