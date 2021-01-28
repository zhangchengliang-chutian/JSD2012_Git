package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有用户信息读取出来并输出到控制台
 */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(
                "user.dat", "r");
        for (int i = 0; i < raf.length() / 100; i++) {//raf.length表示该文件有多少字节，设计是一个人100个字节
            //读取用户名
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data, "UTF-8").trim();//   调用String的无参构造
            //读取密码
            raf.read(data);
            String password = new String(data, "UTF-8").trim();
            //读取昵称
            raf.read(data);
            String nickname = new String(data, "UTF-8").trim();
            //读取年龄
            int age = raf.readInt(); //年龄属于int值，规定四个字节，不用扩容
            System.out.println(username + "," + password + "," + nickname + "," + age);
        }
        raf.close();
    }
}
