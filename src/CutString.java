

public class CutString {
    public static void main(String[] args) {
        System.out.println(getCutString("我ABC汉ASC",6));
    }
    //截取字符串
    public static String getCutString(String str,int len){
        if (null==str){
            return "";
        }
        if (len>str.length()){
            len=str.length();
        }
        String subStr ;
        byte [] bytes = str.getBytes();
        if (len<0){
            subStr = new String(bytes,0,-len);
        }else {
            subStr = new String(bytes,0,len);
        }
        return subStr;
    }
}
