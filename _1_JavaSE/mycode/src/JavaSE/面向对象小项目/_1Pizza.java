package JavaSE.面向对象小项目;
//父类 披萨类
public class _1Pizza {
    private String name;
    private int size;
    private double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //方法：展示披萨信息
    public String showPizza(){
        return "披萨的名字："+name+"     披萨的大小："+size+"     披萨的价格为："+price;
        //同一个类中访问private修饰的可直接访问
    }

    //构造器
    public _1Pizza(){}
    public _1Pizza(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
