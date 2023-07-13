package JavaSE.枚举和反射.反射;

import java.lang.reflect.Constructor;

public class _8反射机制调用构造方法 {
    public static void main(String[] args) throws Exception{
        //使用反射机制通过构造方法创建对象
        Class c = Class.forName("JavaSE.面向对象小项目._1Person");
        Object obj = c.newInstance();//调用无参数构造方法
        System.out.println(obj);

        //调用有参数的构造方法怎么办？
        //第一步：先获取到这个有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class, String.class);//根据传入参数类型锁定构造方法
        //第二步：调用构造方法new对象
        Object newObj = con.newInstance(20,"FLS");
        System.out.println(newObj);

        //获取无参数构造方法
        Constructor con2 = c.getDeclaredConstructor();//传入参数为空
        Object newObj2 = con2.newInstance();
        System.out.println(newObj2);

    }
}
