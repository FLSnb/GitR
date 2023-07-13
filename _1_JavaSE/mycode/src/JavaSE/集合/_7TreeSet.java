package JavaSE.集合;

import java.util.Comparator;
import java.util.TreeSet;

public class _7TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);ts.add(3);ts.add(22);ts.add(4);ts.add(5);ts.add(11);
        System.out.println(ts.size()+","+ts);

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("a");ts2.add("c");ts2.add("b");
        System.out.println(ts2.size()+","+ts2);

        //自定义类型，参考_6比较器，可以用内部比较器，也可以用外部比较器
        Comparator<Student2> com = new WaiBuBiJiaoQi2();
        TreeSet<Student2> ts3 = new TreeSet<>(com);//使用外部比较器时，需手动指定
        ts3.add(new Student2(20,"FLS"));
        ts3.add(new Student2(20,"CYS"));
        System.out.println(ts3.size()+","+ts3);
    }
}
class Student2{
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
    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class WaiBuBiJiaoQi2 implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.getAge() - o2.getAge()==0){
            return o1.getName().compareTo(o2.getName());
        }
        else{return o1.getAge() - o2.getAge();}
    }
}