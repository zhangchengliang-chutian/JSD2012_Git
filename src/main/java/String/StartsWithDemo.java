package String;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * boolean startsWith(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        //判断str是否是以”www.“开始的
        String str = "www.tedu.cn";
        boolean starts = str.startsWith("www.");
        System.out.println("starts:"+starts);
        //判断str是否是以“.cn”结尾的
        boolean end = str.endsWith(".cn");
        System.out.println("end:"+end);
    }
}
