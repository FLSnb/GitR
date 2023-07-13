package JavaSE.枚举和反射.反射;

import java.util.Date;

/**
 要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？
     第一种：Class c = Class.forName("完整类名带包名");
     第二种：Class c = 对象.getClass();
     第三种：Class c = 任何类型.class;
 */
public class _1获取Class的3种方式 {
    public static void main(String[] args) {
        Class c1 = null;
        Class c2 = null;
        try {
            //1、获取Class的第一种方式
            //Class.forName()是静态方法,方法的参数是一个字符串,字符串需要的是一个完整类名(带有包名)
            c1 = Class.forName("java.lang.String");        //代表String.class文件,等同代表String类型
            c2 = Class.forName("java.util.Date");          //代表Date类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //2、获取Class的第二种方式
        String s = "abc";
        Class x = s.getClass();       //代表String.class文件,等同代表String类型
        System.out.println(c1 == x);  //true

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y);  //true(c2和y两个变量中保存的内存地址都是一样,均指向方法区中的字节码文件)


        //3、获取Class的第三种方式
        Class z = String.class;      // z代表String类型
        Class k = Date.class;        // k代表Date类型
        System.out.println(x == z);  // true
    }
}
