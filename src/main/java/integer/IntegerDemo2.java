package integer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 包装类常见的功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //获取最大值,最小值
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);

        double dmax = Double.MAX_VALUE;
        System.out.println(dmax);
        double dmin = Double.MIN_VALUE;
        System.out.println(dmin);
        /*
            包装了提供了一个静态方法parseXXX(String line)
            可以将字符串解析为对应的基本数据类型。但是前提是该字符串
            正确描述了基本数据类型可以保存的值，否则会抛出异常：
            java.lang.NumberFormatException
         */
        String line = "123";
        //String line = "123.123"; //这个字符串就不能转换为int值！
        int in = Integer.parseInt(line);
        System.out.println(in);
        double dou = Double.parseDouble(line);
        System.out.println(dou);
    }
}
