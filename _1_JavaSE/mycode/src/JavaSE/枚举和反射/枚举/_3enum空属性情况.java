package JavaSE.枚举和反射.枚举;

public enum _3enum空属性情况 implements _3辅助接口 {
    //enum枚举类要求被public static final修饰的对象必须放在最开始的位置
    Spring{
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    Summer{
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    Autumn{
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    Winter{
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };
}
