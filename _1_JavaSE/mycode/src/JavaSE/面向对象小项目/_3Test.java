package JavaSE.面向对象小项目;

import java.util.Scanner;

public class _3Test {
    public static void main(String[] args) {
        //选择购买哪种披萨
        Scanner tool = new Scanner(System.in);
        System.out.print("请选择购买哪种披萨： 水果披萨 或 培根披萨 ：");
        String choice = tool.next();
        switch(choice){
            case "水果披萨":{
                System.out.print("请输入配料所含水果 ：");
                String  burdening = tool.next();
                System.out.print("请输入披萨的大小 ：");
                int size = tool.nextInt();
                System.out.print("请输入披萨的价格 ：");
                double prize = tool.nextDouble();
                //将录入的信息封装为水果披萨对象的属性
                _2FruitsPizza one = new _2FruitsPizza("水果披萨",size,prize,burdening);
                System.out.println(one.showPizza());
            }break;
            case "培根披萨":{
                System.out.print("请输入培根所含克数 ：");
                int weight = tool.nextInt();
                System.out.print("请输入披萨的大小 ：");
                int size = tool.nextInt();
                System.out.print("请输入披萨的价格 ：");
                double prize = tool.nextDouble();
                //将录入的信息封装为培根披萨对象的属性
                _2BaconPizza two = new _2BaconPizza("培根披萨",size,prize,weight);
                System.out.println(two.showPizza());
            }break;
        }
    }
}
