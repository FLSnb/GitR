package JavaSE.集合;

import java.util.Iterator;
import java.util.LinkedList;

public class _4LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //1、添加
        list.add("1");list.add("2");list.add("1");
        System.out.println(list);
        list.addFirst("开始1");list.addLast("结尾1");
        list.offerFirst("开始2");list.offerLast("结尾2");
        System.out.println(list);

        //2、删除
        list.pollFirst();
        list.removeFirst();
        System.out.println(list);
        //等等方法，查API


        //遍历方法1
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println("");

        //遍历方法2
        for(String obj:list){
            System.out.print(obj+",");
        }
        System.out.println("");

        //遍历方法3
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.println("");

        //遍历方法4，相对3更节省空间
        for(Iterator<String> it2 = list.iterator();it2.hasNext();){
            System.out.print(it2.next()+",");
        }
        System.out.println("\n");

    }
}
