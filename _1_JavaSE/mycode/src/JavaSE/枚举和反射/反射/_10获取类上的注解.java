package JavaSE.枚举和反射.反射;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

public class _10获取类上的注解 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass1 = Class.forName("org.junit.After");
        Class aClass2 = Class.forName("java.lang.String");

        //获取类上的标记的所有注解
        System.out.println(aClass1.getName());
        Annotation[] annotations = aClass1.getAnnotations();//不仅适用于Class类,也适用Method方法.getAnnotations()
        for(Annotation a : annotations){
            System.out.println(a);
            System.out.println(a.annotationType());
        }
        System.out.println("........................");


        //判断类上是否包含某个注解
        System.out.println(aClass1.isAnnotationPresent(Target.class));//类上是否有指定的注解
        System.out.println(aClass1.isAnnotation());//类上是否有注解
        Target target = (Target)aClass1.getAnnotation(Target.class);
        System.out.println(target);
        System.out.println("........................");


        System.out.println(aClass2.isAnnotationPresent(Target.class));//类上是否有指定的注解
        System.out.println(aClass2.isAnnotation());//类上是否有注解

    }
}
