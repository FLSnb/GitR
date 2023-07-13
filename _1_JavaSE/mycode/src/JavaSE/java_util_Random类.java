package JavaSE;

import java.util.Random;

public class java_util_Random类 {
    public static void main(String[] args) {
        //若Random使用带值的构造方法，则每次得到的随机数是固定的
        Random r1 = new Random(5);
        int a1 = r1.nextInt();
        System.out.println(a1);
        //使用空参的构造方法
        Random r2 = new Random();
        //左闭右开，表示取[0,101)的整数，即0～100
        int a2 = r2.nextInt(101);
        //左闭右开，表示取[60,101)的整数，即60～100
        int a3 = r2.nextInt(100-60+1)+60;
        System.out.println(a2+"  ,  "+a3);

        //生成0～1的随机数的两种方法
        System.out.println("Math类中的:"+Math.random());
        System.out.println("Random类中的:"+r2.nextDouble());
    }
}
