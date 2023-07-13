package JavaSE.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List和ArrayList
public class _2java_util_List接口 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);list.add(2);list.add(3);list.add("abc");list.add(1);
        System.out.println(list);
        list.add(2,6);//在下标2的位置插入6
        System.out.println(list);
        list.set(2,7);//将下标2的值改为7
        System.out.println(list);

        list.remove(2);//index删除下标2的值
        System.out.println(list);
        list.remove("abc");//Object删除"abc"
        System.out.println(list);
        Object o=list.get(0);//获取下标0的值
        System.out.println(o);

        //遍历方法1
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println("");

        //遍历方法2
        for(Object obj:list){
            System.out.print(obj+",");
        }
        System.out.println("");

        //遍历方法3
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
    }
}
