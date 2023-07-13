package JavaSE.枚举和反射.枚举;

public enum _2enum关键字枚举类 {//class需改为enum！！！
    //enum枚举类要求被public static final修饰的对象必须放在最开始的位置
    Spring("春","春暖花开"),//逗号
    Summer("夏","烈日炎炎"),//逗号
    Autumn("秋","硕果累累"),//逗号
    Winter("冬","冰天雪地");//最后一个对象用分号

    private final String seasonName;
    private final String seasonDesc;

    private _2enum关键字枚举类(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供外界访问属性值，因为是私有常量，则不需要set方法
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }
}
