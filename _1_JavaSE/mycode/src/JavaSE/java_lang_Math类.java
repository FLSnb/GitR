package JavaSE;

//若加入此句，则“Math.”可省略
//import static java.lang.Math.*;

public class java_lang_Math类 {
    public static void main(String[] args) {
        System.out.println(Math.PI);//π
        System.out.println("生成0～1的随机数，"+Math.random());
        System.out.println("取绝对值，"+Math.abs(-6));//6
        System.out.println("向上取整，"+Math.ceil(9.2));//10
        System.out.println("向下取整，"+Math.floor(9.2));//9
        System.out.println("四舍五入，"+Math.round(9.5));//10
        System.out.println("取两者大，"+Math.max(9,2));//9
        System.out.println("取两者小，"+Math.min(9,2));//2
    }
}
