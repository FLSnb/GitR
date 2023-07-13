package JavaSE.枚举和反射.反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class _5获取Field成员变量 {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("JavaSE.面向对象小项目._1Person");

        String className = studentClass.getName();
        System.out.println("完整类名：" + className);

        String simpleName = studentClass.getSimpleName();
        System.out.println("简类名：" + simpleName);

        //仅获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);// 0个

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);// 3个
        //遍历所有的Field
        for (Field field : fs) {
            // 获取成员变量的修饰符列表
            int i = field.getModifiers(); // 返回的修饰符是一个数字, 每个数字是修饰符的代号
            System.out.print("修饰符代号:" + i + " = ");
            String modifierString = Modifier.toString(i);// 将修饰符代号的样式-->修饰符的样式
            System.out.print(modifierString);

            // 获取成员变量的类型
            Class fieldType = field.getType();
            String Name = fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.print(" , 类型全名:"+Name+" , 类型简名:"+fName);

            // 获取成员变量的名字
            String name = field.getName();
            System.out.print(" , 成员变量为"+name);

            //反编译(倒退源代码)
            System.out.println();
            System.out.println("成员变量的定义代码为:"+modifierString+" "+fName+" "+name+";");
            System.out.println();

        }
    }
}
