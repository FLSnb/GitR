package JavaSE.枚举和反射.反射;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class _7反射Method方法 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("JavaSE.面向对象小项目._1Person");
        Object obj = userServiceClass.newInstance();

        //获取所有的Method(包括私有的)
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);

        //遍历Method
        for(Method method : methods){
            //获取修饰符列表
            System.out.print("修饰符列表: "+Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.print(" , 返回值类型: "+method.getReturnType().getSimpleName());
            //获取方法名
            System.out.print(" , 方法名: "+method.getName());
            //获取方法的传入参数类型
            Class[] parameterTypes = method.getParameterTypes();
            System.out.print(" , 方法的传入参数类型: ");
            for(Class parameterType : parameterTypes){
                System.out.print(parameterType.getSimpleName()+" ");
            }
            System.out.println();
        }


        //调用Method
        Method loginMethod = userServiceClass.getDeclaredMethod("sleep", String.class);//调用sleep方法,传入参数类型为String
        //调用obj对象的loginMethod(sleep方法),传入参数"FLS",会执行该方法,然后方法的返回值由retValue接收
        Object retValue = loginMethod.invoke(obj, "学校");
        System.out.println("方法的返回值: "+retValue);
    }
}
