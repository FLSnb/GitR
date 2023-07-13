package JavaSE.集合;

import java.util.*;

public class _8Map接口和HashMap实现类 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();

        //添加
        map.put("CYS",20);map.put("LiLi",19);map.put("NaNa",19);map.put(null,20);
        //两key值相同，则后输入的新value会代替旧value值
        map.put("FLS",20);map.put("FLS",18);//Key不可重复，value可重复
        System.out.println(map.size()+","+map);

        //删除
        map.remove("NaNa");
        System.out.println(map.size()+","+map);

        //查看
        System.out.println(map.containsKey("FLS"));
        System.out.println(map.containsValue(19));
        System.out.println(map.isEmpty());
        System.out.println(map.get("FLS"));

        System.out.println(map.keySet());  //遍历所有key值
        Set<String> set = map.keySet();    //keySet方法返回值类型为Set<K>
        for(String s:set){
            System.out.print(s+",");
        }
        System.out.println("....................................");

        System.out.println(map.values());  //遍历所有value值
        Collection<Integer> values = map.values();//values方法返回值类型为Collection<V>
        for(Integer i:values){
            System.out.print(i+",");
        }
        System.out.println("....................................");

        System.out.println(map.entrySet());//同时遍历key和value的值
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> e :entries){
            System.out.print(e.getKey()+"-"+e.getValue()+"   ");
        }
        System.out.println("....................................");

        Map<String,Integer> map2 = new HashMap();
        map2.put("CYS",20);map2.put("FLS",18);map2.put("LiLi",19);
        System.out.println(map.equals(map2)); //比较值
        System.out.println(map==map2);        //比较集合


        //为了解决HashMap中输出顺序与输入顺序不一致的问题，引入LinkedHashMap
        Map<String,Integer> map3 = new LinkedHashMap();
        map3.put("CYS",20);map3.put("LiLi",19);map3.put("NaNa",19);
        map3.put("FLS",20);map3.put("FLS",18);
        System.out.println(map3.size()+","+map3);
    }
}
