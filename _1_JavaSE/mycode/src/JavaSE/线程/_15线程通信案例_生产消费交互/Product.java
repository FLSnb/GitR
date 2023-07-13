package JavaSE.线程._15线程通信案例_生产消费交互;

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

    boolean flag = false;

    public synchronized void a(String brand1,String name1) {
        if(flag==true){
            try {
                wait();//灯如果为红色，则证明有商品，生产者停止生产
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.setBrand1(brand1);
        this.setName1(name1);
        System.out.println("生产者生产的是："+this.getBrand1()+this.getName1());
        flag = true;
        notify();//提示消费者尽快消费
    }

    public synchronized void b() {
        if(flag==false){
            try {
                wait();//灯如果为绿色，则证明没有商品，消费者停止消费
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("消费者消费了："+this.getBrand1()+this.getName1());
        flag = false;
        notify();//提示生产者尽快生产
    }
}
