package JavaSE.Junit测试.注解;

@MyAnnotation(value = {"abc","123"},value2=6)
@MyAnnotation2//注解可以作用：类

public class 使用MyAnnotation {
    @MyAnnotation2//注解可以作用：成员变量
    String name;

    @MyAnnotation2//注解可以作用：方法
    public void a(){
    }
}
