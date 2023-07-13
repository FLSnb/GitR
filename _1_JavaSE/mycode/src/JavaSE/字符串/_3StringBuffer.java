package JavaSE.字符串;

//和_2StringBuilder里一模一样的使用
public class _3StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb =  new StringBuffer();
        StringBuffer sb2 = new StringBuffer(3);
        StringBuffer sb3 = new StringBuffer("abc");

        sb3.append("de").append("梦想");

        sb3.delete(3,6);
        sb3.deleteCharAt(0);

        sb3.replace(2,3,"de梦想");
        sb3.setCharAt(0,'a');

        for(int i=0;i<sb3.length();i++){
            System.out.print(sb3.charAt(i)+"\t");
        }
        System.out.println("\n"+sb3.substring(1,4));
    }
}
