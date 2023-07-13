package JavaSE.集合;

import java.util.*;

public class _1collection接口 {
    public static void main(String[] args) {
        Collection col = new ArrayList();//接口不可以创建对象，但可以左边接口，右边实现类

        //1、增加
        col.add(18);col.add("1");col.add(1.2);
        System.out.println(col);//省略.toString，是实现类中的
        List list = Arrays.asList(new Integer[]{1,2,3});//将Integer数组转化为集合
        //addAll是将一个集合添加到另一个集合
        col.addAll(list);//形参为Collection，传入的实参为子接口List
        System.out.println(col);

        //2、删除
        //col.clear();//清空
        System.out.println(col+" , "+col.size()+" , "+col.isEmpty());
        boolean isRemove = col.remove(1);//有一个字符串"1"和一个Integer类型的1,仅删除的是Integer类下的1,而字符串"1"仍在
        System.out.println(col+" , "+isRemove);

        Collection col2 = new ArrayList();
        col2.add(1);col2.add(2);col2.add(3);
        Collection col3 = new ArrayList();
        col3.add(1);col3.add(2);col3.add(3);
        System.out.println(col2.equals(col3));//判断值
        System.out.println(col2==col3);       //判断地址
        System.out.println(col2.contains(2)); //是否包含2

        //遍历Collection
        /*  col.无元素获取方法，不能按索引值获取
            ★Collection中无get方法，get()方法在list、Arraylist、LinkedList中存在  */

        //遍历方式1：增强for循环
        for(Object o:col){
            System.out.print(o+",");
        }

        System.out.println("");

        //遍历方式2：Iterator迭代器
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
    }
}
