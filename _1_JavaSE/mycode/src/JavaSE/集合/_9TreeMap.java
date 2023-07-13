package JavaSE.集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _9TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("CYS", 20);map.put("LiLi",19);map.put("NaNa",19);
        map.put("FLS",20);map.put("FLS",18);
        System.out.println(map.size()+","+map);

        //当放入自定义的引用数据类型为key时，需将自定义的类中的比较器功能实现，否则无法排序
        Comparator<Student3> com = new WaiBuBiJiaoQi3();
        Map<Student3,Integer> map2 = new TreeMap<>(com);
        map2.put(new Student3(20,"FLS"),1);
        map2.put(new Student3(20,"CYS"),1);
        map2.put(new Student3(19,"LiLi"),2);
        map2.put(new Student3(22,"NaNa"),2);
        System.out.println(map2.size()+","+map2);
    }
}


class Student3{
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
    public Student3(int age, String name) {
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

class WaiBuBiJiaoQi3 implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        if(o1.getAge() - o2.getAge()==0){
            return o1.getName().compareTo(o2.getName());
        }
        else{return o1.getAge() - o2.getAge();}
    }
}
