package JavaSE.字符串;

public class _2StringBuilder {
    public static void main(String[] args) {
        //底层是对value数组进行初始化，长度为16
        StringBuilder sb = new StringBuilder();
        //底层是对value数组进行初始化，长度为3
        StringBuilder sb2 = new StringBuilder(3);

        //底层是对value数组进行初始化
        StringBuilder sb3 = new StringBuilder("abc");

        //1、增
        sb3.append("de").append("梦想");
        System.out.println(sb3);

        //2、删
        sb3.delete(3,6);//删除下标[3，6)上的字符
        System.out.println(sb3);
        sb3.deleteCharAt(0);//删除下标0上的字符
        System.out.println(sb3);

        //3、改
        sb3.replace(2,3,"de梦想");//将下标[2,3)上的字符替换为“de梦想”
        System.out.println(sb3);
        sb3.setCharAt(0,'a');//将下标0的字符改为‘a’
        System.out.println(sb3);

        //4、查
        for(int i=0;i<sb3.length();i++){//遍历全部字符串
            System.out.print(sb3.charAt(i)+"\t");
        }
        System.out.println("\n"+sb3.substring(1,4));//截取下标[1,4)上的字符
    }
}
