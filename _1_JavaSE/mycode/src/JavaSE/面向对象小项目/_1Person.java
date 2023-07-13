package JavaSE.面向对象小项目;

import java.io.Serializable;

//被后面代码所用，所以加入了不少代码
public class _1Person implements Comparable<_1Person>, Serializable {
    //加入序列号
    private static final long serialVersionUID = 12345678L;
    //名词---》属性
    int age;
    String name;
    private int id;
    public String like;

    public _1Person() {
    }
    public _1Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "_1Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //动词---》方法
    public void eat(){
        System.out.println("我在吃饭");
    }
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }
    public String introduce(){
        return "我的名字是："+name+",我的年龄是："+age;
    }

    @Override
    public int compareTo(_1Person o) {
        //按照年龄比较
        return this.age - o.age;
    }
}
