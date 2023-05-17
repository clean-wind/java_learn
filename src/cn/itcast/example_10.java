package cn.itcast;

public class example_10 {

    public static void main(String[] args) {

        ticket ticket = new ticket();
        new Thread(ticket).start();

        while (true){
            System.out.println("线程main");
        }

    }
}

class ticket implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("线程ticket");
        }
    }
}
