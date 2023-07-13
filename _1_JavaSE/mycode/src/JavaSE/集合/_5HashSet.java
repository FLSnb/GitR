package JavaSE.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import JavaSE.面向对象小项目._1Person;

public class _5HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("1");hs.add("3");hs.add("2");hs.add("1");//不可重复放入相同数据
        System.out.println(hs.size()+","+hs);

        HashSet<Integer> ts = new HashSet<>();
        ts.add(11);ts.add(3);ts.add(22);ts.add(4);ts.add(5);ts.add(11);
        System.out.println(ts.size()+","+ts);

        HashSet<_1Person> hs2 = new HashSet<>();
        hs2.add(new _1Person(20,"FLS"));
        hs2.add(new _1Person(20,"FLS"));
        hs2.add(new _1Person(20,"CYS"));
        System.out.println(hs2.size()+","+hs2);


        //增强for循环遍历
        for (String element : hs) {
            System.out.print(element+" ");
        }
        System.out.println();

        //迭代器遍历
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element+" ");
        }
        System.out.println();

        //为了解决HashSet中输出顺序与输入顺序不一致的问题，引入LinkedHashSet
        LinkedHashSet<String> hs3 = new LinkedHashSet<>();
        hs3.add("2");hs3.add("1");hs3.add("1");hs3.add("3");
        System.out.println(hs3.size()+","+hs3);
    }
}
