package JavaSE.线程._15线程通信案例_同步代码块;

public class ProducerThread extends Thread{
    private Product p;//共享商品为Product引用数据类型
    public ProducerThread(Product p){//构造方法
        this.p = p;
    }

    @Override
    public void run() {
        for(int i=1;i<=200;i++){
            synchronized (p){//p引用地址唯一
                if(i%2==0){
                    p.setBrand1("幸运");p.setName1("方便面");
                }
                else{
                    p.setBrand1("康师傅");p.setName1("红烧牛肉面");
                }
                System.out.println("生产者生产的是："+p.getBrand1()+p.getName1());
            }
        }
    }
}
