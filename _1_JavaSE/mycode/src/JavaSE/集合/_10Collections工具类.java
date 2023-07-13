package JavaSE.集合;

import java.util.ArrayList;
import java.util.Collections;

public class _10Collections工具类 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");list.add("b");list.add("c");
        Collections.addAll(list,"1","2","3");//利用工具类一次添加多个数据
        System.out.println(list);

        //二分查找，前提为：有序，不有序的话结果会出现负值情况
        System.out.println(Collections.binarySearch(list,"2"));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"2"));//2在有序数组下标1的位置

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"aa","bb","cc");
        Collections.copy(list,list2);//将list2的数据复制到list中
        System.out.println("list:"+list+"    list2:"+list2);

        //将list2中所有元素，替换为ha
        Collections.fill(list2,"ha");
        System.out.println(list2);
    }
}
