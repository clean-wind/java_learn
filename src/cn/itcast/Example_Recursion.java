package cn.itcast;

public class Example_Recursion {

    public static void main(String[] args) {
        int sum = getSum(4);
        System.out.println(sum);
        Moon1 moon = Moon1.getMoon();
        Moon1 moon1 = Moon1.getMoon();
        System.out.println(moon == moon1);
    }
    static void func() {
    }
    public static int getSum(int n){
        if (n == 1){
            return 1;
        }
        return getSum(n-1) + n;
    }
}

class Moon1{
    private Moon1(){}
    private static Moon1 moon = new Moon1();
    public static Moon1 getMoon(){
        return  moon;
    }
}

class Moon2{
    private Moon2(){}
    public static final Moon2 MOON_2 = new Moon2();
}