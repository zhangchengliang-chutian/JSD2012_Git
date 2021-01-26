package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("./demo");
        if (dir.exists()){
            //delete方法删除目录是要求该目录必须是一个空目录才可以
            dir.delete();
            System.out.println("该目录已删除");
        }else{
            System.out.println("该目录不存在");
        }
    }
}
