package JavaSE.枚举和反射.枚举;

public class _1_2_3_Test {
    public static void main(String[] args) {

        _1自定义枚举类 spring = _1自定义枚举类.Spring;//使用类名.的形式创建对象
        System.out.println(spring);
        _2enum关键字枚举类 winter = _2enum关键字枚举类.Winter;
        System.out.println(winter);
        //注：两者的默认toString方法不一样   getSuperclass()返回当前类的父类的class
        //spring对象是父类Object类中的toString()
        //winter对象是父类Enum类中的toString()

        System.out.println(_1自定义枚举类.class.getSuperclass());    //java.lang.Object
        System.out.println(spring.getSeasonDesc());
        System.out.println(spring.getSeasonName());

        System.out.println(_2enum关键字枚举类.class.getSuperclass());//java.lang.Enum
        System.out.println(winter.getSeasonDesc());
        System.out.println(winter.getSeasonName());
        System.out.println(".............................................................");


        //java.lang.Enum中方法
        System.out.println(winter);                                //1、toString()

        _2enum关键字枚举类[] values = _2enum关键字枚举类.values();  //2、values()返回枚举类对象的数组
        for(_2enum关键字枚举类 s:values){
            System.out.println(s);
        }

        //3、valueOf()返回具有指定名称的指定枚举类型的枚举常量,名字不正确时会报错
        _2enum关键字枚举类 autunm = _2enum关键字枚举类.valueOf("Autumn");
        System.out.println(autunm);
        System.out.println(".............................................................");


        _3enum空属性情况.Spring.show();
        _3enum空属性情况.Summer.show();

    }
}
