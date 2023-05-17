package cn.itcast;

import java.util.function.ObjIntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        Regular r = new Regular();
        Regular r1 = new Regular();

        String a = "aaa";
        String b = new String("bbb");
        Object c = b;
        int i = 1;
        System.out.println(a==b );
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("------");
        // 创建表达式对象
//        Pattern compile = Pattern.compile("\\w+(?<=a)d12");
//        Pattern compile = Pattern.compile("[12]");
//        Pattern compile = Pattern.compile("((\\d)\\2{2}){3}");

        // 创建Matcher对象
//        Matcher matcher = compile.matcher("asdfad12&&234&&cdad12$333999888");

//        boolean matches = matcher.matches(); // 尝试将整个字符序列与该模式匹配
//        boolean b = matcher.find(); // 该方法扫面输入的序列，查找与该模式匹配的下一个子序列
//        while (matcher.find()){
//            System.out.println(matcher.group(0));
//        }


        String content = "13612312312";
        boolean matches = content.matches("1(38|39)\\d{8}");
        System.out.println(matches);
    }
    public static void itcast(String str){

    }
    {
        System.out.println("构造快");
    }
    static class A{
        int a = 1;
        static int aa = 1;
    }

}
