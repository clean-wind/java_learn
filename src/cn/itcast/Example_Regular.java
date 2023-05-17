package cn.itcast;

import java.util.LinkedList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_Regular {
    public static void main(String[] args) {
        String s = "abcacadddffgfc";  //abccba abcba
        Pattern compile = Pattern.compile("(\\w)(\\w)\\1");
        Matcher matcher = compile.matcher(s);
        boolean b = matcher.find();
        String group = matcher.group(0);
        System.out.println(group);
        String[] str = new String[s.length()*s.length()/2];
        int strarr = 0;// str下标
        for (int i = 0;i<= s.length()-1;i++){
            for (int j = i+1; j<= s.length()-1;j++){
                String substring = s.substring(i, j + 1);
                if (substring.equals(new StringBuffer(substring).reverse())){
                    str[strarr] = substring;
                    strarr++;
                }
            }
        }
    }
}
