package cn.itcast;

public class Example_Final {
    final String name = "h";
    void speak(){
        System.out.println(name);
    }
}

class AAA{
    public static void main(String[] args) {
        new Example_Final().speak();
        int a = 10;
        double b = 3.14;
        System.out.println('A'+ a + b);
        System.out.println("ssadgh".indexOf(97));

    }
}