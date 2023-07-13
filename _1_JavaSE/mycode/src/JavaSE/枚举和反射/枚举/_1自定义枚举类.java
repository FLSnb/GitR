package JavaSE.枚举和反射.枚举;

public class _1自定义枚举类 {
    //定义"私有private常量final"，不可更改，保证了用枚举的“有限性”
    private final String seasonName;
    private final String seasonDesc;

    /*常量用构造方法进行初始赋值★
      构造方法被private修饰，外界不能调用该构造器，则外界不能创建对象，保证了用枚举的“有限性”*/
    private _1自定义枚举类(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供枚举类有限的对象，static修饰可以让其他类中用“类名.”的方式进行访问，final修饰保证不变(“有限性”)
    public static final _1自定义枚举类 Spring = new _1自定义枚举类("春","春暖花开");
    public static final _1自定义枚举类 Summer = new _1自定义枚举类("夏","烈日炎炎");
    public static final _1自定义枚举类 Autumn = new _1自定义枚举类("秋","硕果累累");
    public static final _1自定义枚举类 Winter = new _1自定义枚举类("冬","冰天雪地");


    //提供外界访问属性值，因为是私有常量，则不需要set方法
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }

}
