package JavaSE.集合._3泛型;

import java.util.*;

public class _2通配符 {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        list1.add("1");list1.add(2);
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("123");list2.add("haha");
        System.out.println(list2);

        List<?> list = null;
        list = list1;
        System.out.println(list);
        list = list2;
        System.out.println(list);

        //调用方法a
        _2通配符 one = new _2通配符();
        one.a(new ArrayList<Integer>());
        one.a(new ArrayList<String>());
    }

    public void a (List<?> list){}

    public void b (List<?> list){
        //遍历时用Object接收，而不用<?>接收
        for(Object a :list){
            System.out.println(a);
        }
        //一般形参含<?>的方法,不能随意的进行添加数据,防止类型出错
        list.add(null);//只有null可以
        //读取时一般用Object类型接收
        Object s = list.get(0);
    }
}
