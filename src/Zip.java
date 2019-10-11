

public class Zip {
    public static void main(String[] args) {
        String str = "adssdffgggdhhhxc";
        StringBuffer result = new StringBuffer();
        int num = 1;
        char wordCompare = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (wordCompare == str.charAt(i)) {
                num += 1;
                continue;
            }
            result.append(num).append(wordCompare);
            wordCompare = str.charAt(i);
            num = 1;
            if (i == str.length() - 1) {
                result.append(num).append(wordCompare);
            }

        }
        System.out.println(result);


        String str1 = "qqawwwzz";
        StringBuffer result1 = new StringBuffer();
        char word1 = str1.charAt(0);// 取第一个字符
        int sum = 1;// 连续字符的个数
        for (int i = 1; i < str1.length(); i++) {
            char word2 = str1.charAt(i);    // 循环取字符
            if (word1 == word2) {// 把前一个字符和当前字符比较
                sum++; // 相同的字符 个数加1
                continue;
            }
            result1.append(sum).append(word1); // 拼接字符
            word1 = word2;    // 当前字符变为前一个字符
            sum = 1;// 重置
        }
        System.out.println("字符串压缩后:" + result1.append(sum).append(word1));// 加上最后一个字符及个数，打
    }
}
