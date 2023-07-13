package JavaSE.面向对象小项目;
//子类 水果披萨
public class _2FruitsPizza extends _1Pizza{
    private String burdening;//配料
    public String getBurdening() {
        return burdening;
    }
    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //构造方法
    public _2FruitsPizza() {}
    public _2FruitsPizza(String name, int size, double price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    //重写showPizza方法，加入水果
    public String showPizza() {
        return "披萨的名字：" + getName() + "，披萨的大小：" + getSize() + "，披萨的价格为：" + getPrice() + "，加入的水果为：" + burdening;
    }
}
