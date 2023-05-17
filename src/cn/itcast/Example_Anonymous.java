package cn.itcast;
public class Example_Anonymous {

    class Anonymous implements Super_Anonymous{
        public void shout(){
            System.out.println("I am a anonymous");
        }
    }

    public static void main(String[] args) {
        anonymousShout(new Example_Anonymous().new Anonymous());

        // 匿名内部类实现接口
//        anonymousShout(new Super_Anonymous(){
//            public void shout(){
//                System.out.println("I am Inner Anonymous");
//            }
//        });
    }

    public static void anonymousShout(Super_Anonymous anonymous){
        anonymous.shout();
        System.out.println(anonymous.toString());
    }
}

interface Super_Anonymous{
    void shout();
}
