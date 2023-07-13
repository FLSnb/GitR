package JavaSE.面向对象小项目;

import java.util.Scanner;

//简单工厂模式，这里的工厂负责生产
public class _4PizzaStore {
    public static _1Pizza getPizza(int choice) {
        Scanner tool = new Scanner(System.in);
        _1Pizza p = null;//先将对象地址赋为空
        switch(choice){
            case 1:{
                System.out.print("请输入配料所含水果 ：");
                String  burdening = tool.next();
                System.out.print("请输入披萨的大小 ：");
                int size = tool.nextInt();
                System.out.print("请输入披萨的价格 ：");
                double prize = tool.nextDouble();
                //将录入的信息封装为水果披萨对象的属性
                _2FruitsPizza one = new _2FruitsPizza("水果披萨",size,prize,burdening);
                p = one;
            }break;
            case 2:{
                System.out.print("请输入培根所含克数 ：");
                int weight = tool.nextInt();
                System.out.print("请输入披萨的大小 ：");
                int size = tool.nextInt();
                System.out.print("请输入披萨的价格 ：");
                double prize = tool.nextDouble();
                //将录入的信息封装为培根披萨对象的属性
                _2BaconPizza two = new _2BaconPizza("培根披萨",size,prize,weight);
                p = two;
            }break;
        }
        return p;
    }
}
