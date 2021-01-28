package exercise;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test03 {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = (file)->file.isFile();//判断是否是文件
            File[] subs = dir.listFiles();
            System.out.println("文件个数："+subs.length);

            for (int i=0;i<subs.length;i++){
                String nameFile = subs[i].getName();//获取所有文件的名字
                int index = nameFile.lastIndexOf(".");//找到最后一个“.”的位置
                String sub = nameFile.substring(0,index);//截取“.”前的文件名
                String ext = nameFile.substring(index);//截取“.”后的文件名
                String copyFileName = sub+"_cp"+ext;
                RandomAccessFile src = new RandomAccessFile(
                        subs[i],"r");
                RandomAccessFile desc = new RandomAccessFile(
                        copyFileName,"rw");
                int d;
                while ((d = src.read())!=-1){
                    desc.write(d);
                }
                System.out.println("复制完毕");
                src.close();
                desc.close();
            }

        }
    }
}
