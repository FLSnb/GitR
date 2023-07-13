package JavaSE.枚举和反射.反射;

import java.lang.reflect.Field;

//反射机制让代码变复杂, 但代码的灵活性和可扩展性增强
public class _6成员变量赋值 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("JavaSE.面向对象小项目._1Person");
        Object obj = studentClass.newInstance();

        //给public修饰的成员变量赋值
        Field likeFiled = studentClass.getDeclaredField("like");//获取成员变量like
        likeFiled.set(obj, "哈哈");//给obj对象的like属性赋值
        System.out.println(likeFiled.get(obj)); //读取obj对象的like属性的值


        //访问私有属性(非public修饰的)
        Field idField = studentClass.getDeclaredField("id");
        // 打破封装(反射机制的缺点: 容易打破封装,可能会给不法分子留下机会)
        idField.setAccessible(true);//设置完之后,在外部也可以访问private修饰的了
        idField.set(obj, 2);
        System.out.println(idField.get(obj));
    }
}
