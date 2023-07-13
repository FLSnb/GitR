package JavaSE.线程._15线程通信案例_同步方法;

public class Product {
    private String brand1;
    private String name1;
    public String getBrand1() {
        return brand1;
    }
    public void setBrand1(String brand1) {
        this.brand1 = brand1;
    }
    public String getName1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }

    //同步方法
    //注：为了保证生产者线程和消费者线程锁住的是同一把锁，则需把锁(同步方法)放在共享商品Product类中
    public synchronized void a(String brand1,String name1){
        this.setBrand1(brand1);
        this.setName1(name1);
        System.out.println("生产者生产的是："+this.getBrand1()+this.getName1());
    }

    public synchronized void b(){
        System.out.println("消费者消费了："+this.getBrand1()+this.getName1());
    }
}
