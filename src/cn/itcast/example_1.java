package cn.itcast;


import java.util.ArrayList;
import java.util.List;

public class example_1 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = str.length()-1; i >= 0; i--){
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 ){
                stringBuffer.append(str.toLowerCase().charAt(i));
            }
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
                stringBuffer.append(str.toUpperCase().charAt(i));
            }
            System.out.println(new Float(22.99));
        }
        int a = 10;
        System.out.println(~a);
        List<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1.getClass());
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                // 1、r-l==0时，说明r和l是同一个位置
                // 2、r-l==1时，说明r和l相邻
                // 3、r-l==2时，说明r和l是某个字符的左右相邻字符
                // 4、l代表某个字符的左扩散，r代表右扩散。
                // 5、l和r是否能插入回文子串需要查看l的下一个与r的上一个字符是否相等
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }
}


