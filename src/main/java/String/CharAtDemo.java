package String;

/**
 * char charAt(int index)
 * 获取指定位置上的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        //获取第五个字符(下标为4)
        char c = str.charAt(4);
        System.out.println(c);
        char b = str.charAt(5);
        System.out.println(b);
    }
}
