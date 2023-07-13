package JavaSE.面向对象小项目;
//子类 培根披萨
public class _2BaconPizza extends _1Pizza{
    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //构造方法
    public _2BaconPizza() {}
    public _2BaconPizza(String name, int size, double price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    //重写showPizza方法，加入培根克数
    public String showPizza() {
        return "披萨的名字：" + getName() + "，披萨的大小：" + getSize() + "，披萨的价格为：" + getPrice() + "，加入克数为：" + weight;
    }
}
