import java.io.File;
//列出某个目录下的所有文件
//列出某个目录下的所有子目录
//判断一个文件或者目录是否存在
public class AllFilesInCatalogue {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator);
        System.out.println(file.exists());
        File[] files = file.listFiles();
        for (File file1 :files){
            if (file1.isFile()){
                System.out.println(file1);
            }
            System.out.println("--------------------------------");
            if (file1.isDirectory()){
                System.out.println(file1);
            }

        }
    }

}
