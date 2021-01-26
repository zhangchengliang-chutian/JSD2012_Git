package file;

import java.io.File;

/**
 * 使用File创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录demo
        File dri = new File("./demo");
        if (dri.exists()){
            System.out.println("该目录已存在");
        }else{
            dri.mkdir();//将当前File对象表示的目录创建出来
            System.out.println("该目录已创建");
        }
    }
}
