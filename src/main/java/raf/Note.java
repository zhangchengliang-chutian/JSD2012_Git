package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行字符串都写入到该文件中。(不用考虑换行问题)
 * 当用户单独输入"exit"时程序退出。
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String file = scan.nextLine();
        RandomAccessFile raf = new RandomAccessFile(
                "file","rw");
        System.out.println("请开始输入内容，单独输入exit退出");
       while (true){
           System.out.println("输入内容");
           String a = scan.nextLine();
           if("exit".equals(a)){
               break;
           }
           byte[] data = a.getBytes("UTF-8");
           raf.write(data);
       }
        raf.close();
        System.out.println("再见");
        }
    }

