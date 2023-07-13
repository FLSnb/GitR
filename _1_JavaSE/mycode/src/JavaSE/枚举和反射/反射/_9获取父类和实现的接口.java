package JavaSE.枚举和反射.反射;

public class _9获取父类和实现的接口 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class SC = Class.forName("java.lang.String");

        //获取父类
        Class superclass = SC.getSuperclass();
        System.out.println(superclass.getName());

        System.out.println("............");

        //获取实现的接口
        Class[] interfaces = SC.getInterfaces();
        for(Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
