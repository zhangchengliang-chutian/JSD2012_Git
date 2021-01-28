package exercise;

import java.io.File;
import java.io.FileFilter;

public class Test02 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("s");
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("子项个数："+subs.length);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }



    }
}

//class MyFilter implements FileFilter{
//    String name = file.getName();
//    public boolean accept(File file) {
//        boolean contains = name.contains("s");
//        return contains;
//    }
//}