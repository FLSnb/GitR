package JavaSE.面向对象小项目;

import java.util.Scanner;

//简单工厂模式，这里直接从工厂获取
public class _4Test {
    public static void main(String[] args) {
        //选择购买哪种披萨
        Scanner tool = new Scanner(System.in);
        System.out.print("请选择购买哪种披萨： 1、水果披萨 或 2、培根披萨 ：");
        int choice = tool.nextInt();
        //通过工厂获取披萨
        _1Pizza pizza = _4PizzaStore.getPizza(choice);//多态思想，左父右子，右边返回值为指向子类的地址
        System.out.println(pizza.showPizza());
    }
}
