import javax.management.Query;
import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        String str = "13a65Bc42";
        System.out.println(sortByOn(str));

    }
    //将字符串中的数字按照升序重新排列
    public static String sortByOn(String string){
        if (string==null){
            throw new IllegalArgumentException("字符串对象为null");
        }
        List<Integer> numlist = new ArrayList<Integer>();
        for (int i =0;i<string.length();i++){
            char indexChar = string.charAt(i);
            String indexStr = indexChar+"";
            if (indexStr.matches("\\d")){
                numlist.add(Integer.parseInt(indexStr));
            }
        }
        Collections.sort(numlist);
        Queue<Integer> numQueue = new LinkedList<Integer>(numlist);
        for (int i = 0;i<string.length();i++){
            char indexChar = string.charAt(i);
            String indexStr = indexChar+"";
            if (indexStr.matches("\\d")){
                string= replaceIndex(string,i,(numQueue.poll()+"").charAt(0));
            }
        }
        return string;
    }
    public static String replaceIndex(String str,int i ,char replaceChar){
        if (str==null){
            throw new IllegalArgumentException("字符串对象为null");
        }
        if (i<0||i>str.length()-1){
            throw new IllegalArgumentException("要替换的下标值超出最大下标值");
        }
        String before = str.substring(0,i);
        String after     =str.substring(i+1);
        return before + replaceChar + after;
    }
}
