package JavaSE.集合;

import JavaSE.面向对象小项目._1Person;
import java.util.Comparator;

public class _6比较器 {
    public static void main(String[] args) {
        //int类型比较方式为“作差比较”
        int a=10 ; int b=20;
        System.out.println(a-b);

        //String类型比较方法为“在String类中调用重写的Comparable接口中的抽象方法compareTo”
        String c="A" ; String d="B";
        System.out.println(c.compareTo(d));

        //double类型比较为“在Double类中调用重写的Comparable接口中的抽象方法compareTo”
        double e=9.6 ; double f=9.3;
        System.out.println(((Double) e).compareTo((Double) f));


        //自定义类型比较为“在自定义类中自行重写Comparable接口中的抽象方法compareTo”
        _1Person one = new _1Person(20,"FLS");
        _1Person two = new _1Person(18,"CYS");

        //内部比较器
        System.out.println(one.compareTo(two));//调用_1Person类中重写的compareTo方法
        System.out.println("..........................");

        //外部比较器,重写Comparator中的compare方法
        Comparator bj1 = new WaiBuBiJiaoQi();
        Student aaa = new Student(20,"FLS");
        Student bbb = new Student(18,"CYS");
        Student ccc = new Student(18,"HAHA");
        System.out.println(bj1.compare(aaa,bbb));
        System.out.println(bj1.compare(bbb,ccc));
    }
}

class Student{
    private int age;private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class WaiBuBiJiaoQi implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() - o2.getAge()==0){
            return o1.getName().compareTo(o2.getName());
        }
        else{return o1.getAge() - o2.getAge();}
    }
}