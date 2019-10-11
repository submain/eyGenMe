import java.io.*;
//写一个程序从一个txt文件中查找出有几个子字符串
public class ReadTxt {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:"+ File.separator+"test.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line=null;
            StringBuffer stringBuffer = new StringBuffer();
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                   stringBuffer.append(line);
            }
            System.out.println(stringBuffer);
            System.out.println(stringBuffer+"字符串中含有"+count(stringBuffer.toString(),"sdf")+"个sdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //统计字符串中某一子串的个数
    public static Integer count(String srcStr ,String subStr){
        if (srcStr==null){
            System.out.println("源字符串为空");
            return 0;
        }
        int count=0;
        int start=0;
        while (srcStr.indexOf(subStr,start)!=-1&&start<=srcStr.length()-1){
            count++;
            start=srcStr.indexOf(subStr,start)+subStr.length();
        }
        return count;

    }
}
