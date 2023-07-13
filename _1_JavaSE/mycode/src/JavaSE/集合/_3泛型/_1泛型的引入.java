package JavaSE.集合._3泛型;

import java.util.ArrayList;

public class _1泛型的引入 {
    public static void main(String[] args) {
        //集合中加入泛型的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不可以添加入这个集合。
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);a.add(2);a.add(3);  //a.add(5.2);a.add("FLS"); 则无法加入该集合

        //遍历
        for(Object obj:a){
            System.out.print(obj+",");
        }
        System.out.println();
        //加入泛型后遍历
        for(Integer i:a){
            System.out.print(i+",");
        }
    }
}
